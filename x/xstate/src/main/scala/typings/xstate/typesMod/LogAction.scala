package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  
  var expr: String | (LogExpr[TContext, TEvent]) = js.native
  
  var label: js.UndefOr[String] = js.native
}
object LogAction {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](expr: String | (LogExpr[TContext, TEvent]), `type`: String): LogAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class LogActionMutableBuilder[Self <: LogAction[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (LogAction[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setExpr(value: String | (LogExpr[TContext, TEvent])): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => js.Any): Self = StObject.set(x, "expr", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}

package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogAction[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent]
     with _BaseAction[TContext, TEvent, Any] {
  
  var expr: String | (LogExpr[TContext, TEvent])
  
  var label: js.UndefOr[String] = js.undefined
}
object LogAction {
  
  inline def apply[TContext, TEvent /* <: EventObject */](expr: String | (LogExpr[TContext, TEvent]), `type`: String): LogAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogAction[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (LogAction[TContext, TEvent])) extends AnyVal {
    
    inline def setExpr(value: String | (LogExpr[TContext, TEvent])): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Any): Self = StObject.set(x, "expr", js.Any.fromFunction3(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}

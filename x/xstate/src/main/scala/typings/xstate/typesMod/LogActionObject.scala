package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogActionObject[TContext, TEvent /* <: EventObject */] extends LogAction[TContext, TEvent] {
  
  var value: js.Any = js.native
}
object LogActionObject {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](expr: String | (LogExpr[TContext, TEvent]), `type`: String, value: js.Any): LogActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogActionObject[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class LogActionObjectMutableBuilder[Self <: LogActionObject[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (LogActionObject[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

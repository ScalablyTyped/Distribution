package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogActionObject[TContext, TEvent /* <: EventObject */] extends LogAction[TContext, TEvent] {
  var value: js.Any = js.native
}

object LogActionObject {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](expr: String | (LogExpr[TContext, TEvent]), `type`: String, value: js.Any): LogActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogActionObject[TContext, TEvent]]
  }
  @scala.inline
  implicit class LogActionObjectOps[Self <: LogActionObject[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (LogActionObject[TContext, TEvent])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


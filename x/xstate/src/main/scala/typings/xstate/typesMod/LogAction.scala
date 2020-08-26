package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var expr: String | (LogExpr[TContext, TEvent]) = js.native
  var label: js.UndefOr[String] = js.native
}

object LogAction {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](expr: String | (LogExpr[TContext, TEvent]), `type`: String): LogAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogAction[TContext, TEvent]]
  }
  @scala.inline
  implicit class LogActionOps[Self <: LogAction[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (LogAction[TContext, TEvent])) extends AnyVal {
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
    def setExprFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => js.Any): Self = this.set("expr", js.Any.fromFunction3(value))
    @scala.inline
    def setExpr(value: String | (LogExpr[TContext, TEvent])): Self = this.set("expr", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}


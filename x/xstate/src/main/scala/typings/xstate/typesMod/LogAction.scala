package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var expr: String | (LogExpr[TContext, TEvent])
  var label: js.UndefOr[String] = js.undefined
}

object LogAction {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    expr: String | (LogExpr[TContext, TEvent]),
    `type`: String,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null,
    label: String = null
  ): LogAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogAction[TContext, TEvent]]
  }
}


package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogActionObject[TContext, TEvent /* <: EventObject */] extends LogAction[TContext, TEvent] {
  var value: js.Any
}

object LogActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    expr: String | (LogExpr[TContext, TEvent]),
    `type`: String,
    value: js.Any,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null,
    label: String = null
  ): LogActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogActionObject[TContext, TEvent]]
  }
}


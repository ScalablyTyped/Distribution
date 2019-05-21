package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var delay: js.UndefOr[scala.Double | java.lang.String | (Expr[TContext, TEvent, scala.Double])] = js.undefined
  var event: TEvent | (SendExpr[TContext, TEvent])
  var id: java.lang.String | scala.Double
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object SendAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    event: TEvent | (SendExpr[TContext, TEvent]),
    id: java.lang.String | scala.Double,
    `type`: java.lang.String,
    delay: scala.Double | java.lang.String | (Expr[TContext, TEvent, scala.Double]) = null,
    exec: ActionFunction[TContext, TEvent] = null,
    to: java.lang.String = null
  ): SendAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SendAction[TContext, TEvent]]
  }
}


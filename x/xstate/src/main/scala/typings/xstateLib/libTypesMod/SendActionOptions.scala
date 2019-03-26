package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendActionOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: js.UndefOr[scala.Double | (Expr[TContext, TEvent, scala.Double])] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object SendActionOptions {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    delay: scala.Double | (Expr[TContext, TEvent, scala.Double]) = null,
    id: java.lang.String | scala.Double = null,
    to: java.lang.String = null
  ): SendActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SendActionOptions[TContext, TEvent]]
  }
}


package typings
package webcolaLib.distSrcLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var alpha: scala.Double
  var listener: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var stress: js.UndefOr[scala.Double] = js.undefined
  var `type`: EventType
}

object Event {
  @scala.inline
  def apply(
    alpha: scala.Double,
    `type`: EventType,
    listener: js.Function0[scala.Unit] = null,
    stress: scala.Int | scala.Double = null
  ): Event = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("alpha")(alpha)
    if (listener != null) __obj.updateDynamic("listener")(listener)
    if (stress != null) __obj.updateDynamic("stress")(stress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}


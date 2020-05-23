package typings.webcola.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var alpha: Double
  var listener: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stress: js.UndefOr[Double] = js.undefined
  var `type`: EventType
}

object Event {
  @scala.inline
  def apply(
    alpha: Double,
    `type`: EventType,
    listener: () => Unit = null,
    stress: js.UndefOr[Double] = js.undefined
  ): Event = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(js.Any.fromFunction0(listener))
    if (!js.isUndefined(stress)) __obj.updateDynamic("stress")(stress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}


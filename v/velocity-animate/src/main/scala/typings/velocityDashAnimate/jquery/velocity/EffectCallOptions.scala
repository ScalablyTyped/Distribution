package typings.velocityDashAnimate.jquery.velocity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectCallOptions extends js.Object {
  var delay: js.UndefOr[js.Any] = js.undefined
  var easing: js.UndefOr[js.Any] = js.undefined
}

object EffectCallOptions {
  @scala.inline
  def apply(delay: js.Any = null, easing: js.Any = null): EffectCallOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[EffectCallOptions]
  }
}


package typings
package velocityDashAnimateLib.jqueryNs.velocityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterEffectOptions extends js.Object {
  var calls: js.Array[EffectCall]
  var defaultDuration: js.UndefOr[scala.Double] = js.undefined
  var reset: js.UndefOr[js.Object] = js.undefined
}

object RegisterEffectOptions {
  @scala.inline
  def apply(
    calls: js.Array[EffectCall],
    defaultDuration: scala.Int | scala.Double = null,
    reset: js.Object = null
  ): RegisterEffectOptions = {
    val __obj = js.Dynamic.literal(calls = calls)
    if (defaultDuration != null) __obj.updateDynamic("defaultDuration")(defaultDuration.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[RegisterEffectOptions]
  }
}


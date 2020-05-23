package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitAlertOptions extends js.Object {
  var animation: js.UndefOr[Boolean | String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var `sel-close`: js.UndefOr[String] = js.undefined
}

object UIkitAlertOptions {
  @scala.inline
  def apply(
    animation: Boolean | String = null,
    duration: js.UndefOr[Double] = js.undefined,
    `sel-close`: String = null
  ): UIkitAlertOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (`sel-close` != null) __obj.updateDynamic("sel-close")(`sel-close`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitAlertOptions]
  }
}


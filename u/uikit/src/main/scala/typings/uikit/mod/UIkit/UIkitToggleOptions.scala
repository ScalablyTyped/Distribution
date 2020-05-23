package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitToggleOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var cls: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var media: js.UndefOr[Double | String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var queued: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object UIkitToggleOptions {
  @scala.inline
  def apply(
    animation: String = null,
    cls: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    media: Double | String = null,
    mode: String = null,
    queued: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): UIkitToggleOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitToggleOptions]
  }
}


package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitStickyOptions extends js.Object {
  var animation: js.UndefOr[String | Boolean] = js.undefined
  var bottom: js.UndefOr[Boolean | String] = js.undefined
  var `cls-active`: js.UndefOr[String] = js.undefined
  var `cls-inactive`: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[Double | String | Boolean] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var `show-on-up`: js.UndefOr[Boolean] = js.undefined
  var `target-offset`: js.UndefOr[Boolean | Double] = js.undefined
  var top: js.UndefOr[Double | String] = js.undefined
  var `width-element`: js.UndefOr[String | Boolean] = js.undefined
}

object UIkitStickyOptions {
  @scala.inline
  def apply(
    animation: String | Boolean = null,
    bottom: Boolean | String = null,
    `cls-active`: String = null,
    `cls-inactive`: String = null,
    media: Double | String | Boolean = null,
    offset: Double | String = null,
    `show-on-up`: js.UndefOr[Boolean] = js.undefined,
    `target-offset`: Boolean | Double = null,
    top: Double | String = null,
    `width-element`: String | Boolean = null
  ): UIkitStickyOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (`cls-active` != null) __obj.updateDynamic("cls-active")(`cls-active`.asInstanceOf[js.Any])
    if (`cls-inactive` != null) __obj.updateDynamic("cls-inactive")(`cls-inactive`.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(`show-on-up`)) __obj.updateDynamic("show-on-up")(`show-on-up`.asInstanceOf[js.Any])
    if (`target-offset` != null) __obj.updateDynamic("target-offset")(`target-offset`.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`width-element` != null) __obj.updateDynamic("width-element")(`width-element`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitStickyOptions]
  }
}


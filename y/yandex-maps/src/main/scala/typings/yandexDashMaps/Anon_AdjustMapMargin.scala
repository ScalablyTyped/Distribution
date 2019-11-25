package typings.yandexDashMaps

import typings.yandexDashMaps.yandexDashMapsStrings.auto
import typings.yandexDashMaps.yandexDashMapsStrings.large
import typings.yandexDashMaps.yandexDashMapsStrings.left
import typings.yandexDashMaps.yandexDashMapsStrings.medium
import typings.yandexDashMaps.yandexDashMapsStrings.none
import typings.yandexDashMaps.yandexDashMapsStrings.right
import typings.yandexDashMaps.yandexDashMapsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustMapMargin extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  var collapseOnBlur: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var popupAnimate: js.UndefOr[Boolean] = js.undefined
  var popupFloat: js.UndefOr[auto | left | right] = js.undefined
  var popupWidth: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Anon_Bottom] = js.undefined
  var size: js.UndefOr[auto | small | medium | large] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Anon_AdjustMapMargin {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    collapseOnBlur: js.UndefOr[Boolean] = js.undefined,
    float: none | left | right = null,
    floatIndex: Int | Double = null,
    popupAnimate: js.UndefOr[Boolean] = js.undefined,
    popupFloat: auto | left | right = null,
    popupWidth: String = null,
    position: Anon_Bottom = null,
    size: auto | small | medium | large = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Anon_AdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseOnBlur)) __obj.updateDynamic("collapseOnBlur")(collapseOnBlur.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(popupAnimate)) __obj.updateDynamic("popupAnimate")(popupAnimate.asInstanceOf[js.Any])
    if (popupFloat != null) __obj.updateDynamic("popupFloat")(popupFloat.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdjustMapMargin]
  }
}


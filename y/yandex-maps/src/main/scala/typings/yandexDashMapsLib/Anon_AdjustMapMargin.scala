package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustMapMargin extends js.Object {
  var adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  var collapseOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  var float: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right
  ] = js.undefined
  var floatIndex: js.UndefOr[scala.Double] = js.undefined
  var popupAnimate: js.UndefOr[scala.Boolean] = js.undefined
  var popupFloat: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right
  ] = js.undefined
  var popupWidth: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[Anon_Bottom] = js.undefined
  var size: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.small | yandexDashMapsLib.yandexDashMapsLibStrings.medium | yandexDashMapsLib.yandexDashMapsLibStrings.large
  ] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AdjustMapMargin {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined,
    collapseOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    float: yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right = null,
    floatIndex: scala.Int | scala.Double = null,
    popupAnimate: js.UndefOr[scala.Boolean] = js.undefined,
    popupFloat: yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right = null,
    popupWidth: java.lang.String = null,
    position: Anon_Bottom = null,
    size: yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.small | yandexDashMapsLib.yandexDashMapsLibStrings.medium | yandexDashMapsLib.yandexDashMapsLibStrings.large = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin)
    if (!js.isUndefined(collapseOnBlur)) __obj.updateDynamic("collapseOnBlur")(collapseOnBlur)
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(popupAnimate)) __obj.updateDynamic("popupAnimate")(popupAnimate)
    if (popupFloat != null) __obj.updateDynamic("popupFloat")(popupFloat.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth)
    if (position != null) __obj.updateDynamic("position")(position)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_AdjustMapMargin]
  }
}


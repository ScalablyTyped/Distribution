package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseButtonParametersOptions extends js.Object {
  var adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  var float: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right
  ] = js.undefined
  var floatIndex: js.UndefOr[scala.Double] = js.undefined
  var layout: js.UndefOr[
    yandexDashMapsLib.ymapsNs.IClassConstructor[yandexDashMapsLib.ymapsNs.ISelectableControlLayout] | java.lang.String
  ] = js.undefined
  var maxWidth: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double] = js.undefined
  var position: js.UndefOr[yandexDashMapsLib.Anon_Bottom] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object IBaseButtonParametersOptions {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined,
    float: yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right = null,
    floatIndex: scala.Int | scala.Double = null,
    layout: yandexDashMapsLib.ymapsNs.IClassConstructor[yandexDashMapsLib.ymapsNs.ISelectableControlLayout] | java.lang.String = null,
    maxWidth: js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double = null,
    position: yandexDashMapsLib.Anon_Bottom = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): IBaseButtonParametersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin)
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IBaseButtonParametersOptions]
  }
}


package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.Anon_Bottom
import typings.yandexDashMaps.yandexDashMapsMod.IClassConstructor
import typings.yandexDashMaps.yandexDashMapsMod.ISelectableControlLayout
import typings.yandexDashMaps.yandexDashMapsStrings.left
import typings.yandexDashMaps.yandexDashMapsStrings.none
import typings.yandexDashMaps.yandexDashMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseButtonParametersOptions extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.undefined
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  var position: js.UndefOr[Anon_Bottom] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IBaseButtonParametersOptions {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    float: none | left | right = null,
    floatIndex: Int | Double = null,
    layout: IClassConstructor[ISelectableControlLayout] | String = null,
    maxWidth: (js.Array[js.Array[Double] | Double]) | Double = null,
    position: Anon_Bottom = null,
    visible: js.UndefOr[Boolean] = js.undefined
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


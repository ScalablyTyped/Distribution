package typings.yandexMaps

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.ISelectableControlLayout
import typings.yandexMaps.yandexMapsStrings.left
import typings.yandexMaps.yandexMapsStrings.none
import typings.yandexMaps.yandexMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined yandex-maps.yandex-maps.control.IBaseButtonParametersOptions & {  noPlacemark ? :boolean} */
trait IBaseButtonParametersOptiFloat extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.undefined
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  var noPlacemark: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[AnonBottom] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IBaseButtonParametersOptiFloat {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    float: none | left | right = null,
    floatIndex: Int | Double = null,
    layout: IClassConstructor[ISelectableControlLayout] | String = null,
    maxWidth: (js.Array[js.Array[Double] | Double]) | Double = null,
    noPlacemark: js.UndefOr[Boolean] = js.undefined,
    position: AnonBottom = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IBaseButtonParametersOptiFloat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlacemark)) __obj.updateDynamic("noPlacemark")(noPlacemark.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseButtonParametersOptiFloat]
  }
}


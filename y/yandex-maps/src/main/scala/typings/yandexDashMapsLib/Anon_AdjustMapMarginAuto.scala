package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustMapMarginAuto extends js.Object {
  var adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  var boundedBy: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var fitMaxWidth: js.UndefOr[scala.Boolean] = js.undefined
  var float: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right
  ] = js.undefined
  var floatIndex: js.UndefOr[scala.Double] = js.undefined
  var formLayout: js.UndefOr[
    java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ILayout]
  ] = js.undefined
  var kind: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.house | yandexDashMapsLib.yandexDashMapsLibStrings.street | yandexDashMapsLib.yandexDashMapsLibStrings.metro | yandexDashMapsLib.yandexDashMapsLibStrings.district | yandexDashMapsLib.yandexDashMapsLibStrings.locality
  ] = js.undefined
  var layout: js.UndefOr[
    java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISearchControlLayout]
  ] = js.undefined
  var maxWidth: js.UndefOr[(js.Array[js.Array[scala.Double] | scala.Double]) | scala.Double] = js.undefined
  var noCentering: js.UndefOr[scala.Boolean] = js.undefined
  var noPlacemark: js.UndefOr[scala.Boolean] = js.undefined
  var noPopup: js.UndefOr[scala.Boolean] = js.undefined
  var noSelect: js.UndefOr[scala.Boolean] = js.undefined
  var noSuggestPanel: js.UndefOr[scala.Boolean] = js.undefined
  var placeholderContent: js.UndefOr[java.lang.String] = js.undefined
  var popupItemLayout: js.UndefOr[
    java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ILayout]
  ] = js.undefined
  var popupLayout: js.UndefOr[
    java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ILayout]
  ] = js.undefined
  var position: js.UndefOr[Anon_Bottom] = js.undefined
  var provider: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsMod.IGeocodeProvider | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#map` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#search`
  ] = js.undefined
  var searchCoordOrder: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.latlong | yandexDashMapsLib.yandexDashMapsLibStrings.longlat
  ] = js.undefined
  var size: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.small | yandexDashMapsLib.yandexDashMapsLibStrings.medium | yandexDashMapsLib.yandexDashMapsLibStrings.large
  ] = js.undefined
  var strictBounds: js.UndefOr[scala.Boolean] = js.undefined
  var suppressYandexSearch: js.UndefOr[scala.Boolean] = js.undefined
  var useMapBounds: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zoomMargin: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AdjustMapMarginAuto {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined,
    boundedBy: js.Array[js.Array[scala.Double]] = null,
    fitMaxWidth: js.UndefOr[scala.Boolean] = js.undefined,
    float: yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right = null,
    floatIndex: scala.Int | scala.Double = null,
    formLayout: java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ILayout] = null,
    kind: yandexDashMapsLib.yandexDashMapsLibStrings.house | yandexDashMapsLib.yandexDashMapsLibStrings.street | yandexDashMapsLib.yandexDashMapsLibStrings.metro | yandexDashMapsLib.yandexDashMapsLibStrings.district | yandexDashMapsLib.yandexDashMapsLibStrings.locality = null,
    layout: java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISearchControlLayout] = null,
    maxWidth: (js.Array[js.Array[scala.Double] | scala.Double]) | scala.Double = null,
    noCentering: js.UndefOr[scala.Boolean] = js.undefined,
    noPlacemark: js.UndefOr[scala.Boolean] = js.undefined,
    noPopup: js.UndefOr[scala.Boolean] = js.undefined,
    noSelect: js.UndefOr[scala.Boolean] = js.undefined,
    noSuggestPanel: js.UndefOr[scala.Boolean] = js.undefined,
    placeholderContent: java.lang.String = null,
    popupItemLayout: java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ILayout] = null,
    popupLayout: java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ILayout] = null,
    position: Anon_Bottom = null,
    provider: yandexDashMapsLib.yandexDashMapsMod.IGeocodeProvider | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#map` | yandexDashMapsLib.yandexDashMapsLibStrings.`yandex#search` = null,
    searchCoordOrder: yandexDashMapsLib.yandexDashMapsLibStrings.latlong | yandexDashMapsLib.yandexDashMapsLibStrings.longlat = null,
    size: yandexDashMapsLib.yandexDashMapsLibStrings.auto | yandexDashMapsLib.yandexDashMapsLibStrings.small | yandexDashMapsLib.yandexDashMapsLibStrings.medium | yandexDashMapsLib.yandexDashMapsLibStrings.large = null,
    strictBounds: js.UndefOr[scala.Boolean] = js.undefined,
    suppressYandexSearch: js.UndefOr[scala.Boolean] = js.undefined,
    useMapBounds: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zoomMargin: scala.Int | scala.Double = null
  ): Anon_AdjustMapMarginAuto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin)
    if (boundedBy != null) __obj.updateDynamic("boundedBy")(boundedBy)
    if (!js.isUndefined(fitMaxWidth)) __obj.updateDynamic("fitMaxWidth")(fitMaxWidth)
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (formLayout != null) __obj.updateDynamic("formLayout")(formLayout.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noCentering)) __obj.updateDynamic("noCentering")(noCentering)
    if (!js.isUndefined(noPlacemark)) __obj.updateDynamic("noPlacemark")(noPlacemark)
    if (!js.isUndefined(noPopup)) __obj.updateDynamic("noPopup")(noPopup)
    if (!js.isUndefined(noSelect)) __obj.updateDynamic("noSelect")(noSelect)
    if (!js.isUndefined(noSuggestPanel)) __obj.updateDynamic("noSuggestPanel")(noSuggestPanel)
    if (placeholderContent != null) __obj.updateDynamic("placeholderContent")(placeholderContent)
    if (popupItemLayout != null) __obj.updateDynamic("popupItemLayout")(popupItemLayout.asInstanceOf[js.Any])
    if (popupLayout != null) __obj.updateDynamic("popupLayout")(popupLayout.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (searchCoordOrder != null) __obj.updateDynamic("searchCoordOrder")(searchCoordOrder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds)
    if (!js.isUndefined(suppressYandexSearch)) __obj.updateDynamic("suppressYandexSearch")(suppressYandexSearch)
    if (!js.isUndefined(useMapBounds)) __obj.updateDynamic("useMapBounds")(useMapBounds)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdjustMapMarginAuto]
  }
}


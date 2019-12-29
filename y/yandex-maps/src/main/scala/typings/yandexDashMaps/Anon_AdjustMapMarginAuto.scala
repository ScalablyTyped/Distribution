package typings.yandexDashMaps

import typings.yandexDashMaps.yandexDashMapsMod.IClassConstructor
import typings.yandexDashMaps.yandexDashMapsMod.IGeocodeProvider
import typings.yandexDashMaps.yandexDashMapsMod.ILayout
import typings.yandexDashMaps.yandexDashMapsMod.ISearchControlLayout
import typings.yandexDashMaps.yandexDashMapsStrings.auto
import typings.yandexDashMaps.yandexDashMapsStrings.district
import typings.yandexDashMaps.yandexDashMapsStrings.house
import typings.yandexDashMaps.yandexDashMapsStrings.large
import typings.yandexDashMaps.yandexDashMapsStrings.latlong
import typings.yandexDashMaps.yandexDashMapsStrings.left
import typings.yandexDashMaps.yandexDashMapsStrings.locality
import typings.yandexDashMaps.yandexDashMapsStrings.longlat
import typings.yandexDashMaps.yandexDashMapsStrings.medium
import typings.yandexDashMaps.yandexDashMapsStrings.metro
import typings.yandexDashMaps.yandexDashMapsStrings.none
import typings.yandexDashMaps.yandexDashMapsStrings.right
import typings.yandexDashMaps.yandexDashMapsStrings.small
import typings.yandexDashMaps.yandexDashMapsStrings.street
import typings.yandexDashMaps.yandexDashMapsStrings.yandexNumbersignmap
import typings.yandexDashMaps.yandexDashMapsStrings.yandexNumbersignsearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustMapMarginAuto extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var fitMaxWidth: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[none | left | right] = js.undefined
  var floatIndex: js.UndefOr[Double] = js.undefined
  var formLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var kind: js.UndefOr[house | street | metro | district | locality] = js.undefined
  var layout: js.UndefOr[String | IClassConstructor[ISearchControlLayout]] = js.undefined
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  var noCentering: js.UndefOr[Boolean] = js.undefined
  var noPlacemark: js.UndefOr[Boolean] = js.undefined
  var noPopup: js.UndefOr[Boolean] = js.undefined
  var noSelect: js.UndefOr[Boolean] = js.undefined
  var noSuggestPanel: js.UndefOr[Boolean] = js.undefined
  var placeholderContent: js.UndefOr[String] = js.undefined
  var popupItemLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var popupLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  var position: js.UndefOr[Anon_Bottom] = js.undefined
  var provider: js.UndefOr[IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch] = js.undefined
  var searchCoordOrder: js.UndefOr[latlong | longlat] = js.undefined
  var size: js.UndefOr[auto | small | medium | large] = js.undefined
  var strictBounds: js.UndefOr[Boolean] = js.undefined
  var suppressYandexSearch: js.UndefOr[Boolean] = js.undefined
  var useMapBounds: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zoomMargin: js.UndefOr[Double] = js.undefined
}

object Anon_AdjustMapMarginAuto {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    boundedBy: js.Array[js.Array[Double]] = null,
    fitMaxWidth: js.UndefOr[Boolean] = js.undefined,
    float: none | left | right = null,
    floatIndex: Int | Double = null,
    formLayout: String | IClassConstructor[ILayout] = null,
    kind: house | street | metro | district | locality = null,
    layout: String | IClassConstructor[ISearchControlLayout] = null,
    maxWidth: (js.Array[js.Array[Double] | Double]) | Double = null,
    noCentering: js.UndefOr[Boolean] = js.undefined,
    noPlacemark: js.UndefOr[Boolean] = js.undefined,
    noPopup: js.UndefOr[Boolean] = js.undefined,
    noSelect: js.UndefOr[Boolean] = js.undefined,
    noSuggestPanel: js.UndefOr[Boolean] = js.undefined,
    placeholderContent: String = null,
    popupItemLayout: String | IClassConstructor[ILayout] = null,
    popupLayout: String | IClassConstructor[ILayout] = null,
    position: Anon_Bottom = null,
    provider: IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch = null,
    searchCoordOrder: latlong | longlat = null,
    size: auto | small | medium | large = null,
    strictBounds: js.UndefOr[Boolean] = js.undefined,
    suppressYandexSearch: js.UndefOr[Boolean] = js.undefined,
    useMapBounds: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoomMargin: Int | Double = null
  ): Anon_AdjustMapMarginAuto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin.asInstanceOf[js.Any])
    if (boundedBy != null) __obj.updateDynamic("boundedBy")(boundedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(fitMaxWidth)) __obj.updateDynamic("fitMaxWidth")(fitMaxWidth.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (floatIndex != null) __obj.updateDynamic("floatIndex")(floatIndex.asInstanceOf[js.Any])
    if (formLayout != null) __obj.updateDynamic("formLayout")(formLayout.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noCentering)) __obj.updateDynamic("noCentering")(noCentering.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlacemark)) __obj.updateDynamic("noPlacemark")(noPlacemark.asInstanceOf[js.Any])
    if (!js.isUndefined(noPopup)) __obj.updateDynamic("noPopup")(noPopup.asInstanceOf[js.Any])
    if (!js.isUndefined(noSelect)) __obj.updateDynamic("noSelect")(noSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(noSuggestPanel)) __obj.updateDynamic("noSuggestPanel")(noSuggestPanel.asInstanceOf[js.Any])
    if (placeholderContent != null) __obj.updateDynamic("placeholderContent")(placeholderContent.asInstanceOf[js.Any])
    if (popupItemLayout != null) __obj.updateDynamic("popupItemLayout")(popupItemLayout.asInstanceOf[js.Any])
    if (popupLayout != null) __obj.updateDynamic("popupLayout")(popupLayout.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (searchCoordOrder != null) __obj.updateDynamic("searchCoordOrder")(searchCoordOrder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressYandexSearch)) __obj.updateDynamic("suppressYandexSearch")(suppressYandexSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapBounds)) __obj.updateDynamic("useMapBounds")(useMapBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdjustMapMarginAuto]
  }
}


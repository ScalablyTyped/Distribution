package typings.yandexMaps.anon

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.IGeocodeProvider
import typings.yandexMaps.mod.ILayout
import typings.yandexMaps.mod.ISearchControlLayout
import typings.yandexMaps.yandexMapsStrings.auto
import typings.yandexMaps.yandexMapsStrings.district
import typings.yandexMaps.yandexMapsStrings.house
import typings.yandexMaps.yandexMapsStrings.large
import typings.yandexMaps.yandexMapsStrings.latlong
import typings.yandexMaps.yandexMapsStrings.left
import typings.yandexMaps.yandexMapsStrings.locality
import typings.yandexMaps.yandexMapsStrings.longlat
import typings.yandexMaps.yandexMapsStrings.medium
import typings.yandexMaps.yandexMapsStrings.metro
import typings.yandexMaps.yandexMapsStrings.none
import typings.yandexMaps.yandexMapsStrings.right
import typings.yandexMaps.yandexMapsStrings.small
import typings.yandexMaps.yandexMapsStrings.street
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignmap
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignsearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundedBy extends js.Object {
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
  var position: js.UndefOr[Bottom] = js.undefined
  var provider: js.UndefOr[IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch] = js.undefined
  var searchCoordOrder: js.UndefOr[latlong | longlat] = js.undefined
  var size: js.UndefOr[auto | small | medium | large] = js.undefined
  var strictBounds: js.UndefOr[Boolean] = js.undefined
  var suppressYandexSearch: js.UndefOr[Boolean] = js.undefined
  var useMapBounds: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zoomMargin: js.UndefOr[Double] = js.undefined
}

object BoundedBy {
  @scala.inline
  def apply(
    adjustMapMargin: js.UndefOr[Boolean] = js.undefined,
    boundedBy: js.Array[js.Array[Double]] = null,
    fitMaxWidth: js.UndefOr[Boolean] = js.undefined,
    float: none | left | right = null,
    floatIndex: js.UndefOr[Double] = js.undefined,
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
    position: Bottom = null,
    provider: IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch = null,
    searchCoordOrder: latlong | longlat = null,
    size: auto | small | medium | large = null,
    strictBounds: js.UndefOr[Boolean] = js.undefined,
    suppressYandexSearch: js.UndefOr[Boolean] = js.undefined,
    useMapBounds: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoomMargin: js.UndefOr[Double] = js.undefined
  ): BoundedBy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustMapMargin)) __obj.updateDynamic("adjustMapMargin")(adjustMapMargin.get.asInstanceOf[js.Any])
    if (boundedBy != null) __obj.updateDynamic("boundedBy")(boundedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(fitMaxWidth)) __obj.updateDynamic("fitMaxWidth")(fitMaxWidth.get.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (!js.isUndefined(floatIndex)) __obj.updateDynamic("floatIndex")(floatIndex.get.asInstanceOf[js.Any])
    if (formLayout != null) __obj.updateDynamic("formLayout")(formLayout.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noCentering)) __obj.updateDynamic("noCentering")(noCentering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlacemark)) __obj.updateDynamic("noPlacemark")(noPlacemark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noPopup)) __obj.updateDynamic("noPopup")(noPopup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSelect)) __obj.updateDynamic("noSelect")(noSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSuggestPanel)) __obj.updateDynamic("noSuggestPanel")(noSuggestPanel.get.asInstanceOf[js.Any])
    if (placeholderContent != null) __obj.updateDynamic("placeholderContent")(placeholderContent.asInstanceOf[js.Any])
    if (popupItemLayout != null) __obj.updateDynamic("popupItemLayout")(popupItemLayout.asInstanceOf[js.Any])
    if (popupLayout != null) __obj.updateDynamic("popupLayout")(popupLayout.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (searchCoordOrder != null) __obj.updateDynamic("searchCoordOrder")(searchCoordOrder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressYandexSearch)) __obj.updateDynamic("suppressYandexSearch")(suppressYandexSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapBounds)) __obj.updateDynamic("useMapBounds")(useMapBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomMargin)) __obj.updateDynamic("zoomMargin")(zoomMargin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundedBy]
  }
}


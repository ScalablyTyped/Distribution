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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundedBy extends js.Object {
  var adjustMapMargin: js.UndefOr[Boolean] = js.native
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var fitMaxWidth: js.UndefOr[Boolean] = js.native
  var float: js.UndefOr[none | left | right] = js.native
  var floatIndex: js.UndefOr[Double] = js.native
  var formLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var kind: js.UndefOr[house | street | metro | district | locality] = js.native
  var layout: js.UndefOr[String | IClassConstructor[ISearchControlLayout]] = js.native
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  var noCentering: js.UndefOr[Boolean] = js.native
  var noPlacemark: js.UndefOr[Boolean] = js.native
  var noPopup: js.UndefOr[Boolean] = js.native
  var noSelect: js.UndefOr[Boolean] = js.native
  var noSuggestPanel: js.UndefOr[Boolean] = js.native
  var placeholderContent: js.UndefOr[String] = js.native
  var popupItemLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var popupLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var position: js.UndefOr[Bottom] = js.native
  var provider: js.UndefOr[IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch] = js.native
  var searchCoordOrder: js.UndefOr[latlong | longlat] = js.native
  var size: js.UndefOr[auto | small | medium | large] = js.native
  var strictBounds: js.UndefOr[Boolean] = js.native
  var suppressYandexSearch: js.UndefOr[Boolean] = js.native
  var useMapBounds: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zoomMargin: js.UndefOr[Double] = js.native
}

object BoundedBy {
  @scala.inline
  def apply(): BoundedBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundedBy]
  }
  @scala.inline
  implicit class BoundedByOps[Self <: BoundedBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjustMapMargin(value: Boolean): Self = this.set("adjustMapMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustMapMargin: Self = this.set("adjustMapMargin", js.undefined)
    @scala.inline
    def setBoundedByVarargs(value: js.Array[Double]*): Self = this.set("boundedBy", js.Array(value :_*))
    @scala.inline
    def setBoundedBy(value: js.Array[js.Array[Double]]): Self = this.set("boundedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundedBy: Self = this.set("boundedBy", js.undefined)
    @scala.inline
    def setFitMaxWidth(value: Boolean): Self = this.set("fitMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitMaxWidth: Self = this.set("fitMaxWidth", js.undefined)
    @scala.inline
    def setFloat(value: none | left | right): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setFloatIndex(value: Double): Self = this.set("floatIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatIndex: Self = this.set("floatIndex", js.undefined)
    @scala.inline
    def setFormLayout(value: String | IClassConstructor[ILayout]): Self = this.set("formLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormLayout: Self = this.set("formLayout", js.undefined)
    @scala.inline
    def setKind(value: house | street | metro | district | locality): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLayout(value: String | IClassConstructor[ISearchControlLayout]): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMaxWidthVarargs(value: (js.Array[Double] | Double)*): Self = this.set("maxWidth", js.Array(value :_*))
    @scala.inline
    def setMaxWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setNoCentering(value: Boolean): Self = this.set("noCentering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCentering: Self = this.set("noCentering", js.undefined)
    @scala.inline
    def setNoPlacemark(value: Boolean): Self = this.set("noPlacemark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoPlacemark: Self = this.set("noPlacemark", js.undefined)
    @scala.inline
    def setNoPopup(value: Boolean): Self = this.set("noPopup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoPopup: Self = this.set("noPopup", js.undefined)
    @scala.inline
    def setNoSelect(value: Boolean): Self = this.set("noSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSelect: Self = this.set("noSelect", js.undefined)
    @scala.inline
    def setNoSuggestPanel(value: Boolean): Self = this.set("noSuggestPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSuggestPanel: Self = this.set("noSuggestPanel", js.undefined)
    @scala.inline
    def setPlaceholderContent(value: String): Self = this.set("placeholderContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderContent: Self = this.set("placeholderContent", js.undefined)
    @scala.inline
    def setPopupItemLayout(value: String | IClassConstructor[ILayout]): Self = this.set("popupItemLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupItemLayout: Self = this.set("popupItemLayout", js.undefined)
    @scala.inline
    def setPopupLayout(value: String | IClassConstructor[ILayout]): Self = this.set("popupLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupLayout: Self = this.set("popupLayout", js.undefined)
    @scala.inline
    def setPosition(value: Bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setProvider(value: IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setSearchCoordOrder(value: latlong | longlat): Self = this.set("searchCoordOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchCoordOrder: Self = this.set("searchCoordOrder", js.undefined)
    @scala.inline
    def setSize(value: auto | small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStrictBounds(value: Boolean): Self = this.set("strictBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictBounds: Self = this.set("strictBounds", js.undefined)
    @scala.inline
    def setSuppressYandexSearch(value: Boolean): Self = this.set("suppressYandexSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressYandexSearch: Self = this.set("suppressYandexSearch", js.undefined)
    @scala.inline
    def setUseMapBounds(value: Boolean): Self = this.set("useMapBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMapBounds: Self = this.set("useMapBounds", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZoomMargin(value: Double): Self = this.set("zoomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomMargin: Self = this.set("zoomMargin", js.undefined)
  }
  
}


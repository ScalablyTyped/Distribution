package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pivotConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.native
  var borderless: js.UndefOr[Boolean] = js.native
  var columnWidth: js.UndefOr[Double] = js.native
  var container: js.UndefOr[String | HTMLElement] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[String | js.Array[_]] = js.native
  var datatable: js.UndefOr[js.Any] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultOperation: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var externalProcessing: js.UndefOr[Boolean] = js.native
  var fieldMap: js.UndefOr[js.Any] = js.native
  var filterLabelAlign: js.UndefOr[String] = js.native
  var filterLabelWidth: js.UndefOr[Double] = js.native
  var filterMap: js.UndefOr[js.Any] = js.native
  var filterMinWidth: js.UndefOr[Double] = js.native
  var filterPlaceholder: js.UndefOr[Boolean | String] = js.native
  var filterWidth: js.UndefOr[Double] = js.native
  var footer: js.UndefOr[String | Boolean] = js.native
  var format: js.UndefOr[WebixCallback] = js.native
  var gravity: js.UndefOr[Double] = js.native
  var headerTemplate: js.UndefOr[WebixCallback] = js.native
  var height: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var max: js.UndefOr[Boolean] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Boolean] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var on: js.UndefOr[EventHash] = js.native
  var padding: js.UndefOr[js.Any] = js.native
  var paddingX: js.UndefOr[Double] = js.native
  var paddingY: js.UndefOr[Double] = js.native
  var ping: js.UndefOr[WebixCallback] = js.native
  var popup: js.UndefOr[js.Any] = js.native
  var profile: js.UndefOr[Boolean] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var readonlyTitle: js.UndefOr[String] = js.native
  var ready: js.UndefOr[WebixCallback] = js.native
  var removeMissed: js.UndefOr[Boolean] = js.native
  var scheme: js.UndefOr[js.Any] = js.native
  var separateLabel: js.UndefOr[Boolean] = js.native
  var stableRowId: js.UndefOr[Boolean] = js.native
  var structure: js.UndefOr[js.Any] = js.native
  var totalColumn: js.UndefOr[String | Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[js.Any] = js.native
  var view: js.UndefOr[String] = js.native
  var webWorker: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var yScaleWidth: js.UndefOr[Double] = js.native
}

object pivotConfig {
  @scala.inline
  def apply(): pivotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pivotConfig]
  }
  @scala.inline
  implicit class pivotConfigOps[Self <: pivotConfig] (val x: Self) extends AnyVal {
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
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: String | js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatatable(value: js.Any): Self = this.set("datatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatable: Self = this.set("datatable", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDefaultOperation(value: String): Self = this.set("defaultOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOperation: Self = this.set("defaultOperation", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExternalProcessing(value: Boolean): Self = this.set("externalProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalProcessing: Self = this.set("externalProcessing", js.undefined)
    @scala.inline
    def setFieldMap(value: js.Any): Self = this.set("fieldMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldMap: Self = this.set("fieldMap", js.undefined)
    @scala.inline
    def setFilterLabelAlign(value: String): Self = this.set("filterLabelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterLabelAlign: Self = this.set("filterLabelAlign", js.undefined)
    @scala.inline
    def setFilterLabelWidth(value: Double): Self = this.set("filterLabelWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterLabelWidth: Self = this.set("filterLabelWidth", js.undefined)
    @scala.inline
    def setFilterMap(value: js.Any): Self = this.set("filterMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMap: Self = this.set("filterMap", js.undefined)
    @scala.inline
    def setFilterMinWidth(value: Double): Self = this.set("filterMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMinWidth: Self = this.set("filterMinWidth", js.undefined)
    @scala.inline
    def setFilterPlaceholder(value: Boolean | String): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    @scala.inline
    def setFilterWidth(value: Double): Self = this.set("filterWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterWidth: Self = this.set("filterWidth", js.undefined)
    @scala.inline
    def setFooter(value: String | Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFormat(value: /* repeated */ js.Any => js.Any): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: /* repeated */ js.Any => js.Any): Self = this.set("headerTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMax(value: Boolean): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMin(value: Boolean): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingX(value: Double): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    @scala.inline
    def setPaddingY(value: Double): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    @scala.inline
    def setPing(value: /* repeated */ js.Any => js.Any): Self = this.set("ping", js.Any.fromFunction1(value))
    @scala.inline
    def deletePing: Self = this.set("ping", js.undefined)
    @scala.inline
    def setPopup(value: js.Any): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setProfile(value: Boolean): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setReadonlyTitle(value: String): Self = this.set("readonlyTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonlyTitle: Self = this.set("readonlyTitle", js.undefined)
    @scala.inline
    def setReady(value: /* repeated */ js.Any => js.Any): Self = this.set("ready", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = this.set("removeMissed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveMissed: Self = this.set("removeMissed", js.undefined)
    @scala.inline
    def setScheme(value: js.Any): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    @scala.inline
    def setSeparateLabel(value: Boolean): Self = this.set("separateLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparateLabel: Self = this.set("separateLabel", js.undefined)
    @scala.inline
    def setStableRowId(value: Boolean): Self = this.set("stableRowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStableRowId: Self = this.set("stableRowId", js.undefined)
    @scala.inline
    def setStructure(value: js.Any): Self = this.set("structure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructure: Self = this.set("structure", js.undefined)
    @scala.inline
    def setTotalColumn(value: String | Boolean): Self = this.set("totalColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalColumn: Self = this.set("totalColumn", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setWebWorker(value: String): Self = this.set("webWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebWorker: Self = this.set("webWorker", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setYScaleWidth(value: Double): Self = this.set("yScaleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYScaleWidth: Self = this.set("yScaleWidth", js.undefined)
  }
  
}


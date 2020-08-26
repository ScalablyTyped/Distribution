package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait filemanagerConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.native
  var borderless: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | HTMLElement] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[String | js.Array[_]] = js.native
  var datathrottle: js.UndefOr[Double] = js.native
  var datatype: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var filterMode: js.UndefOr[js.Any] = js.native
  var gravity: js.UndefOr[Double] = js.native
  var handlers: js.UndefOr[js.Any] = js.native
  var height: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var legacyUploader: js.UndefOr[Boolean] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var menuFilter: js.UndefOr[WebixCallback] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var modes: js.UndefOr[js.Array[_]] = js.native
  var noFileCache: js.UndefOr[Boolean] = js.native
  var on: js.UndefOr[EventHash] = js.native
  var padding: js.UndefOr[js.Any] = js.native
  var paddingX: js.UndefOr[Double] = js.native
  var paddingY: js.UndefOr[Double] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var ready: js.UndefOr[WebixCallback] = js.native
  var removeMissed: js.UndefOr[Boolean] = js.native
  var save: js.UndefOr[js.Any] = js.native
  var scheme: js.UndefOr[js.Any] = js.native
  var structure: js.UndefOr[js.Any] = js.native
  var templateCreate: js.UndefOr[WebixCallback] = js.native
  var templateDate: js.UndefOr[WebixCallback] = js.native
  var templateIcon: js.UndefOr[WebixCallback] = js.native
  var templateName: js.UndefOr[WebixCallback] = js.native
  var templateSize: js.UndefOr[WebixCallback] = js.native
  var templateType: js.UndefOr[WebixCallback] = js.native
  var `type`: js.UndefOr[String] = js.native
  var uploadProgress: js.UndefOr[js.Any] = js.native
  var url: js.UndefOr[js.Any] = js.native
  var view: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object filemanagerConfig {
  @scala.inline
  def apply(): filemanagerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[filemanagerConfig]
  }
  @scala.inline
  implicit class filemanagerConfigOps[Self <: filemanagerConfig] (val x: Self) extends AnyVal {
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
    def setDatathrottle(value: Double): Self = this.set("datathrottle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatathrottle: Self = this.set("datathrottle", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFilterMode(value: js.Any): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMode: Self = this.set("filterMode", js.undefined)
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setHandlers(value: js.Any): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLegacyUploader(value: Boolean): Self = this.set("legacyUploader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyUploader: Self = this.set("legacyUploader", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMenuFilter(value: /* repeated */ js.Any => js.Any): Self = this.set("menuFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMenuFilter: Self = this.set("menuFilter", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setModesVarargs(value: js.Any*): Self = this.set("modes", js.Array(value :_*))
    @scala.inline
    def setModes(value: js.Array[_]): Self = this.set("modes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModes: Self = this.set("modes", js.undefined)
    @scala.inline
    def setNoFileCache(value: Boolean): Self = this.set("noFileCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoFileCache: Self = this.set("noFileCache", js.undefined)
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
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setReady(value: /* repeated */ js.Any => js.Any): Self = this.set("ready", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = this.set("removeMissed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveMissed: Self = this.set("removeMissed", js.undefined)
    @scala.inline
    def setSave(value: js.Any): Self = this.set("save", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setScheme(value: js.Any): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    @scala.inline
    def setStructure(value: js.Any): Self = this.set("structure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructure: Self = this.set("structure", js.undefined)
    @scala.inline
    def setTemplateCreate(value: /* repeated */ js.Any => js.Any): Self = this.set("templateCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateCreate: Self = this.set("templateCreate", js.undefined)
    @scala.inline
    def setTemplateDate(value: /* repeated */ js.Any => js.Any): Self = this.set("templateDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateDate: Self = this.set("templateDate", js.undefined)
    @scala.inline
    def setTemplateIcon(value: /* repeated */ js.Any => js.Any): Self = this.set("templateIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateIcon: Self = this.set("templateIcon", js.undefined)
    @scala.inline
    def setTemplateName(value: /* repeated */ js.Any => js.Any): Self = this.set("templateName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
    @scala.inline
    def setTemplateSize(value: /* repeated */ js.Any => js.Any): Self = this.set("templateSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateSize: Self = this.set("templateSize", js.undefined)
    @scala.inline
    def setTemplateType(value: /* repeated */ js.Any => js.Any): Self = this.set("templateType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateType: Self = this.set("templateType", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUploadProgress(value: js.Any): Self = this.set("uploadProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadProgress: Self = this.set("uploadProgress", js.undefined)
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


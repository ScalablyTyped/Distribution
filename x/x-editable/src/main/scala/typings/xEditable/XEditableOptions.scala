package typings.xEditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEditableOptions extends js.Object {
  var ajaxOptions: js.UndefOr[js.Any] = js.native
  var anim: js.UndefOr[String] = js.native
  var autotext: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var display: js.UndefOr[js.Any] = js.native
  var emptyclass: js.UndefOr[String] = js.native
  var emptytext: js.UndefOr[String] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var highlight: js.UndefOr[js.Any] = js.native
  var mode: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var onblur: js.UndefOr[String] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var pk: js.UndefOr[js.Any] = js.native
  var placement: js.UndefOr[String] = js.native
  var savenochange: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[String] = js.native
  var send: js.UndefOr[String] = js.native
  var showbuttons: js.UndefOr[js.Any] = js.native
  var success: js.UndefOr[js.Any] = js.native
  var toggle: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var unsavedclass: js.UndefOr[String] = js.native
  var url: js.UndefOr[js.Any] = js.native
  var validate: js.UndefOr[js.Any] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object XEditableOptions {
  @scala.inline
  def apply(): XEditableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XEditableOptions]
  }
  @scala.inline
  implicit class XEditableOptionsOps[Self <: XEditableOptions] (val x: Self) extends AnyVal {
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
    def setAjaxOptions(value: js.Any): Self = this.set("ajaxOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxOptions: Self = this.set("ajaxOptions", js.undefined)
    @scala.inline
    def setAnim(value: String): Self = this.set("anim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnim: Self = this.set("anim", js.undefined)
    @scala.inline
    def setAutotext(value: String): Self = this.set("autotext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutotext: Self = this.set("autotext", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplay(value: js.Any): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setEmptyclass(value: String): Self = this.set("emptyclass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyclass: Self = this.set("emptyclass", js.undefined)
    @scala.inline
    def setEmptytext(value: String): Self = this.set("emptytext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptytext: Self = this.set("emptytext", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHighlight(value: js.Any): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnblur(value: String): Self = this.set("onblur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPk(value: js.Any): Self = this.set("pk", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePk: Self = this.set("pk", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setSavenochange(value: Boolean): Self = this.set("savenochange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavenochange: Self = this.set("savenochange", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSend(value: String): Self = this.set("send", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
    @scala.inline
    def setShowbuttons(value: js.Any): Self = this.set("showbuttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowbuttons: Self = this.set("showbuttons", js.undefined)
    @scala.inline
    def setSuccess(value: js.Any): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setToggle(value: String): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnsavedclass(value: String): Self = this.set("unsavedclass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsavedclass: Self = this.set("unsavedclass", js.undefined)
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setValidate(value: js.Any): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


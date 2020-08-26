package typings.webix.mod.ui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait forminputConfig extends js.Object {
  @JSName("$cssName")
  var $cssName: js.UndefOr[String] = js.native
  var animate: js.UndefOr[js.Any] = js.native
  var body: js.UndefOr[typings.webix.webix.ui.baseview] = js.native
  var borderless: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | HTMLElement] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var gravity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var keyPressTimeout: js.UndefOr[Double] = js.native
  var label: js.UndefOr[String] = js.native
  var labelAlign: js.UndefOr[String] = js.native
  var labelWidth: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var value: js.UndefOr[js.Any] = js.native
  var view: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object forminputConfig {
  @scala.inline
  def apply(): forminputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[forminputConfig]
  }
  @scala.inline
  implicit class forminputConfigOps[Self <: forminputConfig] (val x: Self) extends AnyVal {
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
    def set$cssName(value: String): Self = this.set("$cssName", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$cssName: Self = this.set("$cssName", js.undefined)
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBody(value: typings.webix.webix.ui.baseview): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
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
    def setKeyPressTimeout(value: Double): Self = this.set("keyPressTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPressTimeout: Self = this.set("keyPressTimeout", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelAlign(value: String): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    @scala.inline
    def setLabelWidth(value: Double): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
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


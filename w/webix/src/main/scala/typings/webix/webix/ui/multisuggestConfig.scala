package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import typings.webix.webix.WebixTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait multisuggestConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.native
  var autofit: js.UndefOr[Boolean] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var body: js.UndefOr[String | baseview] = js.native
  var borderless: js.UndefOr[Boolean] = js.native
  var button: js.UndefOr[Boolean] = js.native
  var buttonText: js.UndefOr[String] = js.native
  var container: js.UndefOr[String | HTMLElement] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[String | js.Array[_]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[WebixCallback] = js.native
  var fitMaster: js.UndefOr[Boolean] = js.native
  var gravity: js.UndefOr[Double] = js.native
  var head: js.UndefOr[js.Any] = js.native
  var headHeight: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var input: js.UndefOr[HTMLElement | String] = js.native
  var keyPressTimeout: js.UndefOr[Double] = js.native
  var left: js.UndefOr[Double] = js.native
  var master: js.UndefOr[baseview] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var move: js.UndefOr[Boolean] = js.native
  var on: js.UndefOr[EventHash] = js.native
  var padding: js.UndefOr[js.Any] = js.native
  var point: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String | WebixCallback] = js.native
  var relative: js.UndefOr[String] = js.native
  var resize: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
  var template: js.UndefOr[String | WebixTemplate] = js.native
  var textValue: js.UndefOr[String] = js.native
  var toFront: js.UndefOr[Boolean] = js.native
  var top: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double] = js.native
  var view: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object multisuggestConfig {
  @scala.inline
  def apply(): multisuggestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[multisuggestConfig]
  }
  @scala.inline
  implicit class multisuggestConfigOps[Self <: multisuggestConfig] (val x: Self) extends AnyVal {
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
    def setAutofit(value: Boolean): Self = this.set("autofit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofit: Self = this.set("autofit", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setBody(value: String | baseview): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setButton(value: Boolean): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFilter(value: /* repeated */ js.Any => js.Any): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFitMaster(value: Boolean): Self = this.set("fitMaster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitMaster: Self = this.set("fitMaster", js.undefined)
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setHead(value: js.Any): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def setHeadHeight(value: Double): Self = this.set("headHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadHeight: Self = this.set("headHeight", js.undefined)
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
    def setInput(value: HTMLElement | String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = this.set("keyPressTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPressTimeout: Self = this.set("keyPressTimeout", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMaster(value: baseview): Self = this.set("master", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster: Self = this.set("master", js.undefined)
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
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setMove(value: Boolean): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPoint(value: Boolean): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPositionFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("position", js.Any.fromFunction1(value))
    @scala.inline
    def setPosition(value: String | WebixCallback): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRelative(value: String): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setTemplateFunction1(value: /* repeated */ js.Any => String): Self = this.set("template", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplate(value: String | WebixTemplate): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTextValue(value: String): Self = this.set("textValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextValue: Self = this.set("textValue", js.undefined)
    @scala.inline
    def setToFront(value: Boolean): Self = this.set("toFront", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToFront: Self = this.set("toFront", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}


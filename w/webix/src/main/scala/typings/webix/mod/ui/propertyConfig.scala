package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait propertyConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.native
  var autoheight: js.UndefOr[Boolean] = js.native
  var borderless: js.UndefOr[Boolean] = js.native
  var complexData: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | HTMLElement] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[String | js.Array[_]] = js.native
  var datatype: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var editValue: js.UndefOr[String] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var editaction: js.UndefOr[String] = js.native
  var elements: js.UndefOr[js.Any] = js.native
  var form: js.UndefOr[String] = js.native
  var gravity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var keyPressTimeout: js.UndefOr[Double] = js.native
  var map: js.UndefOr[js.Any] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var mouseEventDelay: js.UndefOr[Double] = js.native
  var nameWidth: js.UndefOr[Double] = js.native
  var on: js.UndefOr[EventHash] = js.native
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.native
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.native
  var onDblClick: js.UndefOr[WebixCallback] = js.native
  var onMouseMove: js.UndefOr[WebixCallback] = js.native
  var scroll: js.UndefOr[Boolean | String] = js.native
  var scrollSpeed: js.UndefOr[String] = js.native
  var template: js.UndefOr[String | WebixCallback] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var url: js.UndefOr[js.Any] = js.native
  var view: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object propertyConfig {
  @scala.inline
  def apply(): propertyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[propertyConfig]
  }
  @scala.inline
  implicit class propertyConfigOps[Self <: propertyConfig] (val x: Self) extends AnyVal {
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
    def setAutoheight(value: Boolean): Self = this.set("autoheight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoheight: Self = this.set("autoheight", js.undefined)
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setComplexData(value: Boolean): Self = this.set("complexData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplexData: Self = this.set("complexData", js.undefined)
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
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEditValue(value: String): Self = this.set("editValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditValue: Self = this.set("editValue", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEditaction(value: String): Self = this.set("editaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditaction: Self = this.set("editaction", js.undefined)
    @scala.inline
    def setElements(value: js.Any): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
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
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
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
    def setMouseEventDelay(value: Double): Self = this.set("mouseEventDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseEventDelay: Self = this.set("mouseEventDelay", js.undefined)
    @scala.inline
    def setNameWidth(value: Double): Self = this.set("nameWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameWidth: Self = this.set("nameWidth", js.undefined)
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnClick(value: StringDictionary[js.Any]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContext(value: StringDictionary[js.Any]): Self = this.set("onContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnContext: Self = this.set("onContext", js.undefined)
    @scala.inline
    def setOnDblClick(value: /* repeated */ js.Any => js.Any): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    @scala.inline
    def setOnMouseMove(value: /* repeated */ js.Any => js.Any): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setScroll(value: Boolean | String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setScrollSpeed(value: String): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    @scala.inline
    def setTemplateFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("template", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplate(value: String | WebixCallback): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
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


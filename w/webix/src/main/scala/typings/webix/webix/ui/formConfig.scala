package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait formConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.native
  var autoheight: js.UndefOr[Boolean] = js.native
  var borderless: js.UndefOr[Boolean] = js.native
  var cols: js.UndefOr[js.Array[_]] = js.native
  var complexData: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | HTMLElement] = js.native
  var css: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[String | js.Array[_]] = js.native
  var dataFeed: js.UndefOr[String | WebixCallback] = js.native
  var datatype: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var elements: js.UndefOr[js.Array[_]] = js.native
  var elementsConfig: js.UndefOr[js.Any] = js.native
  var gravity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var isolate: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var on: js.UndefOr[EventHash] = js.native
  var padding: js.UndefOr[js.Any] = js.native
  var paddingX: js.UndefOr[Double] = js.native
  var paddingY: js.UndefOr[Double] = js.native
  var responsive: js.UndefOr[String] = js.native
  var rows: js.UndefOr[js.Array[_]] = js.native
  var rules: js.UndefOr[js.Any] = js.native
  var scroll: js.UndefOr[Boolean | String] = js.native
  var scrollSpeed: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[js.Any] = js.native
  var view: js.UndefOr[String] = js.native
  var visibleBatch: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object formConfig {
  @scala.inline
  def apply(): formConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[formConfig]
  }
  @scala.inline
  implicit class formConfigOps[Self <: formConfig] (val x: Self) extends AnyVal {
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
    def setColsVarargs(value: js.Any*): Self = this.set("cols", js.Array(value :_*))
    @scala.inline
    def setCols(value: js.Array[_]): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
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
    def setDataFeedFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("dataFeed", js.Any.fromFunction1(value))
    @scala.inline
    def setDataFeed(value: String | WebixCallback): Self = this.set("dataFeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFeed: Self = this.set("dataFeed", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setElementsVarargs(value: js.Any*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[_]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setElementsConfig(value: js.Any): Self = this.set("elementsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementsConfig: Self = this.set("elementsConfig", js.undefined)
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
    def setIsolate(value: Boolean): Self = this.set("isolate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolate: Self = this.set("isolate", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
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
    def setResponsive(value: String): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setRowsVarargs(value: js.Any*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[_]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRules(value: js.Any): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setScroll(value: Boolean | String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setScrollSpeed(value: String): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
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
    def setVisibleBatch(value: String): Self = this.set("visibleBatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleBatch: Self = this.set("visibleBatch", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


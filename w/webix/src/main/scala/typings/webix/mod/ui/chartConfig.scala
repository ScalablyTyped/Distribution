package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import typings.webix.mod.WebixTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait chartConfig extends js.Object {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var animate: js.UndefOr[js.Any] = js.native
  
  var animateDuration: js.UndefOr[Double] = js.native
  
  var ariaLabel: js.UndefOr[String] = js.native
  
  var barWidth: js.UndefOr[Double] = js.native
  
  var border: js.UndefOr[Boolean] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var cant: js.UndefOr[Double] = js.native
  
  var cellWidth: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String | WebixCallback] = js.native
  
  var container: js.UndefOr[String | HTMLElement] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var data: js.UndefOr[String | js.Array[_]] = js.native
  
  var datathrottle: js.UndefOr[Double] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var disableLines: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dynamic: js.UndefOr[Boolean] = js.native
  
  var eventRadius: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var fixOverflow: js.UndefOr[Boolean] = js.native
  
  var gradient: js.UndefOr[Boolean | String | WebixCallback] = js.native
  
  var gravity: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var item: js.UndefOr[js.Any] = js.native
  
  var keyPressTimeout: js.UndefOr[Double] = js.native
  
  var label: js.UndefOr[String | WebixCallback] = js.native
  
  var labelOffset: js.UndefOr[Double] = js.native
  
  var legend: js.UndefOr[js.Any] = js.native
  
  var line: js.UndefOr[js.Any] = js.native
  
  var lineColor: js.UndefOr[String] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var mouseEventDelay: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Boolean] = js.native
  
  var on: js.UndefOr[EventHash] = js.native
  
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onDblClick: js.UndefOr[WebixCallback] = js.native
  
  var onMouseMove: js.UndefOr[WebixCallback] = js.native
  
  var origin: js.UndefOr[Double | String] = js.native
  
  var padding: js.UndefOr[js.Any] = js.native
  
  var pieHeight: js.UndefOr[Double] = js.native
  
  var pieInnerText: js.UndefOr[String | WebixCallback] = js.native
  
  var preset: js.UndefOr[String] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var ready: js.UndefOr[WebixCallback] = js.native
  
  var removeMissed: js.UndefOr[Boolean] = js.native
  
  var save: js.UndefOr[js.Any] = js.native
  
  var scale: js.UndefOr[String] = js.native
  
  var scheme: js.UndefOr[js.Any] = js.native
  
  var series: js.UndefOr[js.Any] = js.native
  
  var shadow: js.UndefOr[Boolean] = js.native
  
  var tooltip: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[js.Any] = js.native
  
  var value: js.UndefOr[String | WebixTemplate] = js.native
  
  var view: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xAxis: js.UndefOr[js.Any] = js.native
  
  var xValue: js.UndefOr[String] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yAxis: js.UndefOr[js.Any] = js.native
  
  var yValue: js.UndefOr[String] = js.native
}
object chartConfig {
  
  @scala.inline
  def apply(): chartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[chartConfig]
  }
  
  @scala.inline
  implicit class chartConfigOps[Self <: chartConfig] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAnimateDuration(value: Double): Self = this.set("animateDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateDuration: Self = this.set("animateDuration", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
    
    @scala.inline
    def setBorder(value: Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    
    @scala.inline
    def setCant(value: Double): Self = this.set("cant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCant: Self = this.set("cant", js.undefined)
    
    @scala.inline
    def setCellWidth(value: Double): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellWidth: Self = this.set("cellWidth", js.undefined)
    
    @scala.inline
    def setColorFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("color", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColor(value: String | WebixCallback): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
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
    def setDisableLines(value: Boolean): Self = this.set("disableLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLines: Self = this.set("disableLines", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    
    @scala.inline
    def setEventRadius(value: Double): Self = this.set("eventRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventRadius: Self = this.set("eventRadius", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFixOverflow(value: Boolean): Self = this.set("fixOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixOverflow: Self = this.set("fixOverflow", js.undefined)
    
    @scala.inline
    def setGradientFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("gradient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGradient(value: Boolean | String | WebixCallback): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
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
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = this.set("keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPressTimeout: Self = this.set("keyPressTimeout", js.undefined)
    
    @scala.inline
    def setLabelFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabel(value: String | WebixCallback): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelOffset(value: Double): Self = this.set("labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOffset: Self = this.set("labelOffset", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLine(value: js.Any): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
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
    def setOffset(value: Boolean): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
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
    def setOrigin(value: Double | String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPieHeight(value: Double): Self = this.set("pieHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieHeight: Self = this.set("pieHeight", js.undefined)
    
    @scala.inline
    def setPieInnerTextFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("pieInnerText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPieInnerText(value: String | WebixCallback): Self = this.set("pieInnerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieInnerText: Self = this.set("pieInnerText", js.undefined)
    
    @scala.inline
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
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
    def setScale(value: String): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScheme(value: js.Any): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setValueFunction1(value: /* repeated */ js.Any => String): Self = this.set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String | WebixTemplate): Self = this.set("value", value.asInstanceOf[js.Any])
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXAxis(value: js.Any): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setXValue(value: String): Self = this.set("xValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXValue: Self = this.set("xValue", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYAxis(value: js.Any): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    
    @scala.inline
    def setYValue(value: String): Self = this.set("yValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYValue: Self = this.set("yValue", js.undefined)
  }
}

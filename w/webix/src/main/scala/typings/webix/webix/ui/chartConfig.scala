package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import typings.webix.webix.WebixTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait chartConfig extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var animate: js.UndefOr[js.Any] = js.undefined
  
  var animateDuration: js.UndefOr[Double] = js.undefined
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var barWidth: js.UndefOr[Double] = js.undefined
  
  var border: js.UndefOr[Boolean] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var cant: js.UndefOr[Double] = js.undefined
  
  var cellWidth: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[String | WebixCallback] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  var datathrottle: js.UndefOr[Double] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var disableLines: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var dynamic: js.UndefOr[Boolean] = js.undefined
  
  var eventRadius: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var fixOverflow: js.UndefOr[Boolean] = js.undefined
  
  var gradient: js.UndefOr[Boolean | String | WebixCallback] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var item: js.UndefOr[js.Any] = js.undefined
  
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[String | WebixCallback] = js.undefined
  
  var labelOffset: js.UndefOr[Double] = js.undefined
  
  var legend: js.UndefOr[js.Any] = js.undefined
  
  var line: js.UndefOr[js.Any] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var mouseEventDelay: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Boolean] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var onDblClick: js.UndefOr[WebixCallback] = js.undefined
  
  var onMouseMove: js.UndefOr[WebixCallback] = js.undefined
  
  var origin: js.UndefOr[Double | String] = js.undefined
  
  var padding: js.UndefOr[js.Any] = js.undefined
  
  var pieHeight: js.UndefOr[Double] = js.undefined
  
  var pieInnerText: js.UndefOr[String | WebixCallback] = js.undefined
  
  var preset: js.UndefOr[String] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var ready: js.UndefOr[WebixCallback] = js.undefined
  
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  
  var save: js.UndefOr[js.Any] = js.undefined
  
  var scale: js.UndefOr[String] = js.undefined
  
  var scheme: js.UndefOr[js.Any] = js.undefined
  
  var series: js.UndefOr[js.Any] = js.undefined
  
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: js.UndefOr[js.Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[String | WebixTemplate] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xAxis: js.UndefOr[js.Any] = js.undefined
  
  var xValue: js.UndefOr[String] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yAxis: js.UndefOr[js.Any] = js.undefined
  
  var yValue: js.UndefOr[String] = js.undefined
}
object chartConfig {
  
  @scala.inline
  def apply(): chartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[chartConfig]
  }
  
  @scala.inline
  implicit class chartConfigMutableBuilder[Self <: chartConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateDuration(value: Double): Self = StObject.set(x, "animateDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateDurationUndefined: Self = StObject.set(x, "animateDuration", js.undefined)
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    @scala.inline
    def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setCant(value: Double): Self = StObject.set(x, "cant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCantUndefined: Self = StObject.set(x, "cant", js.undefined)
    
    @scala.inline
    def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String | WebixCallback): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setData(value: String | js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDatathrottle(value: Double): Self = StObject.set(x, "datathrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatathrottleUndefined: Self = StObject.set(x, "datathrottle", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDisableLines(value: Boolean): Self = StObject.set(x, "disableLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLinesUndefined: Self = StObject.set(x, "disableLines", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
    
    @scala.inline
    def setEventRadius(value: Double): Self = StObject.set(x, "eventRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventRadiusUndefined: Self = StObject.set(x, "eventRadius", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFixOverflow(value: Boolean): Self = StObject.set(x, "fixOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixOverflowUndefined: Self = StObject.set(x, "fixOverflow", js.undefined)
    
    @scala.inline
    def setGradient(value: Boolean | String | WebixCallback): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    @scala.inline
    def setLabel(value: String | WebixCallback): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setLine(value: js.Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMouseEventDelay(value: Double): Self = StObject.set(x, "mouseEventDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEventDelayUndefined: Self = StObject.set(x, "mouseEventDelay", js.undefined)
    
    @scala.inline
    def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: StringDictionary[js.Any]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "onContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextUndefined: Self = StObject.set(x, "onContext", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: WebixCallback): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: WebixCallback): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPieHeight(value: Double): Self = StObject.set(x, "pieHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieHeightUndefined: Self = StObject.set(x, "pieHeight", js.undefined)
    
    @scala.inline
    def setPieInnerText(value: String | WebixCallback): Self = StObject.set(x, "pieInnerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieInnerTextUndefined: Self = StObject.set(x, "pieInnerText", js.undefined)
    
    @scala.inline
    def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setReady(value: WebixCallback): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    @scala.inline
    def setSave(value: js.Any): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScheme(value: js.Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setValue(value: String | WebixTemplate): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxis(value: js.Any): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXValue(value: String): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXValueUndefined: Self = StObject.set(x, "xValue", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxis(value: js.Any): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYValue(value: String): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYValueUndefined: Self = StObject.set(x, "yValue", js.undefined)
  }
}

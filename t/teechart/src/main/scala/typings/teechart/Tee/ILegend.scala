package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILegend extends StObject {
  
  var align: Double
  
  def availRows(): Double
  
  var bounds: IRectangle
  
  var chart: IChart
  
  var dividing: IStroke
  
  var fontColor: Boolean
  
  var format: IFormat
  
  var innerOff: Double
  
  var inverted: Boolean
  
  def isVertical(): Boolean
  
  var itemHeight: Double
  
  def itemText(series: ISeries, index: Double): String
  
  def itemsCount(): Double
  
  var legendStyle: String
  
  var over: Double
  
  var padding: Double
  
  var position: String
  
  def showValues(): Boolean
  
  var symbol: ISymbol
  
  var textStyle: String
  
  var title: IAnnotation
  
  def totalWidth(): Double
  
  var transparent: Boolean
  
  var visible: Boolean
}
object ILegend {
  
  @scala.inline
  def apply(
    align: Double,
    availRows: () => Double,
    bounds: IRectangle,
    chart: IChart,
    dividing: IStroke,
    fontColor: Boolean,
    format: IFormat,
    innerOff: Double,
    inverted: Boolean,
    isVertical: () => Boolean,
    itemHeight: Double,
    itemText: (ISeries, Double) => String,
    itemsCount: () => Double,
    legendStyle: String,
    over: Double,
    padding: Double,
    position: String,
    showValues: () => Boolean,
    symbol: ISymbol,
    textStyle: String,
    title: IAnnotation,
    totalWidth: () => Double,
    transparent: Boolean,
    visible: Boolean
  ): ILegend = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], availRows = js.Any.fromFunction0(availRows), bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dividing = dividing.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], innerOff = innerOff.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], isVertical = js.Any.fromFunction0(isVertical), itemHeight = itemHeight.asInstanceOf[js.Any], itemText = js.Any.fromFunction2(itemText), itemsCount = js.Any.fromFunction0(itemsCount), legendStyle = legendStyle.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showValues = js.Any.fromFunction0(showValues), symbol = symbol.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totalWidth = js.Any.fromFunction0(totalWidth), transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegend]
  }
  
  @scala.inline
  implicit class ILegendMutableBuilder[Self <: ILegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Double): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailRows(value: () => Double): Self = StObject.set(x, "availRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividing(value: IStroke): Self = StObject.set(x, "dividing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: Boolean): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerOff(value: Double): Self = StObject.set(x, "innerOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVertical(value: () => Boolean): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemText(value: (ISeries, Double) => String): Self = StObject.set(x, "itemText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemsCount(value: () => Double): Self = StObject.set(x, "itemsCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLegendStyle(value: String): Self = StObject.set(x, "legendStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOver(value: Double): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValues(value: () => Boolean): Self = StObject.set(x, "showValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSymbol(value: ISymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyle(value: String): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: IAnnotation): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalWidth(value: () => Double): Self = StObject.set(x, "totalWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}

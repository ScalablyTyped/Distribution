package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAxis extends StObject {
  
  var automatic: Boolean
  
  // %
  var axisSize: Double
  
  // readonly
  var bounds: IRectangle
  
  def calc(value: Double): Double
  
  var chart: IChart
  
  var custom: Boolean
  
  // %
  var end: Double
  
  var endPos: Double
  
  var format: IFormat
  
  def fromPos(position: Double): Double
  
  def fromSize(size: Double): Double
  
  // readonly
  var grid: IGrid
  
  def hasAnySeries(): Boolean
  
  var horizontal: Boolean
  
  var increm: Double
  
  var increment: Double
  
  var innerTicks: ITicks
  
  var inverted: Boolean
  
  var labels: IAxisLabels
  
  var log: Boolean
  
  var maximum: Double
  
  var minimum: Double
  
  var minorTicks: IMinorTicks
  
  // readonly
  var otherSize: Boolean
  
  // readonly?
  var position: Double
  
  var scale: Double
  
  def scroll(delta: Double): Unit
  
  def setMinMax(minimum: Double, maximum: Double): Unit
  
  var start: Double
  
  var startPos: Double
  
  var ticks: ITicks
  
  var title: IAxisTitle
  
  var visible: Boolean
}
object IAxis {
  
  inline def apply(
    automatic: Boolean,
    axisSize: Double,
    bounds: IRectangle,
    calc: Double => Double,
    chart: IChart,
    custom: Boolean,
    end: Double,
    endPos: Double,
    format: IFormat,
    fromPos: Double => Double,
    fromSize: Double => Double,
    grid: IGrid,
    hasAnySeries: () => Boolean,
    horizontal: Boolean,
    increm: Double,
    increment: Double,
    innerTicks: ITicks,
    inverted: Boolean,
    labels: IAxisLabels,
    log: Boolean,
    maximum: Double,
    minimum: Double,
    minorTicks: IMinorTicks,
    otherSize: Boolean,
    position: Double,
    scale: Double,
    scroll: Double => Unit,
    setMinMax: (Double, Double) => Unit,
    start: Double,
    startPos: Double,
    ticks: ITicks,
    title: IAxisTitle,
    visible: Boolean
  ): IAxis = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], axisSize = axisSize.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], calc = js.Any.fromFunction1(calc), chart = chart.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endPos = endPos.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], fromPos = js.Any.fromFunction1(fromPos), fromSize = js.Any.fromFunction1(fromSize), grid = grid.asInstanceOf[js.Any], hasAnySeries = js.Any.fromFunction0(hasAnySeries), horizontal = horizontal.asInstanceOf[js.Any], increm = increm.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], innerTicks = innerTicks.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], minorTicks = minorTicks.asInstanceOf[js.Any], otherSize = otherSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scroll = js.Any.fromFunction1(scroll), setMinMax = js.Any.fromFunction2(setMinMax), start = start.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxis]
  }
  
  extension [Self <: IAxis](x: Self) {
    
    inline def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    inline def setAxisSize(value: Double): Self = StObject.set(x, "axisSize", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCalc(value: Double => Double): Self = StObject.set(x, "calc", js.Any.fromFunction1(value))
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFromPos(value: Double => Double): Self = StObject.set(x, "fromPos", js.Any.fromFunction1(value))
    
    inline def setFromSize(value: Double => Double): Self = StObject.set(x, "fromSize", js.Any.fromFunction1(value))
    
    inline def setGrid(value: IGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setHasAnySeries(value: () => Boolean): Self = StObject.set(x, "hasAnySeries", js.Any.fromFunction0(value))
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setIncrem(value: Double): Self = StObject.set(x, "increm", value.asInstanceOf[js.Any])
    
    inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setInnerTicks(value: ITicks): Self = StObject.set(x, "innerTicks", value.asInstanceOf[js.Any])
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: IAxisLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinorTicks(value: IMinorTicks): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setOtherSize(value: Boolean): Self = StObject.set(x, "otherSize", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: Double => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
    
    inline def setSetMinMax(value: (Double, Double) => Unit): Self = StObject.set(x, "setMinMax", js.Any.fromFunction2(value))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: ITicks): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: IAxisTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}

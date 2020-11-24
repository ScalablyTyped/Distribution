package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAxis extends js.Object {
  
  var automatic: Boolean = js.native
  
   // %
  var axisSize: Double = js.native
  
   // readonly
  var bounds: IRectangle = js.native
  
  def calc(value: Double): Double = js.native
  
  var chart: IChart = js.native
  
  var custom: Boolean = js.native
  
   // %
  var end: Double = js.native
  
  var endPos: Double = js.native
  
  var format: IFormat = js.native
  
  def fromPos(position: Double): Double = js.native
  
  def fromSize(size: Double): Double = js.native
  
   // readonly
  var grid: IGrid = js.native
  
  def hasAnySeries(): Boolean = js.native
  
  var horizontal: Boolean = js.native
  
  var increm: Double = js.native
  
  var increment: Double = js.native
  
  var innerTicks: ITicks = js.native
  
  var inverted: Boolean = js.native
  
  var labels: IAxisLabels = js.native
  
  var log: Boolean = js.native
  
  var maximum: Double = js.native
  
  var minimum: Double = js.native
  
  var minorTicks: IMinorTicks = js.native
  
    // readonly
  var otherSize: Boolean = js.native
  
    // readonly?
  var position: Double = js.native
  
  var scale: Double = js.native
  
  def scroll(delta: Double): Unit = js.native
  
  def setMinMax(minimum: Double, maximum: Double): Unit = js.native
  
  var start: Double = js.native
  
  var startPos: Double = js.native
  
  var ticks: ITicks = js.native
  
  var title: IAxisTitle = js.native
  
  var visible: Boolean = js.native
}
object IAxis {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IAxisOps[Self <: IAxis] (val x: Self) extends AnyVal {
    
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
    def setAutomatic(value: Boolean): Self = this.set("automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisSize(value: Double): Self = this.set("axisSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: IRectangle): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalc(value: Double => Double): Self = this.set("calc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPos(value: Double): Self = this.set("endPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPos(value: Double => Double): Self = this.set("fromPos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromSize(value: Double => Double): Self = this.set("fromSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGrid(value: IGrid): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAnySeries(value: () => Boolean): Self = this.set("hasAnySeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrem(value: Double): Self = this.set("increm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerTicks(value: ITicks): Self = this.set("innerTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: IAxisLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTicks(value: IMinorTicks): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherSize(value: Boolean): Self = this.set("otherSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: Double => Unit): Self = this.set("scroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinMax(value: (Double, Double) => Unit): Self = this.set("setMinMax", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPos(value: Double): Self = this.set("startPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks(value: ITicks): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: IAxisTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}

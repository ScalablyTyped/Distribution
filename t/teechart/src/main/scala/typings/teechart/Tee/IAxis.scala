package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxis extends js.Object {
  var automatic: Boolean
   // %
  var axisSize: Double
   // readonly
  var bounds: IRectangle
  var chart: IChart
  var custom: Boolean
   // %
  var end: Double
  var endPos: Double
  var format: IFormat
   // readonly
  var grid: IGrid
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
  var start: Double
  var startPos: Double
  var ticks: ITicks
  var title: IAxisTitle
  var visible: Boolean
  def calc(value: Double): Double
  def fromPos(position: Double): Double
  def fromSize(size: Double): Double
  def hasAnySeries(): Boolean
  def scroll(delta: Double): Unit
  def setMinMax(minimum: Double, maximum: Double): Unit
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
    val __obj = js.Dynamic.literal(automatic = automatic, axisSize = axisSize, bounds = bounds, calc = js.Any.fromFunction1(calc), chart = chart, custom = custom, end = end, endPos = endPos, format = format, fromPos = js.Any.fromFunction1(fromPos), fromSize = js.Any.fromFunction1(fromSize), grid = grid, hasAnySeries = js.Any.fromFunction0(hasAnySeries), horizontal = horizontal, increm = increm, increment = increment, innerTicks = innerTicks, inverted = inverted, labels = labels, log = log, maximum = maximum, minimum = minimum, minorTicks = minorTicks, otherSize = otherSize, position = position, scale = scale, scroll = js.Any.fromFunction1(scroll), setMinMax = js.Any.fromFunction2(setMinMax), start = start, startPos = startPos, ticks = ticks, title = title, visible = visible)
  
    __obj.asInstanceOf[IAxis]
  }
}


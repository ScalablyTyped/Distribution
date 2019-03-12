package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxis extends js.Object {
  var automatic: scala.Boolean
   // %
  var axisSize: scala.Double
   // readonly
  var bounds: IRectangle
  var chart: IChart
  var custom: scala.Boolean
   // %
  var end: scala.Double
  var endPos: scala.Double
  var format: IFormat
   // readonly
  var grid: IGrid
  var horizontal: scala.Boolean
  var increm: scala.Double
  var increment: scala.Double
  var innerTicks: ITicks
  var inverted: scala.Boolean
  var labels: IAxisLabels
  var log: scala.Boolean
  var maximum: scala.Double
  var minimum: scala.Double
  var minorTicks: IMinorTicks
    // readonly
  var otherSize: scala.Boolean
    // readonly?
  var position: scala.Double
  var scale: scala.Double
  var start: scala.Double
  var startPos: scala.Double
  var ticks: ITicks
  var title: IAxisTitle
  var visible: scala.Boolean
  def calc(value: scala.Double): scala.Double
  def fromPos(position: scala.Double): scala.Double
  def fromSize(size: scala.Double): scala.Double
  def hasAnySeries(): scala.Boolean
  def scroll(delta: scala.Double): scala.Unit
  def setMinMax(minimum: scala.Double, maximum: scala.Double): scala.Unit
}

object IAxis {
  @scala.inline
  def apply(
    automatic: scala.Boolean,
    axisSize: scala.Double,
    bounds: IRectangle,
    calc: scala.Double => scala.Double,
    chart: IChart,
    custom: scala.Boolean,
    end: scala.Double,
    endPos: scala.Double,
    format: IFormat,
    fromPos: scala.Double => scala.Double,
    fromSize: scala.Double => scala.Double,
    grid: IGrid,
    hasAnySeries: () => scala.Boolean,
    horizontal: scala.Boolean,
    increm: scala.Double,
    increment: scala.Double,
    innerTicks: ITicks,
    inverted: scala.Boolean,
    labels: IAxisLabels,
    log: scala.Boolean,
    maximum: scala.Double,
    minimum: scala.Double,
    minorTicks: IMinorTicks,
    otherSize: scala.Boolean,
    position: scala.Double,
    scale: scala.Double,
    scroll: scala.Double => scala.Unit,
    setMinMax: (scala.Double, scala.Double) => scala.Unit,
    start: scala.Double,
    startPos: scala.Double,
    ticks: ITicks,
    title: IAxisTitle,
    visible: scala.Boolean
  ): IAxis = {
    val __obj = js.Dynamic.literal(automatic = automatic, axisSize = axisSize, bounds = bounds, calc = js.Any.fromFunction1(calc), chart = chart, custom = custom, end = end, endPos = endPos, format = format, fromPos = js.Any.fromFunction1(fromPos), fromSize = js.Any.fromFunction1(fromSize), grid = grid, hasAnySeries = js.Any.fromFunction0(hasAnySeries), horizontal = horizontal, increm = increm, increment = increment, innerTicks = innerTicks, inverted = inverted, labels = labels, log = log, maximum = maximum, minimum = minimum, minorTicks = minorTicks, otherSize = otherSize, position = position, scale = scale, scroll = js.Any.fromFunction1(scroll), setMinMax = js.Any.fromFunction2(setMinMax), start = start, startPos = startPos, ticks = ticks, title = title, visible = visible)
  
    __obj.asInstanceOf[IAxis]
  }
}


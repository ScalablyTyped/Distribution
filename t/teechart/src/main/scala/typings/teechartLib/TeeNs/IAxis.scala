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
    calc: js.Function1[scala.Double, scala.Double],
    chart: IChart,
    custom: scala.Boolean,
    end: scala.Double,
    endPos: scala.Double,
    format: IFormat,
    fromPos: js.Function1[scala.Double, scala.Double],
    fromSize: js.Function1[scala.Double, scala.Double],
    grid: IGrid,
    hasAnySeries: js.Function0[scala.Boolean],
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
    scroll: js.Function1[scala.Double, scala.Unit],
    setMinMax: js.Function2[scala.Double, scala.Double, scala.Unit],
    start: scala.Double,
    startPos: scala.Double,
    ticks: ITicks,
    title: IAxisTitle,
    visible: scala.Boolean
  ): IAxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automatic")(automatic)
    __obj.updateDynamic("axisSize")(axisSize)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("calc")(calc)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("endPos")(endPos)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("fromPos")(fromPos)
    __obj.updateDynamic("fromSize")(fromSize)
    __obj.updateDynamic("grid")(grid)
    __obj.updateDynamic("hasAnySeries")(hasAnySeries)
    __obj.updateDynamic("horizontal")(horizontal)
    __obj.updateDynamic("increm")(increm)
    __obj.updateDynamic("increment")(increment)
    __obj.updateDynamic("innerTicks")(innerTicks)
    __obj.updateDynamic("inverted")(inverted)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("maximum")(maximum)
    __obj.updateDynamic("minimum")(minimum)
    __obj.updateDynamic("minorTicks")(minorTicks)
    __obj.updateDynamic("otherSize")(otherSize)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("setMinMax")(setMinMax)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("startPos")(startPos)
    __obj.updateDynamic("ticks")(ticks)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IAxis]
  }
}


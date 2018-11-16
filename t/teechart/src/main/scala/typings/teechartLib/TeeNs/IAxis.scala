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


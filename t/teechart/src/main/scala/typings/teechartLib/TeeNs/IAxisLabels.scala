package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxisLabels extends js.Object {
  var alternate: scala.Boolean
  var chart: IChart
  var dateFormat: java.lang.String
  var decimals: scala.Double
  var format: IFormat
  var labelStyle: java.lang.String
  var maxWidth: scala.Double
  var padding: scala.Double
  var rotation: scala.Double
  var separation: scala.Double
   // %
  var visible: scala.Boolean
  def getLabel(value: scala.Double): java.lang.String
  def width(value: scala.Double): scala.Double
}

object IAxisLabels {
  @scala.inline
  def apply(
    alternate: scala.Boolean,
    chart: IChart,
    dateFormat: java.lang.String,
    decimals: scala.Double,
    format: IFormat,
    getLabel: scala.Double => java.lang.String,
    labelStyle: java.lang.String,
    maxWidth: scala.Double,
    padding: scala.Double,
    rotation: scala.Double,
    separation: scala.Double,
    visible: scala.Boolean,
    width: scala.Double => scala.Double
  ): IAxisLabels = {
    val __obj = js.Dynamic.literal(alternate = alternate, chart = chart, dateFormat = dateFormat, decimals = decimals, format = format, getLabel = js.Any.fromFunction1(getLabel), labelStyle = labelStyle, maxWidth = maxWidth, padding = padding, rotation = rotation, separation = separation, visible = visible, width = js.Any.fromFunction1(width))
  
    __obj.asInstanceOf[IAxisLabels]
  }
}


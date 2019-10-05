package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxisLabels extends js.Object {
  var alternate: Boolean
  var chart: IChart
  var dateFormat: String
  var decimals: Double
  var format: IFormat
  var labelStyle: String
  var maxWidth: Double
  var padding: Double
  var rotation: Double
  var separation: Double
   // %
  var visible: Boolean
  def getLabel(value: Double): String
  def width(value: Double): Double
}

object IAxisLabels {
  @scala.inline
  def apply(
    alternate: Boolean,
    chart: IChart,
    dateFormat: String,
    decimals: Double,
    format: IFormat,
    getLabel: Double => String,
    labelStyle: String,
    maxWidth: Double,
    padding: Double,
    rotation: Double,
    separation: Double,
    visible: Boolean,
    width: Double => Double
  ): IAxisLabels = {
    val __obj = js.Dynamic.literal(alternate = alternate, chart = chart, dateFormat = dateFormat, decimals = decimals, format = format, getLabel = js.Any.fromFunction1(getLabel), labelStyle = labelStyle, maxWidth = maxWidth, padding = padding, rotation = rotation, separation = separation, visible = visible, width = js.Any.fromFunction1(width))
  
    __obj.asInstanceOf[IAxisLabels]
  }
}


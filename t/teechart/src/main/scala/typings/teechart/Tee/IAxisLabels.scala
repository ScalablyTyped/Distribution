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
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), labelStyle = labelStyle.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = js.Any.fromFunction1(width))
    __obj.asInstanceOf[IAxisLabels]
  }
}


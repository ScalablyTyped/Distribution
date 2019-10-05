package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeriesPointer extends js.Object {
  var chart: IChart
  var colorEach: Boolean
  var format: IFormat
  var height: Double
  var style: String
  var visible: Boolean
  var width: Double
}

object ISeriesPointer {
  @scala.inline
  def apply(
    chart: IChart,
    colorEach: Boolean,
    format: IFormat,
    height: Double,
    style: String,
    visible: Boolean,
    width: Double
  ): ISeriesPointer = {
    val __obj = js.Dynamic.literal(chart = chart, colorEach = colorEach, format = format, height = height, style = style, visible = visible, width = width)
  
    __obj.asInstanceOf[ISeriesPointer]
  }
}


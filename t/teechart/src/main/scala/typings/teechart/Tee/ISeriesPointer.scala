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
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], colorEach = colorEach.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeriesPointer]
  }
}


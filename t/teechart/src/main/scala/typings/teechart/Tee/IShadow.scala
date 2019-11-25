package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShadow extends js.Object {
  var blur: Double
  var chart: IChart
  var color: String
  var height: Double
  var visible: Boolean
  var width: Double
}

object IShadow {
  @scala.inline
  def apply(blur: Double, chart: IChart, color: String, height: Double, visible: Boolean, width: Double): IShadow = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IShadow]
  }
}


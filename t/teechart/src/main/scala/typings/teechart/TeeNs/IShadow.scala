package typings.teechart.TeeNs

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
    val __obj = js.Dynamic.literal(blur = blur, chart = chart, color = color, height = height, visible = visible, width = width)
  
    __obj.asInstanceOf[IShadow]
  }
}


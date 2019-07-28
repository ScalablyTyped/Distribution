package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGradient extends js.Object {
  var chart: IChart
  var colors: js.Array[String]
  var direction: String
  var offset: IPoint
  var stops: js.Array[Double]
  var visible: Boolean
}

object IGradient {
  @scala.inline
  def apply(
    chart: IChart,
    colors: js.Array[String],
    direction: String,
    offset: IPoint,
    stops: js.Array[Double],
    visible: Boolean
  ): IGradient = {
    val __obj = js.Dynamic.literal(chart = chart, colors = colors, direction = direction, offset = offset, stops = stops, visible = visible)
  
    __obj.asInstanceOf[IGradient]
  }
}


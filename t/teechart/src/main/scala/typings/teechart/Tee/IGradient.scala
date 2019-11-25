package typings.teechart.Tee

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
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGradient]
  }
}


package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStroke extends js.Object {
  var cap: String
  var chart: IChart
  var dash: js.Array[Double]
  var fill: String
  var gradient: IGradient
  var join: String
  var size: Double
}

object IStroke {
  @scala.inline
  def apply(
    cap: String,
    chart: IChart,
    dash: js.Array[Double],
    fill: String,
    gradient: IGradient,
    join: String,
    size: Double
  ): IStroke = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStroke]
  }
}


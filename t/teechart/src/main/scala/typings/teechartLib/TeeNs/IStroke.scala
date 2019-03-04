package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStroke extends js.Object {
  var cap: java.lang.String
  var chart: IChart
  var dash: js.Array[scala.Double]
  var fill: java.lang.String
  var gradient: IGradient
  var join: java.lang.String
  var size: scala.Double
}

object IStroke {
  @scala.inline
  def apply(
    cap: java.lang.String,
    chart: IChart,
    dash: js.Array[scala.Double],
    fill: java.lang.String,
    gradient: IGradient,
    join: java.lang.String,
    size: scala.Double
  ): IStroke = {
    val __obj = js.Dynamic.literal(cap = cap, chart = chart, dash = dash, fill = fill, gradient = gradient, join = join, size = size)
  
    __obj.asInstanceOf[IStroke]
  }
}


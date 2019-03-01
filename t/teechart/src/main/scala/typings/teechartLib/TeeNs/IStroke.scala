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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cap")(cap)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("dash")(dash)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("gradient")(gradient)
    __obj.updateDynamic("join")(join)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[IStroke]
  }
}


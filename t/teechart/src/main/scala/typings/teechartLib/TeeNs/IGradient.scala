package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGradient extends js.Object {
  var chart: IChart
  var colors: js.Array[java.lang.String]
  var direction: java.lang.String
  var offset: IPoint
  var stops: js.Array[scala.Double]
  var visible: scala.Boolean
}

object IGradient {
  @scala.inline
  def apply(
    chart: IChart,
    colors: js.Array[java.lang.String],
    direction: java.lang.String,
    offset: IPoint,
    stops: js.Array[scala.Double],
    visible: scala.Boolean
  ): IGradient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("stops")(stops)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IGradient]
  }
}


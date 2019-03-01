package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShadow extends js.Object {
  var blur: scala.Double
  var chart: IChart
  var color: java.lang.String
  var height: scala.Double
  var visible: scala.Boolean
  var width: scala.Double
}

object IShadow {
  @scala.inline
  def apply(
    blur: scala.Double,
    chart: IChart,
    color: java.lang.String,
    height: scala.Double,
    visible: scala.Boolean,
    width: scala.Double
  ): IShadow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blur")(blur)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IShadow]
  }
}


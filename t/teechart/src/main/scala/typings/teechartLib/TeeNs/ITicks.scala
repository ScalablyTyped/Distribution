package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITicks extends js.Object {
  var chart: IChart
  var length: scala.Double
  var stroke: IStroke
  var visible: scala.Boolean
}

object ITicks {
  @scala.inline
  def apply(chart: IChart, length: scala.Double, stroke: IStroke, visible: scala.Boolean): ITicks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("stroke")(stroke)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ITicks]
  }
}


package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMinorTicks extends ITicks {
  var count: scala.Double
}

object IMinorTicks {
  @scala.inline
  def apply(chart: IChart, count: scala.Double, length: scala.Double, stroke: IStroke, visible: scala.Boolean): IMinorTicks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("stroke")(stroke)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IMinorTicks]
  }
}


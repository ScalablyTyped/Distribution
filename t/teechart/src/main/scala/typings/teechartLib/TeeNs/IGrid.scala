package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrid extends js.Object {
  var chart: IChart
  var format: IFormat
  var lineDash: scala.Boolean
  var visible: scala.Boolean
}

object IGrid {
  @scala.inline
  def apply(chart: IChart, format: IFormat, lineDash: scala.Boolean, visible: scala.Boolean): IGrid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("lineDash")(lineDash)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IGrid]
  }
}


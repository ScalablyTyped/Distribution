package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrid extends js.Object {
  var chart: IChart
  var format: IFormat
  var lineDash: Boolean
  var visible: Boolean
}

object IGrid {
  @scala.inline
  def apply(chart: IChart, format: IFormat, lineDash: Boolean, visible: Boolean): IGrid = {
    val __obj = js.Dynamic.literal(chart = chart, format = format, lineDash = lineDash, visible = visible)
  
    __obj.asInstanceOf[IGrid]
  }
}


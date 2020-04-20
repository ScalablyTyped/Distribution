package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITicks extends js.Object {
  var chart: IChart
  var length: Double
  var stroke: IStroke
  var visible: Boolean
}

object ITicks {
  @scala.inline
  def apply(chart: IChart, length: Double, stroke: IStroke, visible: Boolean): ITicks = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITicks]
  }
}


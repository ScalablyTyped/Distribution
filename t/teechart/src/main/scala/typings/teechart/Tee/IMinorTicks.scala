package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMinorTicks extends ITicks {
  var count: Double
}

object IMinorTicks {
  @scala.inline
  def apply(chart: IChart, count: Double, length: Double, stroke: IStroke, visible: Boolean): IMinorTicks = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMinorTicks]
  }
}


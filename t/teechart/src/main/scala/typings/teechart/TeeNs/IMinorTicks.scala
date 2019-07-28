package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMinorTicks extends ITicks {
  var count: Double
}

object IMinorTicks {
  @scala.inline
  def apply(chart: IChart, count: Double, length: Double, stroke: IStroke, visible: Boolean): IMinorTicks = {
    val __obj = js.Dynamic.literal(chart = chart, count = count, length = length, stroke = stroke, visible = visible)
  
    __obj.asInstanceOf[IMinorTicks]
  }
}


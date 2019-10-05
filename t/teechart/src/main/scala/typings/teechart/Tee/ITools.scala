package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITools extends js.Object {
  var chart: IChart
  var items: js.Array[ITool]
  def add(tool: ITool): ITool
}

object ITools {
  @scala.inline
  def apply(add: ITool => ITool, chart: IChart, items: js.Array[ITool]): ITools = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), chart = chart, items = items)
  
    __obj.asInstanceOf[ITools]
  }
}


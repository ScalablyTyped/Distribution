package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITools extends js.Object {
  var chart: IChart = js.native
  var items: js.Array[ITool] = js.native
  def add(tool: ITool): ITool = js.native
}

object ITools {
  @scala.inline
  def apply(add: ITool => ITool, chart: IChart, items: js.Array[ITool]): ITools = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), chart = chart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITools]
  }
  @scala.inline
  implicit class IToolsOps[Self <: ITools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: ITool => ITool): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: ITool*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ITool]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}


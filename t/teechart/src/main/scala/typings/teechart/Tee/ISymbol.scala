package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISymbol extends js.Object {
  var chart: IChart = js.native
  var format: IFormat = js.native
  var height: Double = js.native
  var padding: Double = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
}

object ISymbol {
  @scala.inline
  def apply(chart: IChart, format: IFormat, height: Double, padding: Double, visible: Boolean, width: Double): ISymbol = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISymbol]
  }
  @scala.inline
  implicit class ISymbolOps[Self <: ISymbol] (val x: Self) extends AnyVal {
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
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: IFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}


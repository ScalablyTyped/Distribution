package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStroke extends js.Object {
  var cap: String = js.native
  var chart: IChart = js.native
  var dash: js.Array[Double] = js.native
  var fill: String = js.native
  var gradient: IGradient = js.native
  var join: String = js.native
  var size: Double = js.native
}

object IStroke {
  @scala.inline
  def apply(
    cap: String,
    chart: IChart,
    dash: js.Array[Double],
    fill: String,
    gradient: IGradient,
    join: String,
    size: Double
  ): IStroke = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStroke]
  }
  @scala.inline
  implicit class IStrokeOps[Self <: IStroke] (val x: Self) extends AnyVal {
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
    def setCap(value: String): Self = this.set("cap", value.asInstanceOf[js.Any])
    @scala.inline
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashVarargs(value: Double*): Self = this.set("dash", js.Array(value :_*))
    @scala.inline
    def setDash(value: js.Array[Double]): Self = this.set("dash", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradient(value: IGradient): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def setJoin(value: String): Self = this.set("join", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}


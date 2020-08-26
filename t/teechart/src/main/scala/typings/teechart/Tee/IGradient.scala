package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGradient extends js.Object {
  var chart: IChart = js.native
  var colors: js.Array[String] = js.native
  var direction: String = js.native
  var offset: IPoint = js.native
  var stops: js.Array[Double] = js.native
  var visible: Boolean = js.native
}

object IGradient {
  @scala.inline
  def apply(
    chart: IChart,
    colors: js.Array[String],
    direction: String,
    offset: IPoint,
    stops: js.Array[Double],
    visible: Boolean
  ): IGradient = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGradient]
  }
  @scala.inline
  implicit class IGradientOps[Self <: IGradient] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: IPoint): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopsVarargs(value: Double*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[Double]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}


package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGanttData extends ISeriesData {
  var end: js.Array[Double] = js.native
  var start: js.Array[Double] = js.native
  var x: js.Array[Double] = js.native
}

object IGanttData {
  @scala.inline
  def apply(
    end: js.Array[Double],
    labels: js.Array[String],
    source: js.Any,
    start: js.Array[Double],
    values: js.Array[Double],
    x: js.Array[Double]
  ): IGanttData = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGanttData]
  }
  @scala.inline
  implicit class IGanttDataOps[Self <: IGanttData] (val x: Self) extends AnyVal {
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
    def setEndVarargs(value: Double*): Self = this.set("end", js.Array(value :_*))
    @scala.inline
    def setEnd(value: js.Array[Double]): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartVarargs(value: Double*): Self = this.set("start", js.Array(value :_*))
    @scala.inline
    def setStart(value: js.Array[Double]): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setXVarargs(value: Double*): Self = this.set("x", js.Array(value :_*))
    @scala.inline
    def setX(value: js.Array[Double]): Self = this.set("x", value.asInstanceOf[js.Any])
  }
  
}


package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISeriesData extends js.Object {
  var labels: js.Array[String] = js.native
  var source: js.Any = js.native
  var values: js.Array[Double] = js.native
}

object ISeriesData {
  @scala.inline
  def apply(labels: js.Array[String], source: js.Any, values: js.Array[Double]): ISeriesData = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeriesData]
  }
  @scala.inline
  implicit class ISeriesDataOps[Self <: ISeriesData] (val x: Self) extends AnyVal {
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
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}


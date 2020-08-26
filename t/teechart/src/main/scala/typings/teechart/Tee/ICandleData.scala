package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandleData extends ISeriesData {
  var close: js.Array[Double] = js.native
  var high: js.Array[Double] = js.native
  var low: js.Array[Double] = js.native
  var open: js.Array[Double] = js.native
}

object ICandleData {
  @scala.inline
  def apply(
    close: js.Array[Double],
    high: js.Array[Double],
    labels: js.Array[String],
    low: js.Array[Double],
    open: js.Array[Double],
    source: js.Any,
    values: js.Array[Double]
  ): ICandleData = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICandleData]
  }
  @scala.inline
  implicit class ICandleDataOps[Self <: ICandleData] (val x: Self) extends AnyVal {
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
    def setCloseVarargs(value: Double*): Self = this.set("close", js.Array(value :_*))
    @scala.inline
    def setClose(value: js.Array[Double]): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighVarargs(value: Double*): Self = this.set("high", js.Array(value :_*))
    @scala.inline
    def setHigh(value: js.Array[Double]): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowVarargs(value: Double*): Self = this.set("low", js.Array(value :_*))
    @scala.inline
    def setLow(value: js.Array[Double]): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenVarargs(value: Double*): Self = this.set("open", js.Array(value :_*))
    @scala.inline
    def setOpen(value: js.Array[Double]): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}


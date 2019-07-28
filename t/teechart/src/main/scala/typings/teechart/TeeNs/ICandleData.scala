package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICandleData extends ISeriesData {
  var close: js.Array[Double]
  var high: js.Array[Double]
  var low: js.Array[Double]
  var open: js.Array[Double]
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
    val __obj = js.Dynamic.literal(close = close, high = high, labels = labels, low = low, open = open, source = source, values = values)
  
    __obj.asInstanceOf[ICandleData]
  }
}


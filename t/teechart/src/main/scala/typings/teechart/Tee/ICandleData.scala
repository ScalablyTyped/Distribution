package typings.teechart.Tee

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
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICandleData]
  }
}


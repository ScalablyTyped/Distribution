package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICandleData extends ISeriesData {
  var close: js.Array[scala.Double]
  var high: js.Array[scala.Double]
  var low: js.Array[scala.Double]
  var open: js.Array[scala.Double]
}

object ICandleData {
  @scala.inline
  def apply(
    close: js.Array[scala.Double],
    high: js.Array[scala.Double],
    labels: js.Array[java.lang.String],
    low: js.Array[scala.Double],
    open: js.Array[scala.Double],
    source: js.Any,
    values: js.Array[scala.Double]
  ): ICandleData = {
    val __obj = js.Dynamic.literal(close = close, high = high, labels = labels, low = low, open = open, source = source, values = values)
  
    __obj.asInstanceOf[ICandleData]
  }
}


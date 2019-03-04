package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBubbleData extends ISeriesData {
  var radius: js.Array[scala.Double]
}

object IBubbleData {
  @scala.inline
  def apply(
    labels: js.Array[java.lang.String],
    radius: js.Array[scala.Double],
    source: js.Any,
    values: js.Array[scala.Double]
  ): IBubbleData = {
    val __obj = js.Dynamic.literal(labels = labels, radius = radius, source = source, values = values)
  
    __obj.asInstanceOf[IBubbleData]
  }
}


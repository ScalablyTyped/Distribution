package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeriesData extends js.Object {
  var labels: js.Array[java.lang.String]
  var source: js.Any
  var values: js.Array[scala.Double]
}

object ISeriesData {
  @scala.inline
  def apply(labels: js.Array[java.lang.String], source: js.Any, values: js.Array[scala.Double]): ISeriesData = {
    val __obj = js.Dynamic.literal(labels = labels, source = source, values = values)
  
    __obj.asInstanceOf[ISeriesData]
  }
}


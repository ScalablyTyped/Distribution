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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[ISeriesData]
  }
}


package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGanttData extends ISeriesData {
  var end: js.Array[scala.Double]
  var start: js.Array[scala.Double]
  var x: js.Array[scala.Double]
}

object IGanttData {
  @scala.inline
  def apply(
    end: js.Array[scala.Double],
    labels: js.Array[java.lang.String],
    source: js.Any,
    start: js.Array[scala.Double],
    values: js.Array[scala.Double],
    x: js.Array[scala.Double]
  ): IGanttData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("values")(values)
    __obj.updateDynamic("x")(x)
    __obj.asInstanceOf[IGanttData]
  }
}


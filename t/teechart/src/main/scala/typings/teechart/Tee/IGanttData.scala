package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGanttData extends ISeriesData {
  var end: js.Array[Double]
  var start: js.Array[Double]
  var x: js.Array[Double]
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
}


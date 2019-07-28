package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeriesData extends js.Object {
  var labels: js.Array[String]
  var source: js.Any
  var values: js.Array[Double]
}

object ISeriesData {
  @scala.inline
  def apply(labels: js.Array[String], source: js.Any, values: js.Array[Double]): ISeriesData = {
    val __obj = js.Dynamic.literal(labels = labels, source = source, values = values)
  
    __obj.asInstanceOf[ISeriesData]
  }
}


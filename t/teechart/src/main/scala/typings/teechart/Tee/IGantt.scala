package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGantt extends ISeriesNoBounds {
  @JSName("data")
  var data_IGantt: IGanttData = js.native
  var dateFormat: String = js.native
  var height: Double = js.native
  var margin: IPoint = js.native
  def add(index: Double, label: String, start: Double, end: Double): Unit = js.native
  def bounds(index: Double, rectangle: IRectangle): Unit = js.native
}


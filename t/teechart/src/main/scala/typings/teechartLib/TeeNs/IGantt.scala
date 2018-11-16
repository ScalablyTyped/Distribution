package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGantt extends ISeriesNoBounds {
  @JSName("data")
  var data_IGantt: IGanttData = js.native
  var dateFormat: java.lang.String = js.native
  var height: scala.Double = js.native
  var margin: IPoint = js.native
  def add(index: scala.Double, label: java.lang.String, start: scala.Double, end: scala.Double): scala.Unit = js.native
  def bounds(index: scala.Double, rectangle: IRectangle): scala.Unit = js.native
}


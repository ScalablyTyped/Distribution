package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGantt extends ISeriesNoBounds {
  
  def add(index: Double, label: String, start: Double, end: Double): Unit = js.native
  
  def bounds(index: Double, rectangle: IRectangle): Unit = js.native
  
  @JSName("data")
  var data_IGantt: IGanttData = js.native
  
  var dateFormat: String = js.native
  
  var height: Double = js.native
  
  var margin: IPoint = js.native
}

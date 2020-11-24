package typings.vexJs.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vex extends js.Object {
  
  def close(): Boolean = js.native
  def close(id: Double): Boolean = js.native
  
  def closeAll(): Boolean = js.native
  
  def closeByID(id: Double): Boolean = js.native
  
  var defaultOptions: js.UndefOr[IVexOptions] = js.native
  
  def open(options: IVexOptions): JQuery[HTMLElement] = js.native
}

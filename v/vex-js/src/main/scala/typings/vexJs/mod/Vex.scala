package typings.vexJs.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vex extends js.Object {
  var defaultOptions: js.UndefOr[IVexOptions] = js.native
  def close(): Boolean = js.native
  def close(id: Double): Boolean = js.native
  def closeAll(): Boolean = js.native
  def closeByID(id: Double): Boolean = js.native
  def open(options: IVexOptions): JQuery[HTMLElement] = js.native
}


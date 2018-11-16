package typings
package vexDashJsLib.vexDashJsMod.vexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vex extends js.Object {
  var defaultOptions: js.UndefOr[IVexOptions] = js.native
  def close(): scala.Boolean = js.native
  def close(id: scala.Double): scala.Boolean = js.native
  def closeAll(): scala.Boolean = js.native
  def closeByID(id: scala.Double): scala.Boolean = js.native
  def open(options: IVexOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
}


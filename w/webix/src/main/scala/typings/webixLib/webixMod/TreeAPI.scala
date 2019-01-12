package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeAPI extends js.Object {
  def close(id: java.lang.String): scala.Unit = js.native
  def close(id: scala.Double): scala.Unit = js.native
  def closeAll(): scala.Unit = js.native
  def getOpenItems(): js.Array[_] = js.native
  def getState(): js.Any = js.native
  def isBranchOpen(id: java.lang.String): scala.Boolean = js.native
  def isBranchOpen(id: scala.Double): scala.Boolean = js.native
  def open(id: java.lang.String): scala.Unit = js.native
  def open(id: java.lang.String, show: scala.Boolean): scala.Unit = js.native
  def open(id: scala.Double): scala.Unit = js.native
  def open(id: scala.Double, show: scala.Boolean): scala.Unit = js.native
  def openAll(): scala.Unit = js.native
  def setState(state: js.Any): scala.Unit = js.native
}


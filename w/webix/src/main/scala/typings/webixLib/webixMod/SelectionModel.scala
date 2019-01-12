package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionModel extends js.Object {
  def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
  def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
  def isSelected(id: java.lang.String): scala.Boolean = js.native
  def isSelected(id: scala.Double): scala.Boolean = js.native
  def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
  def selectAll(): scala.Unit = js.native
  def selectAll(from: java.lang.String): scala.Unit = js.native
  def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def unselect(): scala.Unit = js.native
  def unselect(id: java.lang.String): scala.Unit = js.native
  def unselectAll(): scala.Unit = js.native
}


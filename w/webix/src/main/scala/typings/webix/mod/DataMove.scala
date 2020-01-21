package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMove extends js.Object {
  def copy(sid: String, tindex: Double): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: js.Any): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: js.Any, details: js.Any): Unit = js.native
  def copy(sid: Double, tindex: Double): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: js.Any): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: js.Any, details: js.Any): Unit = js.native
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: js.Any): String = js.native
  def move(sid: String, tindex: Double, tobj: js.Any, details: js.Any): String = js.native
  def moveBottom(id: String): Unit = js.native
  def moveBottom(id: Double): Unit = js.native
  def moveDown(id: String, step: Double): Unit = js.native
  def moveDown(id: Double, step: Double): Unit = js.native
  def moveTop(id: String): Unit = js.native
  def moveTop(id: Double): Unit = js.native
  def moveUp(id: String, step: Double): Unit = js.native
  def moveUp(id: Double, step: Double): Unit = js.native
}

@JSImport("webix", "DataMove")
@js.native
object DataMove extends TopLevel[DataMove]


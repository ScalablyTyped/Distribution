package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionBind extends js.Object {
  def getCursor(): Double = js.native
  def refreshCursor(): Unit = js.native
  def setCursor(cursor: String): Unit = js.native
  def setCursor(cursor: Double): Unit = js.native
}

@JSGlobal("webix.CollectionBind")
@js.native
object CollectionBind extends TopLevel[CollectionBind]


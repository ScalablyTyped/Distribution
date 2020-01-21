package typings.webix.mod

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

@JSImport("webix", "CollectionBind")
@js.native
object CollectionBind extends TopLevel[CollectionBind]


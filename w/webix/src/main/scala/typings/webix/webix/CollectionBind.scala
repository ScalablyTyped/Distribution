package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionBind extends js.Object {
  
  def getCursor(): Double = js.native
  
  def refreshCursor(): Unit = js.native
  
  def setCursor(cursor: String): Unit = js.native
  def setCursor(cursor: Double): Unit = js.native
}

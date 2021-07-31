package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionBind extends StObject {
  
  def getCursor(): Double = js.native
  
  def refreshCursor(): Unit = js.native
  
  def setCursor(cursor: String): Unit = js.native
  def setCursor(cursor: Double): Unit = js.native
}
object CollectionBind {
  
  @scala.inline
  def apply: CollectionBind = ^.asInstanceOf[js.Dynamic].selectDynamic("CollectionBind").asInstanceOf[CollectionBind]
}

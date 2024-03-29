package typings.webix.mod

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderStack extends StObject {
  
  def customize(obj: obj): Unit = js.native
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def locate(e: Event): String | Double = js.native
  
  def render(id: String, data: obj, `type`: String): Unit = js.native
  def render(id: Double, data: obj, `type`: String): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  
  var `type`: obj = js.native
  
  var types: obj = js.native
}
object RenderStack {
  
  inline def apply: RenderStack = ^.asInstanceOf[js.Dynamic].selectDynamic("RenderStack").asInstanceOf[RenderStack]
}

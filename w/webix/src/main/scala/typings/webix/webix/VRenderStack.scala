package typings.webix.webix

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRenderStack extends StObject {
  
  @JSName("$dragDestroy")
  def $dragDestroy(args: Any*): Any = js.native
  @JSName("$dragDestroy")
  var $dragDestroy_Original: WebixCallback = js.native
  
  @JSName("$setSize")
  def $setSize(x: Double, y: Double): Boolean = js.native
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def render(id: String, data: obj, `type`: String): Unit = js.native
  def render(id: Double, data: obj, `type`: String): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
}

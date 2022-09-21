package typings.webix.mod

import typings.std.HTMLElement
import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRenderStack extends StObject {
  
  @JSName("$setSize")
  def $setSize(x: Double, y: Double): Boolean = js.native
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
}
object VRenderStack {
  
  inline def apply: VRenderStack = ^.asInstanceOf[js.Dynamic].selectDynamic("VRenderStack").asInstanceOf[VRenderStack]
}

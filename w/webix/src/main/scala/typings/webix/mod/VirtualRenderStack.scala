package typings.webix.mod

import typings.std.HTMLElement
import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRenderStack extends StObject {
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
}
object VirtualRenderStack {
  
  @scala.inline
  def apply: VirtualRenderStack = ^.asInstanceOf[js.Dynamic].selectDynamic("VirtualRenderStack").asInstanceOf[VirtualRenderStack]
}

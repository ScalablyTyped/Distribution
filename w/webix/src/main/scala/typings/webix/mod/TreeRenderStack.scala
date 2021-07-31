package typings.webix.mod

import typings.std.HTMLElement
import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeRenderStack extends StObject {
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
}
object TreeRenderStack {
  
  @scala.inline
  def apply: TreeRenderStack = ^.asInstanceOf[js.Dynamic].selectDynamic("TreeRenderStack").asInstanceOf[TreeRenderStack]
}

package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRenderStack extends js.Object {
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
}

@JSImport("webix", "VirtualRenderStack")
@js.native
object VirtualRenderStack extends TopLevel[VirtualRenderStack]


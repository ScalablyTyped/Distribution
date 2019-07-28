package typings.webix.webixMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRenderStack extends js.Object {
  @JSName("$setSize")
  def $setSize(x: Double, y: Double): Boolean = js.native
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
}


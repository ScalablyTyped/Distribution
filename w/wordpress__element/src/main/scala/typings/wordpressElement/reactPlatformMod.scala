package typings.wordpressElement

import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.reactDom.mod.Renderer
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/element/react-platform", JSImport.Namespace)
@js.native
object reactPlatformMod extends js.Object {
  val render: Renderer = js.native
  def createPortal(children: ReactNode, container: Element): ReactPortal = js.native
  def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = js.native
  def findDOMNode(): Element | Null | Text = js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
}


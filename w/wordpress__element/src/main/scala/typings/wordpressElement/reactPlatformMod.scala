package typings.wordpressElement

import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.reactDom.mod.Renderer
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactPlatformMod {
  
  @JSImport("@wordpress/element/build-types/react-platform", "createPortal")
  @js.native
  def createPortal(children: ReactNode, container: Element): ReactPortal = js.native
  @JSImport("@wordpress/element/build-types/react-platform", "createPortal")
  @js.native
  def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = js.native
  
  @JSImport("@wordpress/element/build-types/react-platform", "findDOMNode")
  @js.native
  def findDOMNode(): Element | Null | Text = js.native
  @JSImport("@wordpress/element/build-types/react-platform", "findDOMNode")
  @js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  
  @JSImport("@wordpress/element/build-types/react-platform", "render")
  @js.native
  val render: Renderer = js.native
  
  @JSImport("@wordpress/element/build-types/react-platform", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  @JSImport("@wordpress/element/build-types/react-platform", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
}

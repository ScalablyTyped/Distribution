package typings.atWordpressElement.atWordpressElementMod

import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactPortal
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// ReactDOM re-exports
//
@JSImport("@wordpress/element", "createPortal")
@js.native
object createPortal extends js.Object {
  def apply(children: ReactNode, container: Element): ReactPortal = js.native
  def apply(children: ReactNode, container: Element, key: String): ReactPortal = js.native
}


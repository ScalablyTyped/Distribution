package typings.virtualDashDom.VirtualDOMNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VHook extends js.Object {
  def hook(node: Element, propertyName: String): Unit
  def unhook(node: Element, propertyName: String): Unit
}

object VHook {
  @scala.inline
  def apply(hook: (Element, String) => Unit, unhook: (Element, String) => Unit): VHook = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction2(hook), unhook = js.Any.fromFunction2(unhook))
  
    __obj.asInstanceOf[VHook]
  }
}


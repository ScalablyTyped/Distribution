package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VHook extends js.Object {
  def hook(node: stdLib.Element, propertyName: java.lang.String): scala.Unit
  def unhook(node: stdLib.Element, propertyName: java.lang.String): scala.Unit
}

object VHook {
  @scala.inline
  def apply(
    hook: (stdLib.Element, java.lang.String) => scala.Unit,
    unhook: (stdLib.Element, java.lang.String) => scala.Unit
  ): VHook = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction2(hook), unhook = js.Any.fromFunction2(unhook))
  
    __obj.asInstanceOf[VHook]
  }
}


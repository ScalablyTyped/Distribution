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
    hook: js.Function2[stdLib.Element, java.lang.String, scala.Unit],
    unhook: js.Function2[stdLib.Element, java.lang.String, scala.Unit]
  ): VHook = {
    val __obj = js.Dynamic.literal(hook = hook, unhook = unhook)
  
    __obj.asInstanceOf[VHook]
  }
}


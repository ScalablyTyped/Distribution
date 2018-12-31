package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VHook extends js.Object {
  def hook(node: stdLib.Element, propertyName: java.lang.String): scala.Unit
  def unhook(node: stdLib.Element, propertyName: java.lang.String): scala.Unit
}


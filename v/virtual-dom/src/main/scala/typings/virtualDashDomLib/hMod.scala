package typings
package virtualDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  def apply(
    tagName: java.lang.String,
    children: java.lang.String | js.Array[virtualDashDomLib.VirtualDOMNs.VChild]
  ): virtualDashDomLib.VirtualDOMNs.VNode = js.native
  def apply(
    tagName: java.lang.String,
    properties: virtualDashDomLib.VirtualDOMNs.createProperties,
    children: java.lang.String | js.Array[virtualDashDomLib.VirtualDOMNs.VChild]
  ): virtualDashDomLib.VirtualDOMNs.VNode = js.native
}


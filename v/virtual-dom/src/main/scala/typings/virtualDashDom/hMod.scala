package typings.virtualDashDom

import typings.virtualDashDom.VirtualDOMNs.VChild
import typings.virtualDashDom.VirtualDOMNs.VNode
import typings.virtualDashDom.VirtualDOMNs.createProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  def apply(tagName: String, children: String | js.Array[VChild]): VNode = js.native
  def apply(tagName: String, properties: createProperties, children: String | js.Array[VChild]): VNode = js.native
}


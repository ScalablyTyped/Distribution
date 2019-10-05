package typings.virtualDashDom

import typings.virtualDashDom.VirtualDOM.VChild
import typings.virtualDashDom.VirtualDOM.VNode
import typings.virtualDashDom.VirtualDOM.createProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  def apply(tagName: String, children: String): VNode = js.native
  def apply(tagName: String, children: js.Array[VChild]): VNode = js.native
  def apply(tagName: String, properties: createProperties, children: String): VNode = js.native
  def apply(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
}


package typings.virtualDom

import typings.virtualDom.VirtualDOM.VChild
import typings.virtualDom.VirtualDOM.VNode
import typings.virtualDom.VirtualDOM.createProperties
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


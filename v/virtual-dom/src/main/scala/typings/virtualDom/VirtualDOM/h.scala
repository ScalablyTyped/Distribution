package typings.virtualDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VirtualDOM.h")
@js.native
object h extends js.Object {
  def apply(tagName: String, children: String): VNode = js.native
  def apply(tagName: String, children: js.Array[VChild]): VNode = js.native
  def apply(tagName: String, properties: createProperties, children: String): VNode = js.native
  def apply(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
}


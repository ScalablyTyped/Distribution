package typings.virtualDom.vnodeMod

import org.scalablytyped.runtime.TopLevel
import typings.virtualDom.VirtualDOM.VNode
import typings.virtualDom.VirtualDOM.VNodeConstructor
import typings.virtualDom.VirtualDOM.VProperties
import typings.virtualDom.VirtualDOM.VTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
@js.native
class ^ protected () extends VNode {
  def this(tagName: String, properties: VProperties, children: js.Array[VTree]) = this()
  def this(tagName: String, properties: VProperties, children: js.Array[VTree], key: String) = this()
  def this(
    tagName: String,
    properties: VProperties,
    children: js.Array[VTree],
    key: js.UndefOr[scala.Nothing],
    namespace: String
  ) = this()
  def this(
    tagName: String,
    properties: VProperties,
    children: js.Array[VTree],
    key: String,
    namespace: String
  ) = this()
}
@JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
@js.native
object ^ extends TopLevel[VNodeConstructor]

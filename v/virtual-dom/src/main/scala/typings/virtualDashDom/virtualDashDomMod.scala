package typings.virtualDashDom

import typings.std.Element
import typings.std.Text
import typings.virtualDashDom.VirtualDOMNs.Thunk
import typings.virtualDashDom.VirtualDOMNs.VChild
import typings.virtualDashDom.VirtualDOMNs.VNode
import typings.virtualDashDom.VirtualDOMNs.VPatch
import typings.virtualDashDom.VirtualDOMNs.VPatchOptions
import typings.virtualDashDom.VirtualDOMNs.VText
import typings.virtualDashDom.VirtualDOMNs.VTree
import typings.virtualDashDom.VirtualDOMNs.Widget
import typings.virtualDashDom.VirtualDOMNs.createProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom", JSImport.Namespace)
@js.native
object virtualDashDomMod extends js.Object {
  def create(vnode: Thunk): Element = js.native
  def create(vnode: Thunk, opts: Anon_Document): Element = js.native
  def create(vnode: VNode): Element = js.native
  def create(vnode: VNode, opts: Anon_Document): Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def create(vnode: VText): Text = js.native
  def create(vnode: VText, opts: Anon_Document): Text = js.native
  def create(vnode: Widget): Element = js.native
  def create(vnode: Widget, opts: Anon_Document): Element = js.native
  def diff(left: VTree, right: VTree): js.Array[VPatch] = js.native
  def h(tagName: String, children: String): VNode = js.native
  def h(tagName: String, children: js.Array[VChild]): VNode = js.native
  def h(tagName: String, properties: createProperties, children: String): VNode = js.native
  def h(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
  def isThunk(vTree: VTree): /* is virtual-dom.VirtualDOM.Thunk */ Boolean = js.native
  def isVNode(vTree: VTree): /* is virtual-dom.VirtualDOM.VNode */ Boolean = js.native
  def isVText(vTree: VTree): /* is virtual-dom.VirtualDOM.VText */ Boolean = js.native
  def isWidget(vTree: VTree): /* is virtual-dom.VirtualDOM.Widget */ Boolean = js.native
  /**
    patch() usually just returns rootNode after doing stuff to it, so we want
    to preserve that type (though it will usually be just Element).
    */
  def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch]): T = js.native
  def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch], renderOptions: VPatchOptions[T]): T = js.native
}


package typings
package virtualDashDomLib.virtualDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom", JSImport.Namespace)
@js.native
object virtualDashDomModMembers extends js.Object {
  def create(vnode: virtualDashDomLib.VirtualDOMNs.Thunk): stdLib.Element = js.native
  def create(vnode: virtualDashDomLib.VirtualDOMNs.Thunk, opts: virtualDashDomLib.Anon_Warn): stdLib.Element = js.native
  def create(vnode: virtualDashDomLib.VirtualDOMNs.VNode): stdLib.Element = js.native
  def create(vnode: virtualDashDomLib.VirtualDOMNs.VNode, opts: virtualDashDomLib.Anon_Warn): stdLib.Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def create(vnode: virtualDashDomLib.VirtualDOMNs.VText): stdLib.Text = js.native
  def create(vnode: virtualDashDomLib.VirtualDOMNs.VText, opts: virtualDashDomLib.Anon_Warn): stdLib.Text = js.native
  def create(vnode: virtualDashDomLib.VirtualDOMNs.Widget): stdLib.Element = js.native
  def create(vnode: virtualDashDomLib.VirtualDOMNs.Widget, opts: virtualDashDomLib.Anon_Warn): stdLib.Element = js.native
  def diff(left: virtualDashDomLib.VirtualDOMNs.VTree, right: virtualDashDomLib.VirtualDOMNs.VTree): js.Array[virtualDashDomLib.VirtualDOMNs.VPatch] = js.native
  def h(tagName: java.lang.String, children: java.lang.String): virtualDashDomLib.VirtualDOMNs.VNode = js.native
  def h(tagName: java.lang.String, children: js.Array[virtualDashDomLib.VirtualDOMNs.VChild]): virtualDashDomLib.VirtualDOMNs.VNode = js.native
  def h(
    tagName: java.lang.String,
    properties: virtualDashDomLib.VirtualDOMNs.createProperties,
    children: java.lang.String
  ): virtualDashDomLib.VirtualDOMNs.VNode = js.native
  def h(
    tagName: java.lang.String,
    properties: virtualDashDomLib.VirtualDOMNs.createProperties,
    children: js.Array[virtualDashDomLib.VirtualDOMNs.VChild]
  ): virtualDashDomLib.VirtualDOMNs.VNode = js.native
  def isThunk(vTree: virtualDashDomLib.VirtualDOMNs.VTree): /* is virtual-dom.VirtualDOM.Thunk */ scala.Boolean = js.native
  def isVNode(vTree: virtualDashDomLib.VirtualDOMNs.VTree): /* is virtual-dom.VirtualDOM.VNode */ scala.Boolean = js.native
  def isVText(vTree: virtualDashDomLib.VirtualDOMNs.VTree): /* is virtual-dom.VirtualDOM.VText */ scala.Boolean = js.native
  def isWidget(vTree: virtualDashDomLib.VirtualDOMNs.VTree): /* is virtual-dom.VirtualDOM.Widget */ scala.Boolean = js.native
  /**
    patch() usually just returns rootNode after doing stuff to it, so we want
    to preserve that type (though it will usually be just Element).
    */
  def patch[T /* <: stdLib.Element */](rootNode: T, patches: js.Array[virtualDashDomLib.VirtualDOMNs.VPatch]): T = js.native
  def patch[T /* <: stdLib.Element */](
    rootNode: T,
    patches: js.Array[virtualDashDomLib.VirtualDOMNs.VPatch],
    renderOptions: virtualDashDomLib.VirtualDOMNs.VPatchOptions[T]
  ): T = js.native
}


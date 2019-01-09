package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VirtualDOM")
@js.native
object VirtualDOMNsMembers extends js.Object {
  def create(vnode: Thunk): stdLib.Element = js.native
  def create(vnode: Thunk, opts: virtualDashDomLib.Anon_Document): stdLib.Element = js.native
  def create(vnode: VNode): stdLib.Element = js.native
  def create(vnode: VNode, opts: virtualDashDomLib.Anon_Document): stdLib.Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def create(vnode: VText): stdLib.Text = js.native
  def create(vnode: VText, opts: virtualDashDomLib.Anon_Document): stdLib.Text = js.native
  def create(vnode: Widget): stdLib.Element = js.native
  def create(vnode: Widget, opts: virtualDashDomLib.Anon_Document): stdLib.Element = js.native
  def diff(left: VTree, right: VTree): js.Array[VPatch] = js.native
  def h(tagName: java.lang.String, children: java.lang.String): VNode = js.native
  def h(tagName: java.lang.String, children: js.Array[VChild]): VNode = js.native
  def h(tagName: java.lang.String, properties: createProperties, children: java.lang.String): VNode = js.native
  def h(tagName: java.lang.String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
  def isThunk(vTree: VTree): /* is virtual-dom.VirtualDOM.Thunk */ scala.Boolean = js.native
  def isVNode(vTree: VTree): /* is virtual-dom.VirtualDOM.VNode */ scala.Boolean = js.native
  def isVText(vTree: VTree): /* is virtual-dom.VirtualDOM.VText */ scala.Boolean = js.native
  def isWidget(vTree: VTree): /* is virtual-dom.VirtualDOM.Widget */ scala.Boolean = js.native
  /**
    patch() usually just returns rootNode after doing stuff to it, so we want
    to preserve that type (though it will usually be just Element).
    */
  def patch[T /* <: stdLib.Element */](rootNode: T, patches: js.Array[VPatch]): T = js.native
  def patch[T /* <: stdLib.Element */](rootNode: T, patches: js.Array[VPatch], renderOptions: VPatchOptions[T]): T = js.native
}


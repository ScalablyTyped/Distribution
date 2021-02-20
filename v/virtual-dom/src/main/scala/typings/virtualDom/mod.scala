package typings.virtualDom

import typings.std.Element
import typings.std.Text
import typings.virtualDom.VirtualDOM.Thunk
import typings.virtualDom.VirtualDOM.VChild
import typings.virtualDom.VirtualDOM.VNode
import typings.virtualDom.VirtualDOM.VPatch
import typings.virtualDom.VirtualDOM.VPatchOptions
import typings.virtualDom.VirtualDOM.VText
import typings.virtualDom.VirtualDOM.VTree
import typings.virtualDom.VirtualDOM.Widget
import typings.virtualDom.VirtualDOM.createProperties
import typings.virtualDom.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("virtual-dom", "create")
  @js.native
  def create(vnode: Thunk): Element = js.native
  @JSImport("virtual-dom", "create")
  @js.native
  def create(vnode: Thunk, opts: Document): Element = js.native
  @JSImport("virtual-dom", "create")
  @js.native
  def create(vnode: VNode): Element = js.native
  @JSImport("virtual-dom", "create")
  @js.native
  def create(vnode: VNode, opts: Document): Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  @JSImport("virtual-dom", "create")
  @js.native
  def create(vnode: VText): Text = js.native
  @JSImport("virtual-dom", "create")
  @js.native
  def create(vnode: VText, opts: Document): Text = js.native
  @JSImport("virtual-dom", "create")
  @js.native
  def create(vnode: Widget): Element = js.native
  @JSImport("virtual-dom", "create")
  @js.native
  def create(vnode: Widget, opts: Document): Element = js.native
  
  @JSImport("virtual-dom", "diff")
  @js.native
  def diff(left: VTree, right: VTree): js.Array[VPatch] = js.native
  
  @JSImport("virtual-dom", "h")
  @js.native
  def h(tagName: String, children: String): VNode = js.native
  @JSImport("virtual-dom", "h")
  @js.native
  def h(tagName: String, children: js.Array[VChild]): VNode = js.native
  @JSImport("virtual-dom", "h")
  @js.native
  def h(tagName: String, properties: createProperties, children: String): VNode = js.native
  @JSImport("virtual-dom", "h")
  @js.native
  def h(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
  
  @JSImport("virtual-dom", "isThunk")
  @js.native
  def isThunk(vTree: VTree): /* is virtual-dom.VirtualDOM.Thunk */ Boolean = js.native
  
  @JSImport("virtual-dom", "isVNode")
  @js.native
  def isVNode(vTree: VTree): /* is virtual-dom.VirtualDOM.VNode */ Boolean = js.native
  
  @JSImport("virtual-dom", "isVText")
  @js.native
  def isVText(vTree: VTree): /* is virtual-dom.VirtualDOM.VText */ Boolean = js.native
  
  @JSImport("virtual-dom", "isWidget")
  @js.native
  def isWidget(vTree: VTree): /* is virtual-dom.VirtualDOM.Widget */ Boolean = js.native
  
  /**
    patch() usually just returns rootNode after doing stuff to it, so we want
    to preserve that type (though it will usually be just Element).
    */
  @JSImport("virtual-dom", "patch")
  @js.native
  def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch]): T = js.native
  @JSImport("virtual-dom", "patch")
  @js.native
  def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch], renderOptions: VPatchOptions[T]): T = js.native
}

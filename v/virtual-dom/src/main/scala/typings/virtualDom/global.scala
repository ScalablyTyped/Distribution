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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object VirtualDOM {
    
    @JSGlobal("VirtualDOM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(vnode: Thunk): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def create(vnode: Thunk, opts: Document): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def create(vnode: VNode): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def create(vnode: VNode, opts: Document): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
    /**
      create() calls either document.createElement() or document.createElementNS(),
      for which the common denominator is Element (not HTMLElement).
      */
    inline def create(vnode: VText): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any]).asInstanceOf[Text]
    inline def create(vnode: VText, opts: Document): Text = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Text]
    inline def create(vnode: Widget): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def create(vnode: Widget, opts: Document): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    inline def diff(left: VTree, right: VTree): js.Array[VPatch] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[VPatch]]
    
    inline def h(tagName: String, children: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(tagName.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(tagName: String, children: js.Array[VChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(tagName.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(tagName: String, properties: createProperties, children: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(tagName.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(tagName.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    
    inline def isThunk(vTree: VTree): /* is virtual-dom.VirtualDOM.Thunk */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThunk")(vTree.asInstanceOf[js.Any]).asInstanceOf[/* is virtual-dom.VirtualDOM.Thunk */ Boolean]
    
    inline def isVNode(vTree: VTree): /* is virtual-dom.VirtualDOM.VNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVNode")(vTree.asInstanceOf[js.Any]).asInstanceOf[/* is virtual-dom.VirtualDOM.VNode */ Boolean]
    
    inline def isVText(vTree: VTree): /* is virtual-dom.VirtualDOM.VText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVText")(vTree.asInstanceOf[js.Any]).asInstanceOf[/* is virtual-dom.VirtualDOM.VText */ Boolean]
    
    inline def isWidget(vTree: VTree): /* is virtual-dom.VirtualDOM.Widget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWidget")(vTree.asInstanceOf[js.Any]).asInstanceOf[/* is virtual-dom.VirtualDOM.Widget */ Boolean]
    
    /**
      patch() usually just returns rootNode after doing stuff to it, so we want
      to preserve that type (though it will usually be just Element).
      */
    inline def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(rootNode.asInstanceOf[js.Any], patches.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch], renderOptions: VPatchOptions[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(rootNode.asInstanceOf[js.Any], patches.asInstanceOf[js.Any], renderOptions.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}

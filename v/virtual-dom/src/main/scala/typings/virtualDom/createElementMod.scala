package typings.virtualDom

import typings.std.Element
import typings.std.Text
import typings.virtualDom.VirtualDOM.Thunk
import typings.virtualDom.VirtualDOM.VNode
import typings.virtualDom.VirtualDOM.VText
import typings.virtualDom.VirtualDOM.Widget
import typings.virtualDom.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createElementMod {
  
  @scala.inline
  def apply(vnode: Thunk): Element = ^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
  @scala.inline
  def apply(vnode: Thunk, opts: Document): Element = (^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def apply(vnode: VNode): Element = ^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
  @scala.inline
  def apply(vnode: VNode, opts: Document): Element = (^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  @scala.inline
  def apply(vnode: VText): Text = ^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any]).asInstanceOf[Text]
  @scala.inline
  def apply(vnode: VText, opts: Document): Text = (^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Text]
  @scala.inline
  def apply(vnode: Widget): Element = ^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
  @scala.inline
  def apply(vnode: Widget, opts: Document): Element = (^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

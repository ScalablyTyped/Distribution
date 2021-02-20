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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createElementMod {
  
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: Thunk): Element = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: Thunk, opts: Document): Element = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: VNode): Element = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: VNode, opts: Document): Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: VText): Text = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: VText, opts: Document): Text = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: Widget): Element = js.native
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  def apply(vnode: Widget, opts: Document): Element = js.native
}

package typings.virtualDom

import typings.std.Element
import typings.std.Text
import typings.virtualDom.VirtualDOM.Thunk
import typings.virtualDom.VirtualDOM.VNode
import typings.virtualDom.VirtualDOM.VText
import typings.virtualDom.VirtualDOM.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/create-element", JSImport.Namespace)
@js.native
object createElementMod extends js.Object {
  def apply(vnode: Thunk): Element = js.native
  def apply(vnode: Thunk, opts: AnonDocument): Element = js.native
  def apply(vnode: VNode): Element = js.native
  def apply(vnode: VNode, opts: AnonDocument): Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def apply(vnode: VText): Text = js.native
  def apply(vnode: VText, opts: AnonDocument): Text = js.native
  def apply(vnode: Widget): Element = js.native
  def apply(vnode: Widget, opts: AnonDocument): Element = js.native
}


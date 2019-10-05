package typings.virtualDashDom.VirtualDOM

import typings.std.Element
import typings.std.Text
import typings.virtualDashDom.Anon_Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VirtualDOM.create")
@js.native
object create extends js.Object {
  def apply(vnode: Thunk): Element = js.native
  def apply(vnode: Thunk, opts: Anon_Document): Element = js.native
  def apply(vnode: VNode): Element = js.native
  def apply(vnode: VNode, opts: Anon_Document): Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def apply(vnode: VText): Text = js.native
  def apply(vnode: VText, opts: Anon_Document): Text = js.native
  def apply(vnode: Widget): Element = js.native
  def apply(vnode: Widget, opts: Anon_Document): Element = js.native
}


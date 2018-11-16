package typings
package virtualDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/create-element", JSImport.Namespace)
@js.native
object createDashElementMod extends js.Object {
  def apply(
    vnode: virtualDashDomLib.VirtualDOMNs.VNode | virtualDashDomLib.VirtualDOMNs.Widget | virtualDashDomLib.VirtualDOMNs.Thunk
  ): stdLib.Element = js.native
  def apply(
    vnode: virtualDashDomLib.VirtualDOMNs.VNode | virtualDashDomLib.VirtualDOMNs.Widget | virtualDashDomLib.VirtualDOMNs.Thunk,
    opts: virtualDashDomLib.Anon_Warn
  ): stdLib.Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def apply(vnode: virtualDashDomLib.VirtualDOMNs.VText): stdLib.Text = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def apply(vnode: virtualDashDomLib.VirtualDOMNs.VText, opts: virtualDashDomLib.Anon_Warn): stdLib.Text = js.native
}


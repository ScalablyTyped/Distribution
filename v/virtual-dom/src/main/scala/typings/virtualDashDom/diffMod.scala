package typings.virtualDashDom

import typings.virtualDashDom.VirtualDOMNs.VPatch
import typings.virtualDashDom.VirtualDOMNs.VTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  def apply(left: VTree, right: VTree): js.Array[VPatch] = js.native
}


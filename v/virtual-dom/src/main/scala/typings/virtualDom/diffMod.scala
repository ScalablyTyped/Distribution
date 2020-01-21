package typings.virtualDom

import typings.virtualDom.VirtualDOM.VPatch
import typings.virtualDom.VirtualDOM.VTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  def apply(left: VTree, right: VTree): js.Array[VPatch] = js.native
}


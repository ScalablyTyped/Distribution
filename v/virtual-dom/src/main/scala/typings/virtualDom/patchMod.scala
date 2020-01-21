package typings.virtualDom

import typings.std.Element
import typings.virtualDom.VirtualDOM.VPatch
import typings.virtualDom.VirtualDOM.VPatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/patch", JSImport.Namespace)
@js.native
object patchMod extends js.Object {
  /**
    patch() usually just returns rootNode after doing stuff to it, so we want
    to preserve that type (though it will usually be just Element).
    */
  def apply[T /* <: Element */](rootNode: T, patches: js.Array[VPatch]): T = js.native
  def apply[T /* <: Element */](rootNode: T, patches: js.Array[VPatch], renderOptions: VPatchOptions[T]): T = js.native
}


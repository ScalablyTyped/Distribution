package typings
package virtualDashDomLib

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
  def apply[T /* <: stdLib.Element */](rootNode: T, patches: js.Array[virtualDashDomLib.VirtualDOMNs.VPatch]): T = js.native
  /**
    patch() usually just returns rootNode after doing stuff to it, so we want
    to preserve that type (though it will usually be just Element).
    */
  def apply[T /* <: stdLib.Element */](
    rootNode: T,
    patches: js.Array[virtualDashDomLib.VirtualDOMNs.VPatch],
    renderOptions: virtualDashDomLib.VirtualDOMNs.VPatchOptions[T]
  ): T = js.native
}


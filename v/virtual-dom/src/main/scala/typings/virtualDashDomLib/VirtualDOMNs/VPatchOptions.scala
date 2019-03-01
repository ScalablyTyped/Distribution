package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPatchOptions[T /* <: stdLib.Element */] extends js.Object {
  var patch: js.UndefOr[PatchFn[T]] = js.undefined
}

object VPatchOptions {
  @scala.inline
  def apply[T /* <: stdLib.Element */](patch: PatchFn[T] = null): VPatchOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (patch != null) __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[VPatchOptions[T]]
  }
}


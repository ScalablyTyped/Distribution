package typings.virtualDashDom.VirtualDOMNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPatchOptions[T /* <: Element */] extends js.Object {
  var patch: js.UndefOr[PatchFn[T]] = js.undefined
}

object VPatchOptions {
  @scala.inline
  def apply[T /* <: Element */](patch: PatchFn[T] = null): VPatchOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (patch != null) __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[VPatchOptions[T]]
  }
}


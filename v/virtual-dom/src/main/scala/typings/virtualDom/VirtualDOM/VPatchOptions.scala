package typings.virtualDom.VirtualDOM

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPatchOptions[T /* <: Element */] extends js.Object {
  var patch: js.UndefOr[PatchFn[T]] = js.undefined
}

object VPatchOptions {
  @scala.inline
  def apply[/* <: typings.std.Element */ T](patch: (T, /* patches */ js.Array[VPatch], /* renderOptions */ VPatchOptions[T]) => T = null): VPatchOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction3(patch))
    __obj.asInstanceOf[VPatchOptions[T]]
  }
}


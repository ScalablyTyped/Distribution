package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_names.BinaryInputs */
trait AddInputs extends js.Object {
  var a: js.UndefOr[js.Any] = js.undefined
  var b: js.UndefOr[js.Any] = js.undefined
}

object AddInputs {
  @scala.inline
  def apply(a: js.Any = null, b: js.Any = null): AddInputs = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInputs]
  }
}


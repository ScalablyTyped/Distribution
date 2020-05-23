package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'indices'> */
trait OneHotInputs extends js.Object {
  var indices: js.UndefOr[js.Any] = js.undefined
}

object OneHotInputs {
  @scala.inline
  def apply(indices: js.Any = null): OneHotInputs = {
    val __obj = js.Dynamic.literal()
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneHotInputs]
  }
}


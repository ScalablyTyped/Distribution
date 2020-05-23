package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'a' | 'b'> */
trait BinaryInputs extends js.Object {
  var a: js.UndefOr[js.Any] = js.undefined
  var b: js.UndefOr[js.Any] = js.undefined
}

object BinaryInputs {
  @scala.inline
  def apply(a: js.Any = null, b: js.Any = null): BinaryInputs = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryInputs]
  }
}


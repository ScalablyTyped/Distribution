package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'a' | 'b'> */
trait BinaryInputs extends js.Object {
  var a: js.Any
  var b: js.Any
}

object BinaryInputs {
  @scala.inline
  def apply(a: js.Any, b: js.Any): BinaryInputs = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BinaryInputs]
  }
}


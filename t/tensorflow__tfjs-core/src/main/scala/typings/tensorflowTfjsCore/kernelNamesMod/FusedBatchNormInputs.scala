package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'scale' | 'offset' | 'mean' | 'variance'> */
trait FusedBatchNormInputs extends js.Object {
  var mean: js.Any
  var offset: js.Any
  var scale: js.Any
  var variance: js.Any
  var x: js.Any
}

object FusedBatchNormInputs {
  @scala.inline
  def apply(mean: js.Any, offset: js.Any, scale: js.Any, variance: js.Any, x: js.Any): FusedBatchNormInputs = {
    val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FusedBatchNormInputs]
  }
}


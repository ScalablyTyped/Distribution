package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'boxes' | 'scores'> */
trait NonMaxSuppressionV5Inputs extends js.Object {
  var boxes: js.UndefOr[js.Any] = js.undefined
  var scores: js.UndefOr[js.Any] = js.undefined
}

object NonMaxSuppressionV5Inputs {
  @scala.inline
  def apply(boxes: js.Any = null, scores: js.Any = null): NonMaxSuppressionV5Inputs = {
    val __obj = js.Dynamic.literal()
    if (boxes != null) __obj.updateDynamic("boxes")(boxes.asInstanceOf[js.Any])
    if (scores != null) __obj.updateDynamic("scores")(scores.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV5Inputs]
  }
}


package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'boxes' | 'scores'> */
trait NonMaxSuppressionV5Inputs extends js.Object {
  var boxes: js.Any
  var scores: js.Any
}

object NonMaxSuppressionV5Inputs {
  @scala.inline
  def apply(boxes: js.Any, scores: js.Any): NonMaxSuppressionV5Inputs = {
    val __obj = js.Dynamic.literal(boxes = boxes.asInstanceOf[js.Any], scores = scores.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonMaxSuppressionV5Inputs]
  }
}


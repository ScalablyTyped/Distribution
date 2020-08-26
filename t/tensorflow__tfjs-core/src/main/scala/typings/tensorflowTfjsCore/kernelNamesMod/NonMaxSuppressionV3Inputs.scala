package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'boxes' | 'scores'> */
@js.native
trait NonMaxSuppressionV3Inputs extends js.Object {
  var boxes: js.UndefOr[js.Any] = js.native
  var scores: js.UndefOr[js.Any] = js.native
}

object NonMaxSuppressionV3Inputs {
  @scala.inline
  def apply(): NonMaxSuppressionV3Inputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonMaxSuppressionV3Inputs]
  }
  @scala.inline
  implicit class NonMaxSuppressionV3InputsOps[Self <: NonMaxSuppressionV3Inputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoxes(value: js.Any): Self = this.set("boxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxes: Self = this.set("boxes", js.undefined)
    @scala.inline
    def setScores(value: js.Any): Self = this.set("scores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScores: Self = this.set("scores", js.undefined)
  }
  
}


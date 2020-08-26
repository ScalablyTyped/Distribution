package typings.tensorflowTfjsLayers.trainingMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelEvaluateArgs extends js.Object {
  /**
    * Batch size (Integer). If unspecified, it will default to 32.
    */
  var batchSize: js.UndefOr[Double] = js.native
  /**
    * Tensor of weights to weight the contribution of different samples to the
    * loss and metrics.
    */
  var sampleWeight: js.UndefOr[Tensor[Rank]] = js.native
  /**
    * integer: total number of steps (batches of samples)
    * before declaring the evaluation round finished. Ignored with the default
    * value of `undefined`.
    */
  var steps: js.UndefOr[Double] = js.native
  /**
    * Verbosity mode.
    */
  var verbose: js.UndefOr[ModelLoggingVerbosity] = js.native
}

object ModelEvaluateArgs {
  @scala.inline
  def apply(): ModelEvaluateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelEvaluateArgs]
  }
  @scala.inline
  implicit class ModelEvaluateArgsOps[Self <: ModelEvaluateArgs] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setSampleWeight(value: Tensor[Rank]): Self = this.set("sampleWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleWeight: Self = this.set("sampleWeight", js.undefined)
    @scala.inline
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    @scala.inline
    def setVerbose(value: ModelLoggingVerbosity): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}


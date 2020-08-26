package typings.tensorflowTfjsLayers.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPredictArgs extends js.Object {
  /**
    * Optional. Batch size (Integer). If unspecified, it will default to 32.
    */
  var batchSize: js.UndefOr[Double] = js.native
  /**
    * Optional. Verbosity mode. Defaults to false.
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object ModelPredictArgs {
  @scala.inline
  def apply(): ModelPredictArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPredictArgs]
  }
  @scala.inline
  implicit class ModelPredictArgsOps[Self <: ModelPredictArgs] (val x: Self) extends AnyVal {
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
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}


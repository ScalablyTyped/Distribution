package typings.tensorflowTfjsLayers.trainingDatasetMod

import typings.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelEvaluateDatasetArgs extends js.Object {
  
  /**
    * Number of batches to draw from the dataset object before ending the
    * evaluation.
    */
  var batches: js.UndefOr[Double] = js.native
  
  /**
    * Verbosity mode.
    */
  var verbose: js.UndefOr[ModelLoggingVerbosity] = js.native
}
object ModelEvaluateDatasetArgs {
  
  @scala.inline
  def apply(): ModelEvaluateDatasetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelEvaluateDatasetArgs]
  }
  
  @scala.inline
  implicit class ModelEvaluateDatasetArgsOps[Self <: ModelEvaluateDatasetArgs] (val x: Self) extends AnyVal {
    
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
    def setBatches(value: Double): Self = this.set("batches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatches: Self = this.set("batches", js.undefined)
    
    @scala.inline
    def setVerbose(value: ModelLoggingVerbosity): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}

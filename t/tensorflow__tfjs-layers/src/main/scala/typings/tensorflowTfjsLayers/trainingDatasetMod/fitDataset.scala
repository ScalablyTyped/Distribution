package typings.tensorflowTfjsLayers.trainingDatasetMod

import typings.tensorflowTfjsLayers.baseCallbacksMod.History
import typings.tensorflowTfjsLayers.datasetStubMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_dataset", "fitDataset")
@js.native
object fitDataset extends js.Object {
  
  def apply[T](model: js.Any, dataset: Dataset[T], args: ModelFitDatasetArgs[T]): js.Promise[History] = js.native
}

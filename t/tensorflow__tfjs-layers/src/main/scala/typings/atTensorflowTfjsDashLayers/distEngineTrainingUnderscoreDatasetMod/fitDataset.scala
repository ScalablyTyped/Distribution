package typings.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreDatasetMod

import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.History
import typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreStubMod.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_dataset", "fitDataset")
@js.native
object fitDataset extends js.Object {
  def apply[T](model: js.Any, dataset: Dataset[T], args: ModelFitDatasetArgs[T]): js.Promise[History] = js.native
}


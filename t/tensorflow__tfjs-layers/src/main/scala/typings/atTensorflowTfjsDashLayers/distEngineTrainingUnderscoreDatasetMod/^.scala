package typings.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreDatasetMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.History
import typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreStubMod.Dataset
import typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreStubMod.LazyIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_dataset", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def evaluateDataset[T](model: js.Any, dataset: Dataset[T], args: ModelEvaluateDatasetArgs): js.Promise[Scalar | js.Array[Scalar]] = js.native
  def evaluateDataset[T](model: js.Any, dataset: LazyIterator[T], args: ModelEvaluateDatasetArgs): js.Promise[Scalar | js.Array[Scalar]] = js.native
  def fitDataset[T](model: js.Any, dataset: Dataset[T], args: ModelFitDatasetArgs[T]): js.Promise[History] = js.native
}


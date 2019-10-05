package typings.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreDatasetMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreStubMod.Dataset
import typings.atTensorflowTfjsDashLayers.distEngineDatasetUnderscoreStubMod.LazyIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_dataset", "evaluateDataset")
@js.native
object evaluateDataset extends js.Object {
  def apply[T](model: js.Any, dataset: Dataset[T], args: ModelEvaluateDatasetArgs): js.Promise[Scalar | js.Array[Scalar]] = js.native
  def apply[T](model: js.Any, dataset: LazyIterator[T], args: ModelEvaluateDatasetArgs): js.Promise[Scalar | js.Array[Scalar]] = js.native
}


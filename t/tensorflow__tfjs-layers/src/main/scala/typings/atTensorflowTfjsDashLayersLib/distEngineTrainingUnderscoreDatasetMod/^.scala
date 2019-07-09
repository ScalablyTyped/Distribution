package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreDatasetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_dataset", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def evaluateDataset[T](
    model: js.Any,
    dataset: atTensorflowTfjsDashLayersLib.distEngineDatasetUnderscoreStubMod.Dataset[T],
    args: ModelEvaluateDatasetArgs
  ): js.Promise[
    atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar]
  ] = js.native
  def evaluateDataset[T](
    model: js.Any,
    dataset: atTensorflowTfjsDashLayersLib.distEngineDatasetUnderscoreStubMod.LazyIterator[T],
    args: ModelEvaluateDatasetArgs
  ): js.Promise[
    atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar]
  ] = js.native
  def fitDataset[T](
    model: js.Any,
    dataset: atTensorflowTfjsDashLayersLib.distEngineDatasetUnderscoreStubMod.Dataset[T],
    args: ModelFitDatasetArgs[T]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
}


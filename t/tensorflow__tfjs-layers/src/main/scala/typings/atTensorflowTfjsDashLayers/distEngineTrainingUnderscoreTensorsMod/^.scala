package typings.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreTensorsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkBatchSize(batchSize: Double): Unit = js.native
  def disposeNewTensors(tensors: js.Array[Tensor[Rank]], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  def disposeNewTensors(tensors: js.Array[Tensor[Rank]], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  def disposeNewTensors(tensors: js.Array[Tensor[Rank]], refTensors: Tensor[Rank]): Unit = js.native
  def disposeNewTensors(tensors: StringDictionary[Tensor[Rank]], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  def disposeNewTensors(tensors: StringDictionary[Tensor[Rank]], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  def disposeNewTensors(tensors: StringDictionary[Tensor[Rank]], refTensors: Tensor[Rank]): Unit = js.native
  def disposeNewTensors(tensors: Tensor[Rank], refTensors: js.Array[Tensor[Rank]]): Unit = js.native
  def disposeNewTensors(tensors: Tensor[Rank], refTensors: StringDictionary[Tensor[Rank]]): Unit = js.native
  def disposeNewTensors(tensors: Tensor[Rank], refTensors: Tensor[Rank]): Unit = js.native
  def ensureTensorsRank2OrHigher(tensors: js.Array[Tensor[Rank]]): js.Array[Tensor[Rank]] = js.native
  def ensureTensorsRank2OrHigher(tensors: Tensor[Rank]): js.Array[Tensor[Rank]] = js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: js.Array[Tensor[Rank]], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  def fitTensors(
    model: js.Any,
    x: StringDictionary[Tensor[Rank]],
    y: StringDictionary[Tensor[Rank]],
    args: ModelFitArgs
  ): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: Tensor[Rank]): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: StringDictionary[Tensor[Rank]], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: Tensor[Rank]): js.Promise[History] = js.native
  def fitTensors(model: js.Any, x: Tensor[Rank], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  def makeBatches(size: Double, batchSize: Double): js.Array[js.Tuple2[Double, Double]] = js.native
  def sliceArrays(arrays: js.Array[Tensor[Rank]], start: Double, stop: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def sliceArrays(arrays: Tensor[Rank], start: Double, stop: Double): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def sliceArraysByIndices(arrays: js.Array[Tensor[Rank]], indices: Tensor1D): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def sliceArraysByIndices(arrays: Tensor[Rank], indices: Tensor1D): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
}


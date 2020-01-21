package typings.tensorflowTfjsLayers.mod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "metrics")
@js.native
object metrics extends js.Object {
  @JSName("MAPE")
  def MAPE_(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  @JSName("MSE")
  def MSE_(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def binaryAccuracy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def binaryCrossentropy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def categoricalAccuracy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def categoricalCrossentropy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def cosineProximity(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def mape(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def meanAbsoluteError(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def meanAbsolutePercentageError(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def meanSquaredError(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def mse(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def precision(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def recall(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def sparseCategoricalAccuracy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
}


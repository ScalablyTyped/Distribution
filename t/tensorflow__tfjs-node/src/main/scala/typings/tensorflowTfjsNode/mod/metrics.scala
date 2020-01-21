package typings.tensorflowTfjsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "metrics")
@js.native
object metrics extends js.Object {
  @JSName("MAPE")
  def MAPE_(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSName("MSE")
  def MSE_(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryAccuracy(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def binaryCrossentropy(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalAccuracy(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def categoricalCrossentropy(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def cosineProximity(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mape(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsoluteError(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanAbsolutePercentageError(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def meanSquaredError(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def mse(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def precision(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def recall(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def sparseCategoricalAccuracy(
    yTrue: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): typings.tensorflowTfjsCore.mod.Tensor_[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}


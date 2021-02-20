package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metrics {
  
  @JSImport("@tensorflow/tfjs-node", "metrics.MAPE")
  @js.native
  def MAPE_(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.MSE")
  @js.native
  def MSE_(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.binaryAccuracy")
  @js.native
  def binaryAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.binaryCrossentropy")
  @js.native
  def binaryCrossentropy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.categoricalAccuracy")
  @js.native
  def categoricalAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.categoricalCrossentropy")
  @js.native
  def categoricalCrossentropy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.cosineProximity")
  @js.native
  def cosineProximity(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.mape")
  @js.native
  def mape(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.meanAbsoluteError")
  @js.native
  def meanAbsoluteError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.meanAbsolutePercentageError")
  @js.native
  def meanAbsolutePercentageError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.meanSquaredError")
  @js.native
  def meanSquaredError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.mse")
  @js.native
  def mse(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.precision")
  @js.native
  def precision(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.recall")
  @js.native
  def recall(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "metrics.sparseCategoricalAccuracy")
  @js.native
  def sparseCategoricalAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}

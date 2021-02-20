package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportsMetricsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "MAPE")
  @js.native
  def MAPE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "MSE")
  @js.native
  def MSE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "binaryAccuracy")
  @js.native
  def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "binaryCrossentropy")
  @js.native
  def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "categoricalAccuracy")
  @js.native
  def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "categoricalCrossentropy")
  @js.native
  def categoricalCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "cosineProximity")
  @js.native
  def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "mape")
  @js.native
  def mape(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "meanAbsoluteError")
  @js.native
  def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "meanAbsolutePercentageError")
  @js.native
  def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "meanSquaredError")
  @js.native
  def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "mse")
  @js.native
  def mse(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "precision")
  @js.native
  def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "recall")
  @js.native
  def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_metrics", "sparseCategoricalAccuracy")
  @js.native
  def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
}

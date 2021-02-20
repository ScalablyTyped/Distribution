package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "MAE")
  @js.native
  val MAE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "MAPE")
  @js.native
  val MAPE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "MSE")
  @js.native
  val MSE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "binaryAccuracy")
  @js.native
  def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "binaryCrossentropy")
  @js.native
  def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "categoricalAccuracy")
  @js.native
  def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "categoricalCrossentropy")
  @js.native
  val categoricalCrossentropy: js.Function3[
    /* target */ Tensor[Rank], 
    /* output */ Tensor[Rank], 
    /* fromLogits */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "cosine")
  @js.native
  val cosine: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "get")
  @js.native
  def get(identifier: String): LossOrMetricFn = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "get")
  @js.native
  def get(identifier: LossOrMetricFn): LossOrMetricFn = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "getLossOrMetricName")
  @js.native
  def getLossOrMetricName(fn: String): String = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "getLossOrMetricName")
  @js.native
  def getLossOrMetricName(fn: LossOrMetricFn): String = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "mae")
  @js.native
  val mae: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "mape")
  @js.native
  val mape: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "mse")
  @js.native
  val mse: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "precision")
  @js.native
  def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "recall")
  @js.native
  def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "sparseCategoricalAccuracy")
  @js.native
  def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "sparseCategoricalCrossentropy")
  @js.native
  val sparseCategoricalCrossentropy: js.Function3[
    /* target */ Tensor[Rank], 
    /* output */ Tensor[Rank], 
    /* fromLogits */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "sparseTopKCategoricalAccuracy")
  @js.native
  def sparseTopKCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "topKCategoricalAccuracy")
  @js.native
  def topKCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
}

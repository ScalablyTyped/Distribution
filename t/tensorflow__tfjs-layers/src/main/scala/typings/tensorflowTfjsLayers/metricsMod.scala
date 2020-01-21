package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/metrics", JSImport.Namespace)
@js.native
object metricsMod extends js.Object {
  @JSName("MAE")
  val MAE_ : js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  @JSName("MAPE")
  val MAPE_ : js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  @JSName("MSE")
  val MSE_ : js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val categoricalCrossentropy: js.Function3[
    /* target */ Tensor_[Rank], 
    /* output */ Tensor_[Rank], 
    /* fromLogits */ js.UndefOr[Boolean], 
    Tensor_[Rank]
  ] = js.native
  val cosine: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val mae: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val mape: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val mse: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val sparseCategoricalCrossentropy: js.Function2[/* target */ Tensor_[Rank], /* output */ Tensor_[Rank], Tensor_[Rank]] = js.native
  def binaryAccuracy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def binaryCrossentropy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def categoricalAccuracy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def get(identifier: String): LossOrMetricFn = js.native
  def get(identifier: LossOrMetricFn): LossOrMetricFn = js.native
  def getLossOrMetricName(fn: String): String = js.native
  def getLossOrMetricName(fn: LossOrMetricFn): String = js.native
  def precision(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def recall(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def sparseCategoricalAccuracy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def sparseTopKCategoricalAccuracy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def topKCategoricalAccuracy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  @js.native
  object metricsMap extends /* functionName */ StringDictionary[LossOrMetricFn]
  
}


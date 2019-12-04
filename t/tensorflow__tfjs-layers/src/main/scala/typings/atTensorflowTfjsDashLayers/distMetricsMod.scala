package typings.atTensorflowTfjsDashLayers

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/metrics", JSImport.Namespace)
@js.native
object distMetricsMod extends js.Object {
  val MAE: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val MAPE: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val MSE: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val categoricalCrossentropy: js.Function3[
    /* target */ Tensor[Rank], 
    /* output */ Tensor[Rank], 
    /* fromLogits */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  val cosine: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val mae: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val mape: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val mse: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val sparseCategoricalCrossentropy: js.Function2[/* target */ Tensor[Rank], /* output */ Tensor[Rank], Tensor[Rank]] = js.native
  def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def get(identifier: String): LossOrMetricFn = js.native
  def get(identifier: LossOrMetricFn): LossOrMetricFn = js.native
  def getLossOrMetricName(fn: String): String = js.native
  def getLossOrMetricName(fn: LossOrMetricFn): String = js.native
  def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def sparseTopKCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def topKCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  @js.native
  object metricsMap extends /* functionName */ StringDictionary[LossOrMetricFn]
  
}


package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/losses", JSImport.Namespace)
@js.native
object lossesMod extends js.Object {
  @JSName("KLD")
  val KLD_ : js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  @JSName("MAE")
  val MAE_ : js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  @JSName("MAPE")
  val MAPE_ : js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  @JSName("MSE")
  val MSE_ : js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  @JSName("MSLE")
  val MSLE_ : js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val cosine: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val kld: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val mae: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val mape: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val mse: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  val msle: js.Function2[/* yTrue */ Tensor_[Rank], /* yPred */ Tensor_[Rank], Tensor_[Rank]] = js.native
  def binaryCrossentropy(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def categoricalCrossentropy(target: Tensor_[Rank], output: Tensor_[Rank]): Tensor_[Rank] = js.native
  def categoricalCrossentropy(target: Tensor_[Rank], output: Tensor_[Rank], fromLogits: Boolean): Tensor_[Rank] = js.native
  def categoricalHinge(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def cosineProximity(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def get(identifierOrFn: String): LossOrMetricFn = js.native
  def get(identifierOrFn: LossOrMetricFn): LossOrMetricFn = js.native
  def hinge(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def kullbackLeiblerDivergence(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def l2Normalize(x: Tensor_[Rank]): Tensor_[Rank] = js.native
  def l2Normalize(x: Tensor_[Rank], axis: Double): Tensor_[Rank] = js.native
  def logcosh(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def meanAbsoluteError(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def meanAbsolutePercentageError(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def meanSquaredError(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def meanSquaredLogarithmicError(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def poisson(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  def sigmoidCrossEntropyWithLogits(labels: Tensor_[Rank], logits: Tensor_[Rank]): Tensor_[Rank] = js.native
  def sparseCategoricalCrossentropy(target: Tensor_[Rank], output: Tensor_[Rank]): Tensor_[Rank] = js.native
  def squaredHinge(yTrue: Tensor_[Rank], yPred: Tensor_[Rank]): Tensor_[Rank] = js.native
  @js.native
  object lossesMap extends /* functionName */ StringDictionary[LossOrMetricFn]
  
}


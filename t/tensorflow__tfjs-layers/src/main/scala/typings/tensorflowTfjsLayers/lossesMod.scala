package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/losses", JSImport.Namespace)
@js.native
object lossesMod extends js.Object {
  @JSName("KLD")
  val KLD_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  @JSName("MAE")
  val MAE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  @JSName("MAPE")
  val MAPE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  @JSName("MSE")
  val MSE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  @JSName("MSLE")
  val MSLE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val cosine: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val kld: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val mae: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val mape: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val mse: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val msle: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def categoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank]): Tensor[Rank] = js.native
  def categoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank], fromLogits: Boolean): Tensor[Rank] = js.native
  def categoricalHinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def get(identifierOrFn: String): LossOrMetricFn = js.native
  def get(identifierOrFn: LossOrMetricFn): LossOrMetricFn = js.native
  def hinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def kullbackLeiblerDivergence(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def l2Normalize(x: Tensor[Rank]): Tensor[Rank] = js.native
  def l2Normalize(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  def logcosh(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def meanSquaredLogarithmicError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def poisson(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  def sigmoidCrossEntropyWithLogits(labels: Tensor[Rank], logits: Tensor[Rank]): Tensor[Rank] = js.native
  def sparseCategoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank]): Tensor[Rank] = js.native
  def sparseCategoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank], fromLogits: Boolean): Tensor[Rank] = js.native
  def squaredHinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  @js.native
  object lossesMap extends /* functionName */ StringDictionary[LossOrMetricFn]
  
}


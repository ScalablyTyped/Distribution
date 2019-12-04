package typings.atTensorflowTfjsDashLayers

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distTypesMod.LossOrMetricFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/losses", JSImport.Namespace)
@js.native
object distLossesMod extends js.Object {
  val KLD: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val MAE: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val MAPE: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val MSE: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  val MSLE: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
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
  def squaredHinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  @js.native
  object lossesMap extends /* functionName */ StringDictionary[LossOrMetricFn]
  
}


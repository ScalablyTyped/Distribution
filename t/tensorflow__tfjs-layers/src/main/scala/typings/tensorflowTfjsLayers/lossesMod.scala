package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lossesMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "KLD")
  @js.native
  val KLD_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "MAE")
  @js.native
  val MAE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "MAPE")
  @js.native
  val MAPE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "MSE")
  @js.native
  val MSE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "MSLE")
  @js.native
  val MSLE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "binaryCrossentropy")
  @js.native
  def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "categoricalCrossentropy")
  @js.native
  def categoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "categoricalCrossentropy")
  @js.native
  def categoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank], fromLogits: Boolean): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "categoricalHinge")
  @js.native
  def categoricalHinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "cosine")
  @js.native
  val cosine: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "cosineProximity")
  @js.native
  def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "get")
  @js.native
  def get(identifierOrFn: String): LossOrMetricFn = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "get")
  @js.native
  def get(identifierOrFn: LossOrMetricFn): LossOrMetricFn = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "hinge")
  @js.native
  def hinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "kld")
  @js.native
  val kld: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "kullbackLeiblerDivergence")
  @js.native
  def kullbackLeiblerDivergence(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "l2Normalize")
  @js.native
  def l2Normalize(x: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "l2Normalize")
  @js.native
  def l2Normalize(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "logcosh")
  @js.native
  def logcosh(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "mae")
  @js.native
  val mae: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "mape")
  @js.native
  val mape: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "meanAbsoluteError")
  @js.native
  def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "meanAbsolutePercentageError")
  @js.native
  def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "meanSquaredError")
  @js.native
  def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "meanSquaredLogarithmicError")
  @js.native
  def meanSquaredLogarithmicError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "mse")
  @js.native
  val mse: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "msle")
  @js.native
  val msle: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "poisson")
  @js.native
  def poisson(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "sigmoidCrossEntropyWithLogits")
  @js.native
  def sigmoidCrossEntropyWithLogits(labels: Tensor[Rank], logits: Tensor[Rank]): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "sparseCategoricalCrossentropy")
  @js.native
  def sparseCategoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "sparseCategoricalCrossentropy")
  @js.native
  def sparseCategoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank], fromLogits: Boolean): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "squaredHinge")
  @js.native
  def squaredHinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
}

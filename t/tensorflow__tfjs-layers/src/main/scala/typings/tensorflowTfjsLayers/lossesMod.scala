package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lossesMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryCrossentropy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def categoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalCrossentropy")(target.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def categoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank], fromLogits: Boolean): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalCrossentropy")(target.asInstanceOf[js.Any], output.asInstanceOf[js.Any], fromLogits.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def categoricalHinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalHinge")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "cosine")
  @js.native
  val cosine: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineProximity")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def get(identifierOrFn: String): LossOrMetricFn = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(identifierOrFn.asInstanceOf[js.Any]).asInstanceOf[LossOrMetricFn]
  inline def get(identifierOrFn: LossOrMetricFn): LossOrMetricFn = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(identifierOrFn.asInstanceOf[js.Any]).asInstanceOf[LossOrMetricFn]
  
  inline def hinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("hinge")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "kld")
  @js.native
  val kld: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def kullbackLeiblerDivergence(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("kullbackLeiblerDivergence")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def l2Normalize(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("l2Normalize")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def l2Normalize(x: Tensor[Rank], axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("l2Normalize")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def logcosh(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("logcosh")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "mae")
  @js.native
  val mae: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "mape")
  @js.native
  val mape: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanAbsoluteError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanAbsolutePercentageError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def meanSquaredLogarithmicError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredLogarithmicError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "mse")
  @js.native
  val mse: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/losses", "msle")
  @js.native
  val msle: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def poisson(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("poisson")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def sigmoidCrossEntropyWithLogits(labels: Tensor[Rank], logits: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropyWithLogits")(labels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def sparseCategoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseCategoricalCrossentropy")(target.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def sparseCategoricalCrossentropy(target: Tensor[Rank], output: Tensor[Rank], fromLogits: Boolean): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseCategoricalCrossentropy")(target.asInstanceOf[js.Any], output.asInstanceOf[js.Any], fromLogits.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def squaredHinge(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredHinge")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
}

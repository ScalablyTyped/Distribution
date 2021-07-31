package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "MAE")
  @js.native
  val MAE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "MAPE")
  @js.native
  val MAPE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "MSE")
  @js.native
  val MSE_ : js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @scala.inline
  def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryCrossentropy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
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
  
  @scala.inline
  def get(identifier: String): LossOrMetricFn = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(identifier.asInstanceOf[js.Any]).asInstanceOf[LossOrMetricFn]
  @scala.inline
  def get(identifier: LossOrMetricFn): LossOrMetricFn = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(identifier.asInstanceOf[js.Any]).asInstanceOf[LossOrMetricFn]
  
  @scala.inline
  def getLossOrMetricName(fn: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLossOrMetricName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getLossOrMetricName(fn: LossOrMetricFn): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLossOrMetricName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "mae")
  @js.native
  val mae: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "mape")
  @js.native
  val mape: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "mse")
  @js.native
  val mse: js.Function2[/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @scala.inline
  def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("precision")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("recall")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseCategoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @JSImport("@tensorflow/tfjs-layers/dist/metrics", "sparseCategoricalCrossentropy")
  @js.native
  val sparseCategoricalCrossentropy: js.Function3[
    /* target */ Tensor[Rank], 
    /* output */ Tensor[Rank], 
    /* fromLogits */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  
  @scala.inline
  def sparseTopKCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseTopKCategoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def topKCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("topKCategoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
}

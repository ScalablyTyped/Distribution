package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metrics {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "metrics")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def MAPE_(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("MAPE")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def MSE_(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("MSE")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def binaryAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def binaryCrossentropy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryCrossentropy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def categoricalAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def categoricalCrossentropy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalCrossentropy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def cosineProximity(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineProximity")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def mape(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("mape")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def meanAbsoluteError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanAbsoluteError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def meanAbsolutePercentageError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanAbsolutePercentageError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def meanSquaredError(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def mse(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("mse")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def precision(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("precision")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def recall(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("recall")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def sparseCategoricalAccuracy(
    yTrue: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    yPred: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseCategoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
}

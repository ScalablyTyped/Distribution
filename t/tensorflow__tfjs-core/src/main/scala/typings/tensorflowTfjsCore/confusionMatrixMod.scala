package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confusionMatrixMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/confusion_matrix", "confusionMatrix")
  @js.native
  val confusionMatrix: js.Function3[
    /* labels */ Tensor1D | TensorLike, 
    /* predictions */ Tensor1D | TensorLike, 
    /* numClasses */ Double, 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/confusion_matrix", "confusionMatrix_")
  @js.native
  def confusionMatrix_(labels: Tensor1D, predictions: Tensor1D, numClasses: Double): Tensor2D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/confusion_matrix", "confusionMatrix_")
  @js.native
  def confusionMatrix_(labels: Tensor1D, predictions: TensorLike, numClasses: Double): Tensor2D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/confusion_matrix", "confusionMatrix_")
  @js.native
  def confusionMatrix_(labels: TensorLike, predictions: Tensor1D, numClasses: Double): Tensor2D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/confusion_matrix", "confusionMatrix_")
  @js.native
  def confusionMatrix_(labels: TensorLike, predictions: TensorLike, numClasses: Double): Tensor2D = js.native
}

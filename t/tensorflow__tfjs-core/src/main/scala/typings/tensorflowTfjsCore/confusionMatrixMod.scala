package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/confusion_matrix", JSImport.Namespace)
@js.native
object confusionMatrixMod extends js.Object {
  val confusionMatrix: js.Function3[
    /* labels */ Tensor1D | TensorLike, 
    /* predictions */ Tensor1D | TensorLike, 
    /* numClasses */ Double, 
    Tensor2D
  ] = js.native
  def confusionMatrix_(labels: TensorLike, predictions: TensorLike, numClasses: Double): Tensor2D = js.native
  def confusionMatrix_(labels: TensorLike, predictions: Tensor1D, numClasses: Double): Tensor2D = js.native
  def confusionMatrix_(labels: Tensor1D, predictions: TensorLike, numClasses: Double): Tensor2D = js.native
  def confusionMatrix_(labels: Tensor1D, predictions: Tensor1D, numClasses: Double): Tensor2D = js.native
}


package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(tensors.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(tensors.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
}

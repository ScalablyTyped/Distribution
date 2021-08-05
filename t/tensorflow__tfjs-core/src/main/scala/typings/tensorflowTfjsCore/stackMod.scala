package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")(tensors.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(tensors.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
}

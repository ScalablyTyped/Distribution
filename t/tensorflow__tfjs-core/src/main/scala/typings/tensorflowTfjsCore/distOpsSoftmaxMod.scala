package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSoftmaxMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/softmax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def softmax[T /* <: Tensor[Rank] */](logits: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(logits.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def softmax[T /* <: Tensor[Rank] */](logits: T | TensorLike, dim: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(logits.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[T]
}

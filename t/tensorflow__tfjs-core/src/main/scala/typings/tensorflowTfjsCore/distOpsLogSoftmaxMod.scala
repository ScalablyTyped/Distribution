package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLogSoftmaxMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/log_softmax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logSoftmax[T /* <: Tensor[Rank] */](logits: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSoftmax")(logits.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def logSoftmax[T /* <: Tensor[Rank] */](logits: T | TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSoftmax")(logits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
}

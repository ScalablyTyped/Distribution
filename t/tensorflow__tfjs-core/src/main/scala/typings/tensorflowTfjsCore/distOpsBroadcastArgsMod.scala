package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsBroadcastArgsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/broadcast_args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcastArgs[R /* <: Rank */](s0: Tensor[Rank], s1: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def broadcastArgs[R /* <: Rank */](s0: Tensor[Rank], s1: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def broadcastArgs[R /* <: Rank */](s0: TensorLike, s1: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def broadcastArgs[R /* <: Rank */](s0: TensorLike, s1: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}

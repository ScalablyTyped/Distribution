package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsArgMaxMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/arg_max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def argMax[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def argMax[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
}

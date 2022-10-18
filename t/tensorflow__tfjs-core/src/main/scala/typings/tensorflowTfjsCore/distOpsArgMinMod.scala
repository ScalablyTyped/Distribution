package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsArgMinMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/arg_min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def argMin[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def argMin[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
}

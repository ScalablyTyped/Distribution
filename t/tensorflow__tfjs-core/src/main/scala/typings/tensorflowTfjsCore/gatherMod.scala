package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatherMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/gather", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
}

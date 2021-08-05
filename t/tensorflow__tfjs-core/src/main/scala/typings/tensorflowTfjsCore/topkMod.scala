package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Indices
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topkMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def topk[T /* <: Tensor[Rank] */](x: T | TensorLike): Indices[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any]).asInstanceOf[Indices[T]]
  inline def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Double): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
  inline def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Double, sorted: Boolean): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
  inline def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Unit, sorted: Boolean): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
}

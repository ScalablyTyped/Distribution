package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsNotEqualMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/not_equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def notEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def notEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
}

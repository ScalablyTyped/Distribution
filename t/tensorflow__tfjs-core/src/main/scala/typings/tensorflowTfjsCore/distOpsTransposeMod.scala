package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTransposeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/transpose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike, perm: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any], perm.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike, perm: js.Array[Double], conjugate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any], perm.asInstanceOf[js.Any], conjugate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike, perm: Unit, conjugate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any], perm.asInstanceOf[js.Any], conjugate.asInstanceOf[js.Any])).asInstanceOf[T]
}

package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsPowMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/pow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
}

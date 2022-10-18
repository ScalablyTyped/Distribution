package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSqueezeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/squeeze", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def squeeze[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def squeeze[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
}

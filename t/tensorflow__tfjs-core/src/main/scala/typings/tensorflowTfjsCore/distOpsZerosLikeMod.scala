package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsZerosLikeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/zeros_like", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zerosLike[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("zerosLike")(x.asInstanceOf[js.Any]).asInstanceOf[T]
}

package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsPreluMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/prelu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prelu[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
}

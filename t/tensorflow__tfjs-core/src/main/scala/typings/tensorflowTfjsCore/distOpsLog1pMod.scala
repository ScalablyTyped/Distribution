package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLog1pMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/log1p", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def log1p[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[T]
}

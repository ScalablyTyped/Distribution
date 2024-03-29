package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsEluMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/elu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
}

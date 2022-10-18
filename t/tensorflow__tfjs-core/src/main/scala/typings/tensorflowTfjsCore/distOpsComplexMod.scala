package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsComplexMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/complex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def complex[T /* <: Tensor[Rank] */](real: T | TensorLike, imag: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("complex")(real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any])).asInstanceOf[T]
}

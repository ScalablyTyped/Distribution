package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsBitwiseAndMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/bitwise_and", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bitwiseAnd[R /* <: Rank */](x: Tensor[Rank], y: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("bitwiseAnd")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}

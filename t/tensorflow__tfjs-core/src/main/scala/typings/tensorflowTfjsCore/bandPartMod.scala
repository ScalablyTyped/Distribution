package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bandPartMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/linalg/band_part", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bandPart[T /* <: Tensor[Rank] */](a: T | TensorLike, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
}

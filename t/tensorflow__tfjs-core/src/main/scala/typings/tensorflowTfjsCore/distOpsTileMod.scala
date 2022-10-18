package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsTileMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/tile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tile[T /* <: Tensor[Rank] */](x: T | TensorLike, reps: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(x.asInstanceOf[js.Any], reps.asInstanceOf[js.Any])).asInstanceOf[T]
}

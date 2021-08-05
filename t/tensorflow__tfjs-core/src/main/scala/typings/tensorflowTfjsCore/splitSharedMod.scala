package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitSharedMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/split_shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def split[T /* <: Tensor[Rank] */](x: T, sizeSplits: js.Array[Double], axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], sizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}

package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.TensorBuffer
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileImplMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/backends/tile_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tile[R /* <: Rank */](xBuf: TensorBuffer[R, DataType], reps: js.Array[Double]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(xBuf.asInstanceOf[js.Any], reps.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}

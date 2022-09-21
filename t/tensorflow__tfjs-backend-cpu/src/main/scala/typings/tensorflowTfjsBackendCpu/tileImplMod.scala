package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.TensorBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Tile_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tileImpl[R /* <: Rank */](xBuf: TensorBuffer[R, DataType], reps: js.Array[Double]): TensorBuffer[R, DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("tileImpl")(xBuf.asInstanceOf[js.Any], reps.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, DataType]]
}

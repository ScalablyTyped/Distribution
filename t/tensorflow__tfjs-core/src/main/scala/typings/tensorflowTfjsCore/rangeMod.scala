package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(start: Double, stop: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def range(start: Double, stop: Double, step: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def range_float32(start: Double, stop: Double, step: Double, dtype: float32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def range_float32(start: Double, stop: Double, step: Unit, dtype: float32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def range_int32(start: Double, stop: Double, step: Double, dtype: int32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def range_int32(start: Double, stop: Double, step: Unit, dtype: int32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
}

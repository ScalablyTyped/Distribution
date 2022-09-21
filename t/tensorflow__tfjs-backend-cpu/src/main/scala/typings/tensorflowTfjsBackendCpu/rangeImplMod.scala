package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.float32
import typings.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.int32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Range_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rangeImpl(start: Double, stop: Double, step: Double, dtype: float32 | int32): js.typedarray.Float32Array | js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeImpl")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array | js.typedarray.Int32Array]
}

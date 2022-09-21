package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zerosImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/zeros_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zeros(backend: MathBackendCPU, shape: js.Array[Double]): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(backend.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  inline def zeros(backend: MathBackendCPU, shape: js.Array[Double], dtype: DataType): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(backend.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}

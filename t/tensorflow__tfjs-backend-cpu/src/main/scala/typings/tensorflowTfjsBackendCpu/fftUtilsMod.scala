package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.ImagReal
import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fftUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fft_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fftBatch(input: TensorInfo, inverse: Boolean, cpuBackend: MathBackendCPU): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fftBatch")(input.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any], cpuBackend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
  
  @scala.inline
  def fftImpl(input: TensorInfo, inverse: Boolean, cpuBackend: MathBackendCPU): ImagReal = (^.asInstanceOf[js.Dynamic].applyDynamic("fftImpl")(input.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any], cpuBackend.asInstanceOf[js.Any])).asInstanceOf[ImagReal]
}

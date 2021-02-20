package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.ImagReal
import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fftUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fft_utils", "fftBatch")
  @js.native
  def fftBatch(input: TensorInfo, inverse: Boolean, cpuBackend: MathBackendCPU): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fft_utils", "fftImpl")
  @js.native
  def fftImpl(input: TensorInfo, inverse: Boolean, cpuBackend: MathBackendCPU): ImagReal = js.native
}

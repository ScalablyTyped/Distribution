package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.BackendMathBackendCPU
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Complex", JSImport.Namespace)
@js.native
object complexMod extends js.Object {
  
  def complex(args: BackendMathBackendCPU): TensorInfo = js.native
  
  val complexConfig: KernelConfig = js.native
}

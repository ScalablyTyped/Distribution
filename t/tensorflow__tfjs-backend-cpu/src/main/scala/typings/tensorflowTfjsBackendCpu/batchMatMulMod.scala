package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsBackend
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchMatMul", JSImport.Namespace)
@js.native
object batchMatMulMod extends js.Object {
  
  def batchMatMul(args: AttrsBackend): TensorInfo = js.native
  
  val batchMatMulConfig: KernelConfig = js.native
}

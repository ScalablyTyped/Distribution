package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsFusedMatMulAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/_FusedMatMul", JSImport.Namespace)
@js.native
object fusedMatMulMod extends js.Object {
  
  @JSName("_fusedMatMul")
  def fusedMatMul(args: AttrsFusedMatMulAttrs): TensorInfo = js.native
  
  @JSName("_fusedMatMulConfig")
  val fusedMatMulConfig: KernelConfig = js.native
}

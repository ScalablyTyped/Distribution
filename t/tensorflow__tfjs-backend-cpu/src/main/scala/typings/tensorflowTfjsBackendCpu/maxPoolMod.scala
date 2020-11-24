package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMaxPoolAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPool", JSImport.Namespace)
@js.native
object maxPoolMod extends js.Object {
  
  def maxPool(args: AttrsMaxPoolAttrs): TensorInfo = js.native
  
  val maxPoolConfig: KernelConfig = js.native
}

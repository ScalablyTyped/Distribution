package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.Inputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/AvgPoolBackprop", JSImport.Namespace)
@js.native
object avgPoolBackpropMod extends js.Object {
  
  def avgPoolBackprop(args: Inputs): TensorInfo = js.native
  
  val avgPoolBackpropConfig: KernelConfig = js.native
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMaxPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPoolBackprop", JSImport.Namespace)
@js.native
object maxPoolBackpropMod extends js.Object {
  
  def maxPoolBackprop(args: AttrsMaxPoolBackpropAttrs): TensorInfo = js.native
  
  val maxPoolBackpropConfig: KernelConfig = js.native
}

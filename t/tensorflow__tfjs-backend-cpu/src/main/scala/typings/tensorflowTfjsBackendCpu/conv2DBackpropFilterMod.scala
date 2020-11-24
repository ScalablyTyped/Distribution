package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsConv2DBackpropFilterAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2DBackpropFilter", JSImport.Namespace)
@js.native
object conv2DBackpropFilterMod extends js.Object {
  
  def conv2DBackpropFilter(args: AttrsConv2DBackpropFilterAttrs): TensorInfo = js.native
  
  val conv2DBackpropFilterConfig: KernelConfig = js.native
}

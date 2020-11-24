package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsDepthwiseConv2dNativeAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNative", JSImport.Namespace)
@js.native
object depthwiseConv2dNativeMod extends js.Object {
  
  def depthwiseConv2dNative(args: AttrsDepthwiseConv2dNativeAttrs): TensorInfo = js.native
  
  val depthwiseConv2dNativeConfig: KernelConfig = js.native
}

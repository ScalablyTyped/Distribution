package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsDepthwiseConv2dNativeBackpropFilterAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthwiseConv2dNativeBackpropFilterMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNativeBackpropFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthwiseConv2dNativeBackpropFilter(args: AttrsDepthwiseConv2dNativeBackpropFilterAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropFilter")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNativeBackpropFilter", "depthwiseConv2dNativeBackpropFilterConfig")
  @js.native
  val depthwiseConv2dNativeBackpropFilterConfig: KernelConfig = js.native
}

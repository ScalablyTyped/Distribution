package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsDepthwiseConv2dNativeBackpropInputAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthwiseConv2dNativeBackpropInputMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNativeBackpropInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthwiseConv2dNativeBackpropInput(args: AttrsDepthwiseConv2dNativeBackpropInputAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeBackpropInput")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNativeBackpropInput", "depthwiseConv2dNativeBackpropInputConfig")
  @js.native
  val depthwiseConv2dNativeBackpropInputConfig: KernelConfig = js.native
}

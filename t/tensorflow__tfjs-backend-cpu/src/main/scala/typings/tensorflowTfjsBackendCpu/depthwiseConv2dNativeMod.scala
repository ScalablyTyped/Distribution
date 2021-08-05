package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsDepthwiseConv2dNativeAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthwiseConv2dNativeMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthwiseConv2dNative(args: AttrsDepthwiseConv2dNativeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNative")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/DepthwiseConv2dNative", "depthwiseConv2dNativeConfig")
  @js.native
  val depthwiseConv2dNativeConfig: KernelConfig = js.native
}

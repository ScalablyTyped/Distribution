package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsDepthwiseConv2dNativeAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsDepthwiseConv2dNativeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/DepthwiseConv2dNative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthwiseConv2dNative(args: AttrsDepthwiseConv2dNativeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNative")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/DepthwiseConv2dNative", "depthwiseConv2dNativeConfig")
  @js.native
  val depthwiseConv2dNativeConfig: KernelConfig = js.native
}

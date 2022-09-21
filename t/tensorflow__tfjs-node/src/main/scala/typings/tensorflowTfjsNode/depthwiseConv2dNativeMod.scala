package typings.tensorflowTfjsNode

import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typings.tensorflowTfjsNode.nodejsKernelBackendMod.NodeJSKernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthwiseConv2dNativeMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/kernels/DepthwiseConv2dNative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/kernels/DepthwiseConv2dNative", "depthwiseConv2dNativeConfig")
  @js.native
  val depthwiseConv2dNativeConfig: KernelConfig = js.native
  
  inline def depthwiseConv2dNativeImpl(input: TensorInfo, filter: TensorInfo, convInfo: Conv2DInfo, backend: NodeJSKernelBackend): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2dNativeImpl")(input.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
}

package typings.tensorflowTfjsNode

import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typings.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsNode.distNodejsKernelBackendMod.NodeJSKernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConv2DMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/kernels/Conv2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/kernels/Conv2D", "conv2DConfig")
  @js.native
  val conv2DConfig: KernelConfig = js.native
  
  inline def conv2dImpl(x: TensorInfo, filter: TensorInfo, convInfo: Conv2DInfo, backend: NodeJSKernelBackend): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dImpl")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], convInfo.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
}

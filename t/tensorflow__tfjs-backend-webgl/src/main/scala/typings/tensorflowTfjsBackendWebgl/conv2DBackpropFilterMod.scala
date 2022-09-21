package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsConv2DBackpropFilterAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv2DBackpropFilterMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv2DBackpropFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2DBackpropFilter(args: AttrsConv2DBackpropFilterAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2DBackpropFilter")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv2DBackpropFilter", "conv2DBackpropFilterConfig")
  @js.native
  val conv2DBackpropFilterConfig: KernelConfig = js.native
}

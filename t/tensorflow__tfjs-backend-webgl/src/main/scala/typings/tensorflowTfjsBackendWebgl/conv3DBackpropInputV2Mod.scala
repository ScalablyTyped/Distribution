package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsConv3DBackpropInputV2Attrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv3DBackpropInputV2Mod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv3DBackpropInputV2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv3DBackpropInput(args: AttrsConv3DBackpropInputV2Attrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3DBackpropInput")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Conv3DBackpropInputV2", "conv3DBackpropInputConfig")
  @js.native
  val conv3DBackpropInputConfig: KernelConfig = js.native
}

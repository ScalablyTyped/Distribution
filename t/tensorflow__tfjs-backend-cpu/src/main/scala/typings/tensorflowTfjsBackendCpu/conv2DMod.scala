package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsConv2DAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def conv2D(args: AttrsConv2DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2D", "conv2DConfig")
  @js.native
  val conv2DConfig: KernelConfig = js.native
}

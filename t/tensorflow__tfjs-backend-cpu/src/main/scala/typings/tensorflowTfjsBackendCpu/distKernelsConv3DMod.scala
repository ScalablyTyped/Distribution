package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsConv3DAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConv3DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv3D(args: AttrsConv3DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3D", "conv3DConfig")
  @js.native
  val conv3DConfig: KernelConfig = js.native
}

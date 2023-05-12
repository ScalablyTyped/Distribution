package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsCumprodAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsCumprodMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Cumprod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cumprod(args: AttrsCumprodAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Cumprod", "cumprodConfig")
  @js.native
  val cumprodConfig: KernelConfig = js.native
}

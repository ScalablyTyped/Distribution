package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsBackend
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsAnyMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Any", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def any(args: AttrsBackend): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Any", "anyConfig")
  @js.native
  val anyConfig: KernelConfig = js.native
}

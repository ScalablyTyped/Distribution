package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsMinAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def min(args: AttrsMinAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Min", "minConfig")
  @js.native
  val minConfig: KernelConfig = js.native
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsUniqueAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Unique", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unique(args: AttrsUniqueAttrs): js.Array[TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Unique", "uniqueConfig")
  @js.native
  val uniqueConfig: KernelConfig = js.native
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsStringSplitAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringSplitMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringSplit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringSplit(args: AttrsStringSplitAttrs): js.Tuple3[TensorInfo, TensorInfo, TensorInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(args.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[TensorInfo, TensorInfo, TensorInfo]]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/StringSplit", "stringSplitConfig")
  @js.native
  val stringSplitConfig: KernelConfig = js.native
}

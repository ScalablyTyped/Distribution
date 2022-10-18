package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsSelectInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSelectMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def select(args: InputsSelectInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Select", "selectConfig")
  @js.native
  val selectConfig: KernelConfig = js.native
}

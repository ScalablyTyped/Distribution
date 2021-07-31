package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.BackendMathBackendCPU
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Complex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def complex(args: BackendMathBackendCPU): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("complex")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Complex", "complexConfig")
  @js.native
  val complexConfig: KernelConfig = js.native
}

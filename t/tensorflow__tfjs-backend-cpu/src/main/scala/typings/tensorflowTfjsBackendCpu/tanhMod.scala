package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tanhMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Tanh", "tanh")
  @js.native
  val tanh: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Tanh", "tanhConfig")
  @js.native
  val tanhConfig: KernelConfig = js.native
}

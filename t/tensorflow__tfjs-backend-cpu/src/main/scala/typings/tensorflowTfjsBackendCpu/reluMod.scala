package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reluMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Relu", "relu")
  @js.native
  val relu: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Relu", "reluConfig")
  @js.native
  val reluConfig: KernelConfig = js.native
}

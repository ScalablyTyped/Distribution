package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eluMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Elu", "elu")
  @js.native
  val elu: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Elu", "eluConfig")
  @js.native
  val eluConfig: KernelConfig = js.native
}

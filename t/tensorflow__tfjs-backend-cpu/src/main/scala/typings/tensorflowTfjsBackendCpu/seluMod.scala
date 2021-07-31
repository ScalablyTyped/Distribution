package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object seluMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Selu", "selu")
  @js.native
  val selu: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Selu", "seluConfig")
  @js.native
  val seluConfig: KernelConfig = js.native
}

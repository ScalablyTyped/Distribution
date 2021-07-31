package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqrtMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sqrt", "sqrt")
  @js.native
  val sqrt: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sqrt", "sqrtConfig")
  @js.native
  val sqrtConfig: KernelConfig = js.native
}

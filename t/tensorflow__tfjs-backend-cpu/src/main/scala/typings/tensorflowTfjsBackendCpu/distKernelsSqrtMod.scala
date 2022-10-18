package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSqrtMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sqrt", "sqrt")
  @js.native
  val sqrt: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sqrt", "sqrtConfig")
  @js.native
  val sqrtConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sqrt", "sqrtImpl")
  @js.native
  val sqrtImpl: SimpleUnaryImpl = js.native
}

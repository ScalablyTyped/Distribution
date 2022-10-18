package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsExpMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Exp", "exp")
  @js.native
  val exp: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Exp", "expConfig")
  @js.native
  val expConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Exp", "expImpl")
  @js.native
  val expImpl: SimpleUnaryImpl = js.native
}

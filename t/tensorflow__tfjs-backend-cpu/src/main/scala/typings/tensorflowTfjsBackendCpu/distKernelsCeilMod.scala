package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsCeilMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Ceil", "ceil")
  @js.native
  val ceil: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Ceil", "ceilConfig")
  @js.native
  val ceilConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Ceil", "ceilImpl")
  @js.native
  val ceilImpl: SimpleUnaryImpl[Double, Double] = js.native
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSigmoidMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sigmoid", "sigmoid")
  @js.native
  val sigmoid: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sigmoid", "sigmoidConfig")
  @js.native
  val sigmoidConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sigmoid", "sigmoidImpl")
  @js.native
  val sigmoidImpl: SimpleUnaryImpl[Double, Double] = js.native
}

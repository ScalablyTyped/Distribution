package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsBinaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSquaredDifferenceMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SquaredDifference", "squaredDifference")
  @js.native
  val squaredDifference: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SquaredDifference", "squaredDifferenceConfig")
  @js.native
  val squaredDifferenceConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SquaredDifference", "squaredDifferenceImpl")
  @js.native
  val squaredDifferenceImpl: SimpleBinaryKernelImpl = js.native
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minimumMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Minimum", "minimum")
  @js.native
  val minimum: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Minimum", "minimumConfig")
  @js.native
  val minimumConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Minimum", "minimumImpl")
  @js.native
  val minimumImpl: SimpleBinaryKernelImpl = js.native
}

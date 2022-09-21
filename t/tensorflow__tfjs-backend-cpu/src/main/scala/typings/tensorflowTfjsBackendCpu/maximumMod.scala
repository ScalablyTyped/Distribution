package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maximumMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Maximum", "maximum")
  @js.native
  val maximum: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Maximum", "maximumConfig")
  @js.native
  val maximumConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Maximum", "maximumImpl")
  @js.native
  val maximumImpl: SimpleBinaryKernelImpl = js.native
}

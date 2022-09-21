package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realDivMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RealDiv", "div")
  @js.native
  val div: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RealDiv", "realDivConfig")
  @js.native
  val realDivConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/RealDiv", "realDivImpl")
  @js.native
  val realDivImpl: SimpleBinaryKernelImpl = js.native
}

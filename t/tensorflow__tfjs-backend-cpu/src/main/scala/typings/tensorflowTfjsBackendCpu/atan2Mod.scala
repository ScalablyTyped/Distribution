package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atan2Mod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Atan2", "atan2")
  @js.native
  val atan2: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Atan2", "atan2Config")
  @js.native
  val atan2Config: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Atan2", "atan2Impl")
  @js.native
  val atan2Impl: SimpleBinaryKernelImpl = js.native
}

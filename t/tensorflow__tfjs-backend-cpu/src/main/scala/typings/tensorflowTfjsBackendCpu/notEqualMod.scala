package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notEqualMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NotEqual", "notEqual")
  @js.native
  val notEqual: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NotEqual", "notEqualConfig")
  @js.native
  val notEqualConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NotEqual", "notEqualImpl")
  @js.native
  val notEqualImpl: SimpleBinaryKernelImpl = js.native
}

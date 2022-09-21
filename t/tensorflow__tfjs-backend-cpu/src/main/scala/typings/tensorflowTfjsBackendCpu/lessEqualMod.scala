package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lessEqualMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LessEqual", "lessEqual")
  @js.native
  val lessEqual: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LessEqual", "lessEqualConfig")
  @js.native
  val lessEqualConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LessEqual", "lessEqualImpl")
  @js.native
  val lessEqualImpl: SimpleBinaryKernelImpl = js.native
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logicalOrMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LogicalOr", "logicalOr")
  @js.native
  val logicalOr: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LogicalOr", "logicalOrConfig")
  @js.native
  val logicalOrConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LogicalOr", "logicalOrImpl")
  @js.native
  val logicalOrImpl: SimpleBinaryKernelImpl = js.native
}

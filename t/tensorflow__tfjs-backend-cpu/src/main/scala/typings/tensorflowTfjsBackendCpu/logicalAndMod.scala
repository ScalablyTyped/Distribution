package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logicalAndMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LogicalAnd", "logicalAnd")
  @js.native
  val logicalAnd: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LogicalAnd", "logicalAndConfig")
  @js.native
  val logicalAndConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/LogicalAnd", "logicalAndImpl")
  @js.native
  val logicalAndImpl: SimpleBinaryKernelImpl = js.native
}

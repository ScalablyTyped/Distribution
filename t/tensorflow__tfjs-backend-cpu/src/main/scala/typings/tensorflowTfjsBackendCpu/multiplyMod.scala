package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Multiply", JSImport.Namespace)
@js.native
object multiplyMod extends js.Object {
  
  val multiply: KernelFunc = js.native
  
  val multiplyComplexImpl: ComplexBinaryKernelImpl = js.native
  
  val multiplyConfig: KernelConfig = js.native
  
  val multiplyImpl: SimpleBinaryKernelImpl = js.native
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Add", JSImport.Namespace)
@js.native
object addMod extends js.Object {
  
  val add: KernelFunc = js.native
  
  val addComplexImpl: ComplexBinaryKernelImpl = js.native
  
  val addConfig: KernelConfig = js.native
  
  val addImpl: SimpleBinaryKernelImpl = js.native
}

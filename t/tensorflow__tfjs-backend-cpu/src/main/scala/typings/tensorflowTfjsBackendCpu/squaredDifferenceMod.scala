package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SquaredDifference", JSImport.Namespace)
@js.native
object squaredDifferenceMod extends js.Object {
  
  val squaredDifference: KernelFunc = js.native
  
  val squaredDifferenceConfig: KernelConfig = js.native
  
  val squaredDifferenceImpl: SimpleBinaryKernelImpl = js.native
}

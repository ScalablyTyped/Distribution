package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/binary_impl", JSImport.Namespace)
@js.native
object binaryImplMod extends js.Object {
  
  def createSimpleBinaryKernelImpl(op: SimpleBinaryOperation): SimpleBinaryKernelImpl = js.native
}

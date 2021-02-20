package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/binary_impl", "createSimpleBinaryKernelImpl")
  @js.native
  def createSimpleBinaryKernelImpl(op: SimpleBinaryOperation): SimpleBinaryKernelImpl = js.native
}

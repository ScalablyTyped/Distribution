package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryOperation
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_utils", JSImport.Namespace)
@js.native
object unaryUtilsMod extends js.Object {
  
  def unaryKernelFunc(name: String, op: SimpleUnaryOperation): KernelFunc = js.native
  def unaryKernelFunc(name: String, op: SimpleUnaryOperation, dtype: DataType): KernelFunc = js.native
  
  def unaryKernelFuncFromImpl(name: String, unaryImpl: SimpleUnaryImpl): KernelFunc = js.native
  def unaryKernelFuncFromImpl(name: String, unaryImpl: SimpleUnaryImpl, dtype: DataType): KernelFunc = js.native
}

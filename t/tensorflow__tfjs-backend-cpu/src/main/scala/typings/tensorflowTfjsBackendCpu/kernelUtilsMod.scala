package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryOperation
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/kernel_utils", "binaryKernelFunc")
  @js.native
  def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl): KernelFunc = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/kernel_utils", "binaryKernelFunc")
  @js.native
  def binaryKernelFunc(
    name: String,
    simpleImpl: SimpleBinaryKernelImpl,
    complexImpl: js.UndefOr[scala.Nothing],
    dtype: DataType
  ): KernelFunc = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/kernel_utils", "binaryKernelFunc")
  @js.native
  def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl, complexImpl: ComplexBinaryKernelImpl): KernelFunc = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/kernel_utils", "binaryKernelFunc")
  @js.native
  def binaryKernelFunc(
    name: String,
    simpleImpl: SimpleBinaryKernelImpl,
    complexImpl: ComplexBinaryKernelImpl,
    dtype: DataType
  ): KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/kernel_utils", "createComplexBinaryKernelImpl")
  @js.native
  def createComplexBinaryKernelImpl(op: ComplexBinaryOperation): ComplexBinaryKernelImpl = js.native
}

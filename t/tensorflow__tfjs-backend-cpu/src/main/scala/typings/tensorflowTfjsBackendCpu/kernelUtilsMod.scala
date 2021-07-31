package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryOperation
import typings.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/kernel_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(name.asInstanceOf[js.Any], simpleImpl.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  @scala.inline
  def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl, complexImpl: Unit, dtype: DataType): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(name.asInstanceOf[js.Any], simpleImpl.asInstanceOf[js.Any], complexImpl.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  @scala.inline
  def binaryKernelFunc(name: String, simpleImpl: SimpleBinaryKernelImpl, complexImpl: ComplexBinaryKernelImpl): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(name.asInstanceOf[js.Any], simpleImpl.asInstanceOf[js.Any], complexImpl.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  @scala.inline
  def binaryKernelFunc(
    name: String,
    simpleImpl: SimpleBinaryKernelImpl,
    complexImpl: ComplexBinaryKernelImpl,
    dtype: DataType
  ): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryKernelFunc")(name.asInstanceOf[js.Any], simpleImpl.asInstanceOf[js.Any], complexImpl.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  
  @scala.inline
  def createComplexBinaryKernelImpl(op: ComplexBinaryOperation): ComplexBinaryKernelImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplexBinaryKernelImpl")(op.asInstanceOf[js.Any]).asInstanceOf[ComplexBinaryKernelImpl]
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryImpl
import typings.tensorflowTfjsBackendCpu.distUtilsUnaryTypesMod.SimpleUnaryOperation
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelFunc
import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUnaryUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unaryKernelFunc(name: String, op: SimpleUnaryOperation): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("unaryKernelFunc")(name.asInstanceOf[js.Any], op.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  inline def unaryKernelFunc(name: String, op: SimpleUnaryOperation, dtype: DataType): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("unaryKernelFunc")(name.asInstanceOf[js.Any], op.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  
  inline def unaryKernelFuncFromImpl(name: String, unaryImpl: SimpleUnaryImpl): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("unaryKernelFuncFromImpl")(name.asInstanceOf[js.Any], unaryImpl.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
  inline def unaryKernelFuncFromImpl(name: String, unaryImpl: SimpleUnaryImpl, dtype: DataType): KernelFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("unaryKernelFuncFromImpl")(name.asInstanceOf[js.Any], unaryImpl.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[KernelFunc]
}

package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.InputsSparseSegmentSumInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsSparseSegmentSumMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseSegmentSum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseSegmentSum(args: InputsSparseSegmentSumInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SparseSegmentSum", "sparseSegmentSumConfig")
  @js.native
  val sparseSegmentSumConfig: KernelConfig = js.native
}

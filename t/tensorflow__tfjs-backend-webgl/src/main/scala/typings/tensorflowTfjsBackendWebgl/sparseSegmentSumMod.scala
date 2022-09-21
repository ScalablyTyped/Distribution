package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.InputsSparseSegmentSumInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseSegmentSumMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SparseSegmentSum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sparseSegmentSum(args: InputsSparseSegmentSumInputs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/SparseSegmentSum", "sparseSegmentSumConfig")
  @js.native
  val sparseSegmentSumConfig: KernelConfig = js.native
}

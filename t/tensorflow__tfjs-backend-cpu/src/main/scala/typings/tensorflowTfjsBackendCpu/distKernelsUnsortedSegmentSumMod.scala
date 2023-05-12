package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsBackendCpu.anon.AttrsUnsortedSegmentSumAttrs
import typings.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsUnsortedSegmentSumMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/UnsortedSegmentSum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsortedSegmentSum(args: AttrsUnsortedSegmentSumAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/UnsortedSegmentSum", "unsortedSegmentSumConfig")
  @js.native
  val unsortedSegmentSumConfig: KernelConfig = js.native
}

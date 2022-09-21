package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.AttrsUnsortedSegmentSumAttrs
import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsortedSegmentSumMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/UnsortedSegmentSum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsortedSegmentSum(args: AttrsUnsortedSegmentSumAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/UnsortedSegmentSum", "unsortedSegmentSumConfig")
  @js.native
  val unsortedSegmentSumConfig: KernelConfig = js.native
}

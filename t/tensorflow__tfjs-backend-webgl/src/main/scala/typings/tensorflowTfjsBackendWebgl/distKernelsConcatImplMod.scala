package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelNamesMod.ConcatInputs
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsConcatImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Concat_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatImpl(inputs: ConcatInputs, axis: Double, backend: MathBackendWebGL): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("concatImpl")(inputs.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}

package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTransposeImplMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Transpose_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transposeImpl(x: TensorInfo, perm: js.Array[Double], backend: MathBackendWebGL): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("transposeImpl")(x.asInstanceOf[js.Any], perm.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}

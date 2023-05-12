package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distBackendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelUtilsReshapeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/reshape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def packedReshape(input: TensorInfo, afterShape: js.Array[Double], backend: MathBackendWebGL): TensorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("packedReshape")(input.asInstanceOf[js.Any], afterShape.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[TensorInfo]
}

package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/reshape", JSImport.Namespace)
@js.native
object kernelUtilsReshapeMod extends js.Object {
  
  def packedReshape(input: TensorInfo, afterShape: js.Array[Double], backend: MathBackendWebGL): TensorInfo = js.native
}

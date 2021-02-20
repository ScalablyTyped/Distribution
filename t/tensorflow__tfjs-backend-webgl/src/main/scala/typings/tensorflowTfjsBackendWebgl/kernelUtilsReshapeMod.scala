package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelUtilsReshapeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernel_utils/reshape", "packedReshape")
  @js.native
  def packedReshape(input: TensorInfo, afterShape: js.Array[Double], backend: MathBackendWebGL): TensorInfo = js.native
}

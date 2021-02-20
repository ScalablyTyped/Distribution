package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMatrixGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_matrix_gpu", "EncodeMatrixProgram")
  @js.native
  class EncodeMatrixProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double], texShape: js.Tuple2[Double, Double]) = this()
    def this(
      outputShape: js.Tuple3[Double, Double, Double],
      texShape: js.Tuple2[Double, Double],
      inputIsUnsignedByte: Boolean
    ) = this()
  }
}

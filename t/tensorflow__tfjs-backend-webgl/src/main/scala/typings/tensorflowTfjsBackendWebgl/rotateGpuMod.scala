package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/rotate_gpu", JSImport.Namespace)
@js.native
object rotateGpuMod extends js.Object {
  
  @js.native
  class RotateProgram protected () extends GPGPUProgram {
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      radians: Double,
      fillValue: js.Tuple3[Double, Double, Double],
      center: js.Tuple2[Double, Double]
    ) = this()
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      radians: Double,
      fillValue: js.Tuple3[Double, Double, Double],
      center: Double
    ) = this()
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      radians: Double,
      fillValue: Double,
      center: js.Tuple2[Double, Double]
    ) = this()
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      radians: Double,
      fillValue: Double,
      center: Double
    ) = this()
  }
}

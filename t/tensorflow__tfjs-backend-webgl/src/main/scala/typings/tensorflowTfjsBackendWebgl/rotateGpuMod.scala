package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/rotate_gpu", "RotateProgram")
  @js.native
  class RotateProgram protected ()
    extends StObject
       with GPGPUProgram {
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
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

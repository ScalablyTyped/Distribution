package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Name
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/rotate_gpu", "RotateProgram")
  @js.native
  open class RotateProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      fillValue: js.Tuple3[Double, Double, Double]
    ) = this()
    def this(imageShape: js.Tuple4[Double, Double, Double, Double], fillValue: Double) = this()
    
    @JSName("customUniforms")
    var customUniforms_RotateProgram: js.Array[Name] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

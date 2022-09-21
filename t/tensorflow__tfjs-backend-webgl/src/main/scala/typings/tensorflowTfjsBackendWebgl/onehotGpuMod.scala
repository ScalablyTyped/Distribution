package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onehotGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/onehot_gpu", "OneHotProgram")
  @js.native
  open class OneHotProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(numIndices: Double, depth: Double, onValue: Double, offValue: Double) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    var seedLoc: WebGLUniformLocation = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

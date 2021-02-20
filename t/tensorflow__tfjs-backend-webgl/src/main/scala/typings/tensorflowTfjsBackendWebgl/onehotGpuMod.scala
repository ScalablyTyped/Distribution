package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onehotGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/onehot_gpu", "OneHotProgram")
  @js.native
  class OneHotProgram protected () extends GPGPUProgram {
    def this(numIndices: Double, depth: Double, onValue: Double, offValue: Double) = this()
    
    var seedLoc: WebGLUniformLocation = js.native
  }
}

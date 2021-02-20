package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addnGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/addn_gpu", "AddNProgram")
  @js.native
  class AddNProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double], shapes: js.Array[js.Array[Double]]) = this()
  }
}

package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/concat_gpu", "ConcatProgram")
  @js.native
  class ConcatProgram protected () extends GPGPUProgram {
    def this(shapes: js.Array[js.Tuple2[Double, Double]]) = this()
  }
}

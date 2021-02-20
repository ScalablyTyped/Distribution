package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transposeGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/transpose_gpu", "TransposeProgram")
  @js.native
  class TransposeProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], newDim: js.Array[Double]) = this()
    
    var rank: Double = js.native
  }
}

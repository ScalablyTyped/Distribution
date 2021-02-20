package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/pack_gpu", "PackProgram")
  @js.native
  class PackProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("packedInputs")
    var packedInputs_PackProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_PackProgram: Boolean = js.native
  }
}

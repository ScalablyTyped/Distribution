package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tile_gpu", "TileProgram")
  @js.native
  class TileProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], reps: js.Array[Double]) = this()
    
    var rank: Double = js.native
  }
}

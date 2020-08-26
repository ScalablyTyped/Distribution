package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/tile_gpu", JSImport.Namespace)
@js.native
object tileGpuMod extends js.Object {
  @js.native
  class TileProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], reps: js.Array[Double]) = this()
    var rank: Double = js.native
  }
  
}


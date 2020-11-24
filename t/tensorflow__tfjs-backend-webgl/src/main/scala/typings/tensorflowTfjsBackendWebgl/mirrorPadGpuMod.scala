package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.reflect
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.symmetric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/mirror_pad_gpu", JSImport.Namespace)
@js.native
object mirrorPadGpuMod extends js.Object {
  
  @js.native
  class MirrorPadProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect) = this()
    def this(xShape: js.Array[Double], paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric) = this()
  }
}

package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeBilinearGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_bilinear_gpu", "ResizeBilinearProgram")
  @js.native
  class ResizeBilinearProgram protected () extends GPGPUProgram {
    def this(
      inputShape: js.Tuple4[Double, Double, Double, Double],
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
    ) = this()
  }
}

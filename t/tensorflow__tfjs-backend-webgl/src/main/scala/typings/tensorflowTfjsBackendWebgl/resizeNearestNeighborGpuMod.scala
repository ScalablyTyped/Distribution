package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeNearestNeighborGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_nearest_neighbor_gpu", "ResizeNearestNeighborProgram")
  @js.native
  class ResizeNearestNeighborProgram protected () extends GPGPUProgram {
    def this(
      inputShape: js.Tuple4[Double, Double, Double, Double],
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
    ) = this()
  }
}

package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeNearestNeighborBackpropGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_nearest_neighbor_backprop_gpu", "ResizeNearestNeigborBackpropProgram")
  @js.native
  class ResizeNearestNeigborBackpropProgram protected () extends GPGPUProgram {
    def this(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean) = this()
  }
}

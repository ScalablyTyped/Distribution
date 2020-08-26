package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.bilinear
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/crop_and_resize_gpu", JSImport.Namespace)
@js.native
object cropAndResizeGpuMod extends js.Object {
  @js.native
  class CropAndResizeProgram protected () extends GPGPUProgram {
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      boxShape: js.Tuple2[Double, Double],
      cropSize: js.Tuple2[Double, Double],
      method: bilinear,
      extrapolationValue: Double
    ) = this()
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      boxShape: js.Tuple2[Double, Double],
      cropSize: js.Tuple2[Double, Double],
      method: nearest,
      extrapolationValue: Double
    ) = this()
  }
  
}


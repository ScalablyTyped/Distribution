package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bilinear
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.nearest
import typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/crop_and_resize_gpu", JSImport.Namespace)
@js.native
object distBackendsWebglCropUnderscoreAndUnderscoreResizeUnderscoreGpuMod extends js.Object {
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
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}


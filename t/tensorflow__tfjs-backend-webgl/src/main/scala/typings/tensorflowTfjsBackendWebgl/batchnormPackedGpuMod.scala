package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/batchnorm_packed_gpu", JSImport.Namespace)
@js.native
object batchnormPackedGpuMod extends js.Object {
  @js.native
  class BatchNormPackedProgram protected () extends GPGPUProgram {
    def this(
      xShape: js.Array[Double],
      meanShape: js.Array[Double],
      varianceShape: js.Array[Double],
      offsetShape: js.Array[Double],
      scaleShape: js.Array[Double],
      varianceEpsilon: Double
    ) = this()
    def this(
      xShape: js.Array[Double],
      meanShape: js.Array[Double],
      varianceShape: js.Array[Double],
      offsetShape: js.Array[Double],
      scaleShape: Null,
      varianceEpsilon: Double
    ) = this()
    def this(
      xShape: js.Array[Double],
      meanShape: js.Array[Double],
      varianceShape: js.Array[Double],
      offsetShape: Null,
      scaleShape: js.Array[Double],
      varianceEpsilon: Double
    ) = this()
    def this(
      xShape: js.Array[Double],
      meanShape: js.Array[Double],
      varianceShape: js.Array[Double],
      offsetShape: Null,
      scaleShape: Null,
      varianceEpsilon: Double
    ) = this()
    @JSName("packedInputs")
    var packedInputs_BatchNormPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_BatchNormPackedProgram: Boolean = js.native
  }
  
}


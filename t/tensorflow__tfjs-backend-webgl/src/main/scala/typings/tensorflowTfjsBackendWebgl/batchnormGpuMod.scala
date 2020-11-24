package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/batchnorm_gpu", JSImport.Namespace)
@js.native
object batchnormGpuMod extends js.Object {
  
  @js.native
  class BatchNormProgram protected () extends GPGPUProgram {
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
  }
}

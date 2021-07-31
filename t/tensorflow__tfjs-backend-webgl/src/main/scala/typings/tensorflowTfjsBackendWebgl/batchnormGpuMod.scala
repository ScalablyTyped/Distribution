package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchnormGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/batchnorm_gpu", "BatchNormProgram")
  @js.native
  class BatchNormProgram protected ()
    extends StObject
       with GPGPUProgram {
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
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScatterGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/scatter_gpu", "ScatterProgram")
  @js.native
  open class ScatterProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(
      updateSize: Double,
      sliceDim: Double,
      indicesRank: Double,
      updatesRank: Double,
      strides: js.Array[Double],
      shape: js.Array[Double]
    ) = this()
    def this(
      updateSize: Double,
      sliceDim: Double,
      indicesRank: Double,
      updatesRank: Double,
      strides: js.Array[Double],
      shape: js.Array[Double],
      summingDupeIndex: Boolean
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

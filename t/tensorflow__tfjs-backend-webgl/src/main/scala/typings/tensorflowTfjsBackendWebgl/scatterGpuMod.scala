package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/scatter_gpu", "ScatterProgram")
  @js.native
  class ScatterProgram protected () extends GPGPUProgram {
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
  }
}

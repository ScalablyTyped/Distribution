package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meanGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/mean_gpu", "MeanProgram")
  @js.native
  class MeanProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo) = this()
    def this(reduceInfo: ReduceInfo, divisor: Double) = this()
  }
}

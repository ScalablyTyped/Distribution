package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import typings.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argminmaxGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/argminmax_gpu", "ArgMinMaxProgram")
  @js.native
  class ArgMinMaxProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo, op: max, firstPass: Boolean) = this()
    def this(reduceInfo: ReduceInfo, op: min, firstPass: Boolean) = this()
  }
}

package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stridedSliceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/strided_slice_gpu", "StridedSliceProgram")
  @js.native
  class StridedSliceProgram protected () extends GPGPUProgram {
    def this(begin: js.Array[Double], strides: js.Array[Double], size: js.Array[Double]) = this()
  }
}

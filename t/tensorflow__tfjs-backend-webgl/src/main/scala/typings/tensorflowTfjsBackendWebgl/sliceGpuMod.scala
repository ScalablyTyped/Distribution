package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLProgram
import typings.std.WebGLUniformLocation
import typings.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/slice_gpu", "SliceProgram")
  @js.native
  class SliceProgram protected () extends GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    
    def getCustomSetupFunc(start: js.Array[Double]): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var rank: Double = js.native
    
    var startLoc: WebGLUniformLocation = js.native
  }
}

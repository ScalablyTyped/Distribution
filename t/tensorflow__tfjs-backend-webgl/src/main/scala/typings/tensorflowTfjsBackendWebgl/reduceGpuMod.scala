package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.all
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.any
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.prod
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.sum
import typings.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/reduce_gpu", "ReduceProgram")
  @js.native
  open class ReduceProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(reduceInfo: ReduceInfo, reduceType: all | any | max | min | sum | prod) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

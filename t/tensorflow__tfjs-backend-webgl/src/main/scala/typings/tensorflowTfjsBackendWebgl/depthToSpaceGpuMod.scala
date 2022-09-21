package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.NCHW
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.NHWC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthToSpaceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/depth_to_space_gpu", "DepthToSpaceProgram")
  @js.native
  open class DepthToSpaceProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double], blockSize: Double, dataFormat: NHWC | NCHW) = this()
    
    var blockSize: Double = js.native
    
    var dataFormat: String = js.native
    
    /* private */ var getDepthCoordString: Any = js.native
    
    /* private */ var getHeightCoordString: Any = js.native
    
    /* private */ var getInputSamplingString: Any = js.native
    
    /* private */ var getOutputDepthSize: Any = js.native
    
    /* private */ var getWidthCoordString: Any = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

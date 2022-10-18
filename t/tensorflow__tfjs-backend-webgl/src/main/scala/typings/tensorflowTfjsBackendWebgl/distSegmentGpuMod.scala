package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.unsortedSegmentSum
import typings.tensorflowTfjsCore.distOpsSegmentUtilMod.SegOpInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSegmentGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/segment_gpu", "SegmentOpProgram")
  @js.native
  open class SegmentOpProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(segOpInfo: SegOpInfo, segOpType: unsortedSegmentSum) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

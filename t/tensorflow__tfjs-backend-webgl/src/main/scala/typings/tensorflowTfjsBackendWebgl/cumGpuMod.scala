package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Name
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cumGpuMod {
  
  @js.native
  sealed trait CumOpType extends StObject
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/cum_gpu", "CumOpType")
  @js.native
  object CumOpType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CumOpType & String] = js.native
    
    @js.native
    sealed trait Prod
      extends StObject
         with CumOpType
    /* "*" */ val Prod: typings.tensorflowTfjsBackendWebgl.cumGpuMod.CumOpType.Prod & String = js.native
    
    @js.native
    sealed trait Sum
      extends StObject
         with CumOpType
    /* "+" */ val Sum: typings.tensorflowTfjsBackendWebgl.cumGpuMod.CumOpType.Sum & String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/cum_gpu", "CumProgram")
  @js.native
  open class CumProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(op: CumOpType, outputShape: js.Array[Double], exclusive: Boolean, reverse: Boolean) = this()
    
    @JSName("customUniforms")
    var customUniforms_CumProgram: js.Array[Name] = js.native
    
    var op: CumOpType = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

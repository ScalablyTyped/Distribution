package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Name
import typings.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topKGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/top_k_gpu", "MergeProgram")
  @js.native
  open class MergeProgram protected ()
    extends StObject
       with GPGPUProgram {
    /**
      * @param shape desired output shape (must be half of the input size)
      */
    def this(shape: js.Array[Double]) = this()
    
    @JSName("customUniforms")
    var customUniforms_MergeProgram: js.Array[Name] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/top_k_gpu", "SwapProgram")
  @js.native
  open class SwapProgram protected ()
    extends StObject
       with GPGPUProgram {
    /**
      * @param shape desired output shape (can be larger than input shape, output
      *                                    will be padded with -Infinity)
      */
    def this(shape: js.Array[Double]) = this()
    
    @JSName("customUniforms")
    var customUniforms_SwapProgram: js.Array[Name] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

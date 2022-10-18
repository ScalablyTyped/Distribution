package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.anon.Name
import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.left
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchSortedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/search_sorted_gpu", "SearchSortedProgram")
  @js.native
  open class SearchSortedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(batchSize: Double, numInputs: Double, numValues: Double, side: left | right) = this()
    
    @JSName("customUniforms")
    var customUniforms_SearchSortedProgram: js.Array[Name] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}

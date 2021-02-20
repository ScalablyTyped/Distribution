package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glslVersionMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/glsl_version", "getGlslDifferences")
  @js.native
  def getGlslDifferences(): GLSL = js.native
  
  @js.native
  trait GLSL extends StObject {
    
    var attribute: String = js.native
    
    var defineOutput: String = js.native
    
    var defineRound: String = js.native
    
    var defineSpecialInf: String = js.native
    
    var defineSpecialNaN: String = js.native
    
    var output: String = js.native
    
    var texture2D: String = js.native
    
    var varyingFs: String = js.native
    
    var varyingVs: String = js.native
    
    var version: String = js.native
  }
  object GLSL {
    
    @scala.inline
    def apply(
      attribute: String,
      defineOutput: String,
      defineRound: String,
      defineSpecialInf: String,
      defineSpecialNaN: String,
      output: String,
      texture2D: String,
      varyingFs: String,
      varyingVs: String,
      version: String
    ): GLSL = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], defineOutput = defineOutput.asInstanceOf[js.Any], defineRound = defineRound.asInstanceOf[js.Any], defineSpecialInf = defineSpecialInf.asInstanceOf[js.Any], defineSpecialNaN = defineSpecialNaN.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], texture2D = texture2D.asInstanceOf[js.Any], varyingFs = varyingFs.asInstanceOf[js.Any], varyingVs = varyingVs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[GLSL]
    }
    
    @scala.inline
    implicit class GLSLMutableBuilder[Self <: GLSL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefineOutput(value: String): Self = StObject.set(x, "defineOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefineRound(value: String): Self = StObject.set(x, "defineRound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefineSpecialInf(value: String): Self = StObject.set(x, "defineSpecialInf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefineSpecialNaN(value: String): Self = StObject.set(x, "defineSpecialNaN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTexture2D(value: String): Self = StObject.set(x, "texture2D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaryingFs(value: String): Self = StObject.set(x, "varyingFs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaryingVs(value: String): Self = StObject.set(x, "varyingVs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

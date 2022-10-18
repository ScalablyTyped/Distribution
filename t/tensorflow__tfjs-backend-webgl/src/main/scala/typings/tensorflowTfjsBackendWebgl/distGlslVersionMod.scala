package typings.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGlslVersionMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/glsl_version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlslDifferences(): GLSL = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlslDifferences")().asInstanceOf[GLSL]
  
  trait GLSL extends StObject {
    
    var attribute: String
    
    var defineOutput: String
    
    var defineRound: String
    
    var defineSpecialInf: String
    
    var defineSpecialNaN: String
    
    var output: String
    
    var texture2D: String
    
    var varyingFs: String
    
    var varyingVs: String
    
    var version: String
  }
  object GLSL {
    
    inline def apply(
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
    
    extension [Self <: GLSL](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setDefineOutput(value: String): Self = StObject.set(x, "defineOutput", value.asInstanceOf[js.Any])
      
      inline def setDefineRound(value: String): Self = StObject.set(x, "defineRound", value.asInstanceOf[js.Any])
      
      inline def setDefineSpecialInf(value: String): Self = StObject.set(x, "defineSpecialInf", value.asInstanceOf[js.Any])
      
      inline def setDefineSpecialNaN(value: String): Self = StObject.set(x, "defineSpecialNaN", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setTexture2D(value: String): Self = StObject.set(x, "texture2D", value.asInstanceOf[js.Any])
      
      inline def setVaryingFs(value: String): Self = StObject.set(x, "varyingFs", value.asInstanceOf[js.Any])
      
      inline def setVaryingVs(value: String): Self = StObject.set(x, "varyingVs", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

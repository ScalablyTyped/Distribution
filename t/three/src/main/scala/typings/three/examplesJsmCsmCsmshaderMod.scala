package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmCsmCsmshaderMod {
  
  trait CSMShader extends StObject {
    
    var lights_fragment_begin: String
    
    var lights_pars_begin: String
  }
  object CSMShader {
    
    inline def apply(lights_fragment_begin: String, lights_pars_begin: String): CSMShader = {
      val __obj = js.Dynamic.literal(lights_fragment_begin = lights_fragment_begin.asInstanceOf[js.Any], lights_pars_begin = lights_pars_begin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSMShader]
    }
    
    extension [Self <: CSMShader](x: Self) {
      
      inline def setLights_fragment_begin(value: String): Self = StObject.set(x, "lights_fragment_begin", value.asInstanceOf[js.Any])
      
      inline def setLights_pars_begin(value: String): Self = StObject.set(x, "lights_pars_begin", value.asInstanceOf[js.Any])
    }
  }
}

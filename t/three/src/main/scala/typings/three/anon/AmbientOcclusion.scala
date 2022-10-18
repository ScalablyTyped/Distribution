package typings.three.anon

import typings.three.examplesJsmNodesCoreNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmbientOcclusion extends StObject {
  
  var ambientOcclusion: default
  
  var reflectedLight: default
}
object AmbientOcclusion {
  
  inline def apply(ambientOcclusion: default, reflectedLight: default): AmbientOcclusion = {
    val __obj = js.Dynamic.literal(ambientOcclusion = ambientOcclusion.asInstanceOf[js.Any], reflectedLight = reflectedLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientOcclusion]
  }
  
  extension [Self <: AmbientOcclusion](x: Self) {
    
    inline def setAmbientOcclusion(value: default): Self = StObject.set(x, "ambientOcclusion", value.asInstanceOf[js.Any])
    
    inline def setReflectedLight(value: default): Self = StObject.set(x, "reflectedLight", value.asInstanceOf[js.Any])
  }
}

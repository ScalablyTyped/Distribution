package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DISTANCEATTENUATION extends StObject {
  
  var DISTANCE_ATTENUATION: Boolean
  
  var FRESNEL: Boolean
}
object DISTANCEATTENUATION {
  
  inline def apply(DISTANCE_ATTENUATION: Boolean, FRESNEL: Boolean): DISTANCEATTENUATION = {
    val __obj = js.Dynamic.literal(DISTANCE_ATTENUATION = DISTANCE_ATTENUATION.asInstanceOf[js.Any], FRESNEL = FRESNEL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DISTANCEATTENUATION]
  }
  
  extension [Self <: DISTANCEATTENUATION](x: Self) {
    
    inline def setDISTANCE_ATTENUATION(value: Boolean): Self = StObject.set(x, "DISTANCE_ATTENUATION", value.asInstanceOf[js.Any])
    
    inline def setFRESNEL(value: Boolean): Self = StObject.set(x, "FRESNEL", value.asInstanceOf[js.Any])
  }
}

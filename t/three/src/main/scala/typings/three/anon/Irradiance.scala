package typings.three.anon

import typings.three.nodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Irradiance extends StObject {
  
  var irradiance: default
  
  var reflectedLight: default
}
object Irradiance {
  
  inline def apply(irradiance: default, reflectedLight: default): Irradiance = {
    val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], reflectedLight = reflectedLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Irradiance]
  }
  
  extension [Self <: Irradiance](x: Self) {
    
    inline def setIrradiance(value: default): Self = StObject.set(x, "irradiance", value.asInstanceOf[js.Any])
    
    inline def setReflectedLight(value: default): Self = StObject.set(x, "reflectedLight", value.asInstanceOf[js.Any])
  }
}

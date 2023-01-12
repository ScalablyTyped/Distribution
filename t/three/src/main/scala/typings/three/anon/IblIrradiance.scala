package typings.three.anon

import typings.three.examplesJsmNodesCoreNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IblIrradiance extends StObject {
  
  var iblIrradiance: default
  
  var radiance: default
  
  var reflectedLight: default
}
object IblIrradiance {
  
  inline def apply(iblIrradiance: default, radiance: default, reflectedLight: default): IblIrradiance = {
    val __obj = js.Dynamic.literal(iblIrradiance = iblIrradiance.asInstanceOf[js.Any], radiance = radiance.asInstanceOf[js.Any], reflectedLight = reflectedLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IblIrradiance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IblIrradiance] (val x: Self) extends AnyVal {
    
    inline def setIblIrradiance(value: default): Self = StObject.set(x, "iblIrradiance", value.asInstanceOf[js.Any])
    
    inline def setRadiance(value: default): Self = StObject.set(x, "radiance", value.asInstanceOf[js.Any])
    
    inline def setReflectedLight(value: default): Self = StObject.set(x, "reflectedLight", value.asInstanceOf[js.Any])
  }
}

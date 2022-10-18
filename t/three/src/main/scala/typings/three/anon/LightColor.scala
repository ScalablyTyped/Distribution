package typings.three.anon

import typings.three.examplesJsmNodesCoreNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightColor extends StObject {
  
  var lightColor: default
  
  var lightDirection: default
  
  var reflectedLight: default
}
object LightColor {
  
  inline def apply(lightColor: default, lightDirection: default, reflectedLight: default): LightColor = {
    val __obj = js.Dynamic.literal(lightColor = lightColor.asInstanceOf[js.Any], lightDirection = lightDirection.asInstanceOf[js.Any], reflectedLight = reflectedLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightColor]
  }
  
  extension [Self <: LightColor](x: Self) {
    
    inline def setLightColor(value: default): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    inline def setLightDirection(value: default): Self = StObject.set(x, "lightDirection", value.asInstanceOf[js.Any])
    
    inline def setReflectedLight(value: default): Self = StObject.set(x, "reflectedLight", value.asInstanceOf[js.Any])
  }
}

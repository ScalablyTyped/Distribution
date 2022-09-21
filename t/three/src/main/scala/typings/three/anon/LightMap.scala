package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightMap extends StObject {
  
  var lightMap: IUniform[Any]
  
  var lightMapIntensity: IUniform[Any]
}
object LightMap {
  
  inline def apply(lightMap: IUniform[Any], lightMapIntensity: IUniform[Any]): LightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap.asInstanceOf[js.Any], lightMapIntensity = lightMapIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightMap]
  }
  
  extension [Self <: LightMap](x: Self) {
    
    inline def setLightMap(value: IUniform[Any]): Self = StObject.set(x, "lightMap", value.asInstanceOf[js.Any])
    
    inline def setLightMapIntensity(value: IUniform[Any]): Self = StObject.set(x, "lightMapIntensity", value.asInstanceOf[js.Any])
  }
}

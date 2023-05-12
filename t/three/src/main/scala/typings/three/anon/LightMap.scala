package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightMap extends StObject {
  
  var lightMap: IUniform[Double]
  
  var lightMapIntensity: IUniform[Double]
  
  var lightMapTransform: IUniform[Matrix3]
}
object LightMap {
  
  inline def apply(
    lightMap: IUniform[Double],
    lightMapIntensity: IUniform[Double],
    lightMapTransform: IUniform[Matrix3]
  ): LightMap = {
    val __obj = js.Dynamic.literal(lightMap = lightMap.asInstanceOf[js.Any], lightMapIntensity = lightMapIntensity.asInstanceOf[js.Any], lightMapTransform = lightMapTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LightMap] (val x: Self) extends AnyVal {
    
    inline def setLightMap(value: IUniform[Double]): Self = StObject.set(x, "lightMap", value.asInstanceOf[js.Any])
    
    inline def setLightMapIntensity(value: IUniform[Double]): Self = StObject.set(x, "lightMapIntensity", value.asInstanceOf[js.Any])
    
    inline def setLightMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "lightMapTransform", value.asInstanceOf[js.Any])
  }
}

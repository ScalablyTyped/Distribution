package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FogColor extends StObject {
  
  var fogColor: IUniform[typings.three.srcMathColorMod.Color]
  
  var fogDensity: IUniform[Double]
  
  var fogFar: IUniform[Double]
  
  var fogNear: IUniform[Double]
}
object FogColor {
  
  inline def apply(
    fogColor: IUniform[typings.three.srcMathColorMod.Color],
    fogDensity: IUniform[Double],
    fogFar: IUniform[Double],
    fogNear: IUniform[Double]
  ): FogColor = {
    val __obj = js.Dynamic.literal(fogColor = fogColor.asInstanceOf[js.Any], fogDensity = fogDensity.asInstanceOf[js.Any], fogFar = fogFar.asInstanceOf[js.Any], fogNear = fogNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[FogColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FogColor] (val x: Self) extends AnyVal {
    
    inline def setFogColor(value: IUniform[typings.three.srcMathColorMod.Color]): Self = StObject.set(x, "fogColor", value.asInstanceOf[js.Any])
    
    inline def setFogDensity(value: IUniform[Double]): Self = StObject.set(x, "fogDensity", value.asInstanceOf[js.Any])
    
    inline def setFogFar(value: IUniform[Double]): Self = StObject.set(x, "fogFar", value.asInstanceOf[js.Any])
    
    inline def setFogNear(value: IUniform[Double]): Self = StObject.set(x, "fogNear", value.asInstanceOf[js.Any])
  }
}

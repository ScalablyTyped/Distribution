package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FogColor extends StObject {
  
  var fogColor: IUniform[Any]
  
  var fogDensity: IUniform[Any]
  
  var fogFar: IUniform[Any]
  
  var fogNear: IUniform[Any]
}
object FogColor {
  
  inline def apply(fogColor: IUniform[Any], fogDensity: IUniform[Any], fogFar: IUniform[Any], fogNear: IUniform[Any]): FogColor = {
    val __obj = js.Dynamic.literal(fogColor = fogColor.asInstanceOf[js.Any], fogDensity = fogDensity.asInstanceOf[js.Any], fogFar = fogFar.asInstanceOf[js.Any], fogNear = fogNear.asInstanceOf[js.Any])
    __obj.asInstanceOf[FogColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FogColor] (val x: Self) extends AnyVal {
    
    inline def setFogColor(value: IUniform[Any]): Self = StObject.set(x, "fogColor", value.asInstanceOf[js.Any])
    
    inline def setFogDensity(value: IUniform[Any]): Self = StObject.set(x, "fogDensity", value.asInstanceOf[js.Any])
    
    inline def setFogFar(value: IUniform[Any]): Self = StObject.set(x, "fogFar", value.asInstanceOf[js.Any])
    
    inline def setFogNear(value: IUniform[Any]): Self = StObject.set(x, "fogNear", value.asInstanceOf[js.Any])
  }
}

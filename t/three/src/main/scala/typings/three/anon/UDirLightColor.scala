package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UDirLightColor extends StObject {
  
  var uAmbientLightColor: IUniform[Any]
  
  var uBaseColor: IUniform[Any]
  
  var uDirLightColor: IUniform[Any]
  
  var uDirLightPos: IUniform[Any]
  
  var uLineColor1: IUniform[Any]
}
object UDirLightColor {
  
  inline def apply(
    uAmbientLightColor: IUniform[Any],
    uBaseColor: IUniform[Any],
    uDirLightColor: IUniform[Any],
    uDirLightPos: IUniform[Any],
    uLineColor1: IUniform[Any]
  ): UDirLightColor = {
    val __obj = js.Dynamic.literal(uAmbientLightColor = uAmbientLightColor.asInstanceOf[js.Any], uBaseColor = uBaseColor.asInstanceOf[js.Any], uDirLightColor = uDirLightColor.asInstanceOf[js.Any], uDirLightPos = uDirLightPos.asInstanceOf[js.Any], uLineColor1 = uLineColor1.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDirLightColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UDirLightColor] (val x: Self) extends AnyVal {
    
    inline def setUAmbientLightColor(value: IUniform[Any]): Self = StObject.set(x, "uAmbientLightColor", value.asInstanceOf[js.Any])
    
    inline def setUBaseColor(value: IUniform[Any]): Self = StObject.set(x, "uBaseColor", value.asInstanceOf[js.Any])
    
    inline def setUDirLightColor(value: IUniform[Any]): Self = StObject.set(x, "uDirLightColor", value.asInstanceOf[js.Any])
    
    inline def setUDirLightPos(value: IUniform[Any]): Self = StObject.set(x, "uDirLightPos", value.asInstanceOf[js.Any])
    
    inline def setULineColor1(value: IUniform[Any]): Self = StObject.set(x, "uLineColor1", value.asInstanceOf[js.Any])
  }
}

package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UBaseColor extends StObject {
  
  var uAmbientLightColor: IUniform[Any]
  
  var uBaseColor: IUniform[Any]
  
  var uDirLightColor: IUniform[Any]
  
  var uDirLightPos: IUniform[Any]
  
  var uLineColor1: IUniform[Any]
  
  var uLineColor2: IUniform[Any]
  
  var uLineColor3: IUniform[Any]
  
  var uLineColor4: IUniform[Any]
}
object UBaseColor {
  
  inline def apply(
    uAmbientLightColor: IUniform[Any],
    uBaseColor: IUniform[Any],
    uDirLightColor: IUniform[Any],
    uDirLightPos: IUniform[Any],
    uLineColor1: IUniform[Any],
    uLineColor2: IUniform[Any],
    uLineColor3: IUniform[Any],
    uLineColor4: IUniform[Any]
  ): UBaseColor = {
    val __obj = js.Dynamic.literal(uAmbientLightColor = uAmbientLightColor.asInstanceOf[js.Any], uBaseColor = uBaseColor.asInstanceOf[js.Any], uDirLightColor = uDirLightColor.asInstanceOf[js.Any], uDirLightPos = uDirLightPos.asInstanceOf[js.Any], uLineColor1 = uLineColor1.asInstanceOf[js.Any], uLineColor2 = uLineColor2.asInstanceOf[js.Any], uLineColor3 = uLineColor3.asInstanceOf[js.Any], uLineColor4 = uLineColor4.asInstanceOf[js.Any])
    __obj.asInstanceOf[UBaseColor]
  }
  
  extension [Self <: UBaseColor](x: Self) {
    
    inline def setUAmbientLightColor(value: IUniform[Any]): Self = StObject.set(x, "uAmbientLightColor", value.asInstanceOf[js.Any])
    
    inline def setUBaseColor(value: IUniform[Any]): Self = StObject.set(x, "uBaseColor", value.asInstanceOf[js.Any])
    
    inline def setUDirLightColor(value: IUniform[Any]): Self = StObject.set(x, "uDirLightColor", value.asInstanceOf[js.Any])
    
    inline def setUDirLightPos(value: IUniform[Any]): Self = StObject.set(x, "uDirLightPos", value.asInstanceOf[js.Any])
    
    inline def setULineColor1(value: IUniform[Any]): Self = StObject.set(x, "uLineColor1", value.asInstanceOf[js.Any])
    
    inline def setULineColor2(value: IUniform[Any]): Self = StObject.set(x, "uLineColor2", value.asInstanceOf[js.Any])
    
    inline def setULineColor3(value: IUniform[Any]): Self = StObject.set(x, "uLineColor3", value.asInstanceOf[js.Any])
    
    inline def setULineColor4(value: IUniform[Any]): Self = StObject.set(x, "uLineColor4", value.asInstanceOf[js.Any])
  }
}

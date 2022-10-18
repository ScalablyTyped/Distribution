package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UAmbientLightColor extends StObject {
  
  var uAmbientLightColor: IUniform[Any]
  
  var uBaseColor: IUniform[Any]
  
  var uDirLightColor: IUniform[Any]
  
  var uDirLightPos: IUniform[Any]
}
object UAmbientLightColor {
  
  inline def apply(
    uAmbientLightColor: IUniform[Any],
    uBaseColor: IUniform[Any],
    uDirLightColor: IUniform[Any],
    uDirLightPos: IUniform[Any]
  ): UAmbientLightColor = {
    val __obj = js.Dynamic.literal(uAmbientLightColor = uAmbientLightColor.asInstanceOf[js.Any], uBaseColor = uBaseColor.asInstanceOf[js.Any], uDirLightColor = uDirLightColor.asInstanceOf[js.Any], uDirLightPos = uDirLightPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[UAmbientLightColor]
  }
  
  extension [Self <: UAmbientLightColor](x: Self) {
    
    inline def setUAmbientLightColor(value: IUniform[Any]): Self = StObject.set(x, "uAmbientLightColor", value.asInstanceOf[js.Any])
    
    inline def setUBaseColor(value: IUniform[Any]): Self = StObject.set(x, "uBaseColor", value.asInstanceOf[js.Any])
    
    inline def setUDirLightColor(value: IUniform[Any]): Self = StObject.set(x, "uDirLightColor", value.asInstanceOf[js.Any])
    
    inline def setUDirLightPos(value: IUniform[Any]): Self = StObject.set(x, "uDirLightPos", value.asInstanceOf[js.Any])
  }
}

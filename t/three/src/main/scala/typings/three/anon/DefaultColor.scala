package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultColor extends StObject {
  
  var defaultColor: IUniform[Any]
  
  var defaultOpacity: IUniform[Any]
  
  var luminosityThreshold: IUniform[Any]
  
  var smoothWidth: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object DefaultColor {
  
  inline def apply(
    defaultColor: IUniform[Any],
    defaultOpacity: IUniform[Any],
    luminosityThreshold: IUniform[Any],
    smoothWidth: IUniform[Any],
    tDiffuse: IUniform[Any]
  ): DefaultColor = {
    val __obj = js.Dynamic.literal(defaultColor = defaultColor.asInstanceOf[js.Any], defaultOpacity = defaultOpacity.asInstanceOf[js.Any], luminosityThreshold = luminosityThreshold.asInstanceOf[js.Any], smoothWidth = smoothWidth.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultColor]
  }
  
  extension [Self <: DefaultColor](x: Self) {
    
    inline def setDefaultColor(value: IUniform[Any]): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpacity(value: IUniform[Any]): Self = StObject.set(x, "defaultOpacity", value.asInstanceOf[js.Any])
    
    inline def setLuminosityThreshold(value: IUniform[Any]): Self = StObject.set(x, "luminosityThreshold", value.asInstanceOf[js.Any])
    
    inline def setSmoothWidth(value: IUniform[Any]): Self = StObject.set(x, "smoothWidth", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}

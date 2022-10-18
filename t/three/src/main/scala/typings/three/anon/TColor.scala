package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TColor extends StObject {
  
  var resolution: IUniform[Any]
  
  var tColor: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object TColor {
  
  inline def apply(resolution: IUniform[Any], tColor: IUniform[Any], tDiffuse: IUniform[Any]): TColor = {
    val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any], tColor = tColor.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[TColor]
  }
  
  extension [Self <: TColor](x: Self) {
    
    inline def setResolution(value: IUniform[Any]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTColor(value: IUniform[Any]): Self = StObject.set(x, "tColor", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}

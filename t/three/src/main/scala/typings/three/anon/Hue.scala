package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hue extends StObject {
  
  var hue: IUniform[Any]
  
  var saturation: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object Hue {
  
  inline def apply(hue: IUniform[Any], saturation: IUniform[Any], tDiffuse: IUniform[Any]): Hue = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hue]
  }
  
  extension [Self <: Hue](x: Self) {
    
    inline def setHue(value: IUniform[Any]): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setSaturation(value: IUniform[Any]): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}

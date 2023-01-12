package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BgColor extends StObject {
  
  var bgColor: IUniform[Any]
  
  var fAspect: IUniform[Any]
  
  var sunColor: IUniform[Any]
  
  var vSunPositionScreenSpace: IUniform[Any]
}
object BgColor {
  
  inline def apply(
    bgColor: IUniform[Any],
    fAspect: IUniform[Any],
    sunColor: IUniform[Any],
    vSunPositionScreenSpace: IUniform[Any]
  ): BgColor = {
    val __obj = js.Dynamic.literal(bgColor = bgColor.asInstanceOf[js.Any], fAspect = fAspect.asInstanceOf[js.Any], sunColor = sunColor.asInstanceOf[js.Any], vSunPositionScreenSpace = vSunPositionScreenSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BgColor] (val x: Self) extends AnyVal {
    
    inline def setBgColor(value: IUniform[Any]): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setFAspect(value: IUniform[Any]): Self = StObject.set(x, "fAspect", value.asInstanceOf[js.Any])
    
    inline def setSunColor(value: IUniform[Any]): Self = StObject.set(x, "sunColor", value.asInstanceOf[js.Any])
    
    inline def setVSunPositionScreenSpace(value: IUniform[Any]): Self = StObject.set(x, "vSunPositionScreenSpace", value.asInstanceOf[js.Any])
  }
}

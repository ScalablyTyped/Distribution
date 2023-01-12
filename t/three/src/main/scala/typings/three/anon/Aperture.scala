package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aperture extends StObject {
  
  var aperture: IUniform[Any]
  
  var aspect: IUniform[Any]
  
  var farClip: IUniform[Any]
  
  var focus: IUniform[Any]
  
  var maxblur: IUniform[Any]
  
  var nearClip: IUniform[Any]
  
  var tColor: IUniform[Any]
  
  var tDepth: IUniform[Any]
}
object Aperture {
  
  inline def apply(
    aperture: IUniform[Any],
    aspect: IUniform[Any],
    farClip: IUniform[Any],
    focus: IUniform[Any],
    maxblur: IUniform[Any],
    nearClip: IUniform[Any],
    tColor: IUniform[Any],
    tDepth: IUniform[Any]
  ): Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], aspect = aspect.asInstanceOf[js.Any], farClip = farClip.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], maxblur = maxblur.asInstanceOf[js.Any], nearClip = nearClip.asInstanceOf[js.Any], tColor = tColor.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aperture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aperture] (val x: Self) extends AnyVal {
    
    inline def setAperture(value: IUniform[Any]): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
    
    inline def setAspect(value: IUniform[Any]): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setFarClip(value: IUniform[Any]): Self = StObject.set(x, "farClip", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: IUniform[Any]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setMaxblur(value: IUniform[Any]): Self = StObject.set(x, "maxblur", value.asInstanceOf[js.Any])
    
    inline def setNearClip(value: IUniform[Any]): Self = StObject.set(x, "nearClip", value.asInstanceOf[js.Any])
    
    inline def setTColor(value: IUniform[Any]): Self = StObject.set(x, "tColor", value.asInstanceOf[js.Any])
    
    inline def setTDepth(value: IUniform[Any]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
  }
}

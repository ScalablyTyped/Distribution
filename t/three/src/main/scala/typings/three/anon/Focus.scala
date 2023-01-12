package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  var focus: IUniform[Any]
  
  var maxblur: IUniform[Any]
  
  var tColor: IUniform[Any]
  
  var tDepth: IUniform[Any]
}
object Focus {
  
  inline def apply(focus: IUniform[Any], maxblur: IUniform[Any], tColor: IUniform[Any], tDepth: IUniform[Any]): Focus = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], maxblur = maxblur.asInstanceOf[js.Any], tColor = tColor.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
    
    inline def setFocus(value: IUniform[Any]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setMaxblur(value: IUniform[Any]): Self = StObject.set(x, "maxblur", value.asInstanceOf[js.Any])
    
    inline def setTColor(value: IUniform[Any]): Self = StObject.set(x, "tColor", value.asInstanceOf[js.Any])
    
    inline def setTDepth(value: IUniform[Any]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
  }
}

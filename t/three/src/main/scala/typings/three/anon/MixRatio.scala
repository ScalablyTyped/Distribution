package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixRatio extends StObject {
  
  var mixRatio: IUniform[Any]
  
  var opacity: IUniform[Any]
  
  var tDiffuse1: IUniform[Any]
  
  var tDiffuse2: IUniform[Any]
}
object MixRatio {
  
  inline def apply(
    mixRatio: IUniform[Any],
    opacity: IUniform[Any],
    tDiffuse1: IUniform[Any],
    tDiffuse2: IUniform[Any]
  ): MixRatio = {
    val __obj = js.Dynamic.literal(mixRatio = mixRatio.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tDiffuse1 = tDiffuse1.asInstanceOf[js.Any], tDiffuse2 = tDiffuse2.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixRatio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixRatio] (val x: Self) extends AnyVal {
    
    inline def setMixRatio(value: IUniform[Any]): Self = StObject.set(x, "mixRatio", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: IUniform[Any]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse1(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse1", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse2(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse2", value.asInstanceOf[js.Any])
  }
}

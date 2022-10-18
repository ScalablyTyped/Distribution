package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opacity extends StObject {
  
  var opacity: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object Opacity {
  
  inline def apply(opacity: IUniform[Any], tDiffuse: IUniform[Any]): Opacity = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  
  extension [Self <: Opacity](x: Self) {
    
    inline def setOpacity(value: IUniform[Any]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}

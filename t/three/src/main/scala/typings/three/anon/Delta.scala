package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var delta: IUniform[Any]
  
  var texture: IUniform[Any]
}
object Delta {
  
  inline def apply(delta: IUniform[Any], texture: IUniform[Any]): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  extension [Self <: Delta](x: Self) {
    
    inline def setDelta(value: IUniform[Any]): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: IUniform[Any]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}

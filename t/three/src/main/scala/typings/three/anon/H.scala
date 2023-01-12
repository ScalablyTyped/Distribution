package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H extends StObject {
  
  var h: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object H {
  
  inline def apply(h: IUniform[Any], tDiffuse: IUniform[Any]): H = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: H] (val x: Self) extends AnyVal {
    
    inline def setH(value: IUniform[Any]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}

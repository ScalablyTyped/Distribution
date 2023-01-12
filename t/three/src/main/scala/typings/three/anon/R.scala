package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  var h: IUniform[Any]
  
  var r: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object R {
  
  inline def apply(h: IUniform[Any], r: IUniform[Any], tDiffuse: IUniform[Any]): R = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    inline def setH(value: IUniform[Any]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setR(value: IUniform[Any]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}

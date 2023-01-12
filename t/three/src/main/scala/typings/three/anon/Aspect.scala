package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aspect extends StObject {
  
  var aspect: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object Aspect {
  
  inline def apply(aspect: IUniform[Any], tDiffuse: IUniform[Any]): Aspect = {
    val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aspect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aspect] (val x: Self) extends AnyVal {
    
    inline def setAspect(value: IUniform[Any]): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}

package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Darkness extends StObject {
  
  var darkness: IUniform[Any]
  
  var offset: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object Darkness {
  
  inline def apply(darkness: IUniform[Any], offset: IUniform[Any], tDiffuse: IUniform[Any]): Darkness = {
    val __obj = js.Dynamic.literal(darkness = darkness.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Darkness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Darkness] (val x: Self) extends AnyVal {
    
    inline def setDarkness(value: IUniform[Any]): Self = StObject.set(x, "darkness", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: IUniform[Any]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}

package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecularMap extends StObject {
  
  var specularMap: IUniform[Any]
}
object SpecularMap {
  
  inline def apply(specularMap: IUniform[Any]): SpecularMap = {
    val __obj = js.Dynamic.literal(specularMap = specularMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecularMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecularMap] (val x: Self) extends AnyVal {
    
    inline def setSpecularMap(value: IUniform[Any]): Self = StObject.set(x, "specularMap", value.asInstanceOf[js.Any])
  }
}

package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmissiveMap extends StObject {
  
  var emissiveMap: IUniform[Any]
}
object EmissiveMap {
  
  inline def apply(emissiveMap: IUniform[Any]): EmissiveMap = {
    val __obj = js.Dynamic.literal(emissiveMap = emissiveMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmissiveMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmissiveMap] (val x: Self) extends AnyVal {
    
    inline def setEmissiveMap(value: IUniform[Any]): Self = StObject.set(x, "emissiveMap", value.asInstanceOf[js.Any])
  }
}

package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmissiveMap extends StObject {
  
  var emissiveMap: IUniform[Any]
  
  var emissiveMapTransform: IUniform[Matrix3]
}
object EmissiveMap {
  
  inline def apply(emissiveMap: IUniform[Any], emissiveMapTransform: IUniform[Matrix3]): EmissiveMap = {
    val __obj = js.Dynamic.literal(emissiveMap = emissiveMap.asInstanceOf[js.Any], emissiveMapTransform = emissiveMapTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmissiveMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmissiveMap] (val x: Self) extends AnyVal {
    
    inline def setEmissiveMap(value: IUniform[Any]): Self = StObject.set(x, "emissiveMap", value.asInstanceOf[js.Any])
    
    inline def setEmissiveMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "emissiveMapTransform", value.asInstanceOf[js.Any])
  }
}

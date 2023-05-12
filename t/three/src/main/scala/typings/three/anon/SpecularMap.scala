package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecularMap extends StObject {
  
  var specularMap: IUniform[Any]
  
  var specularMapTransform: IUniform[Matrix3]
}
object SpecularMap {
  
  inline def apply(specularMap: IUniform[Any], specularMapTransform: IUniform[Matrix3]): SpecularMap = {
    val __obj = js.Dynamic.literal(specularMap = specularMap.asInstanceOf[js.Any], specularMapTransform = specularMapTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecularMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecularMap] (val x: Self) extends AnyVal {
    
    inline def setSpecularMap(value: IUniform[Any]): Self = StObject.set(x, "specularMap", value.asInstanceOf[js.Any])
    
    inline def setSpecularMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "specularMapTransform", value.asInstanceOf[js.Any])
  }
}

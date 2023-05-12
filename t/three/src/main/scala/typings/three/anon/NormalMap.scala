package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalMap extends StObject {
  
  var normalMap: IUniform[Any]
  
  var normalMapTransform: IUniform[Matrix3]
  
  var normalScale: IUniform[Vector2]
}
object NormalMap {
  
  inline def apply(normalMap: IUniform[Any], normalMapTransform: IUniform[Matrix3], normalScale: IUniform[Vector2]): NormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap.asInstanceOf[js.Any], normalMapTransform = normalMapTransform.asInstanceOf[js.Any], normalScale = normalScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalMap] (val x: Self) extends AnyVal {
    
    inline def setNormalMap(value: IUniform[Any]): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    inline def setNormalMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "normalMapTransform", value.asInstanceOf[js.Any])
    
    inline def setNormalScale(value: IUniform[Vector2]): Self = StObject.set(x, "normalScale", value.asInstanceOf[js.Any])
  }
}

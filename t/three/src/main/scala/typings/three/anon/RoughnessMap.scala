package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoughnessMap extends StObject {
  
  var roughnessMap: IUniform[Any]
  
  var roughnessMapTransform: IUniform[Matrix3]
}
object RoughnessMap {
  
  inline def apply(roughnessMap: IUniform[Any], roughnessMapTransform: IUniform[Matrix3]): RoughnessMap = {
    val __obj = js.Dynamic.literal(roughnessMap = roughnessMap.asInstanceOf[js.Any], roughnessMapTransform = roughnessMapTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoughnessMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoughnessMap] (val x: Self) extends AnyVal {
    
    inline def setRoughnessMap(value: IUniform[Any]): Self = StObject.set(x, "roughnessMap", value.asInstanceOf[js.Any])
    
    inline def setRoughnessMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "roughnessMapTransform", value.asInstanceOf[js.Any])
  }
}

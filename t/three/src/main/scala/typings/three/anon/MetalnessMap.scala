package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetalnessMap extends StObject {
  
  var metalnessMap: IUniform[Any]
  
  var metalnessMapTransform: IUniform[Matrix3]
}
object MetalnessMap {
  
  inline def apply(metalnessMap: IUniform[Any], metalnessMapTransform: IUniform[Matrix3]): MetalnessMap = {
    val __obj = js.Dynamic.literal(metalnessMap = metalnessMap.asInstanceOf[js.Any], metalnessMapTransform = metalnessMapTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetalnessMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetalnessMap] (val x: Self) extends AnyVal {
    
    inline def setMetalnessMap(value: IUniform[Any]): Self = StObject.set(x, "metalnessMap", value.asInstanceOf[js.Any])
    
    inline def setMetalnessMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "metalnessMapTransform", value.asInstanceOf[js.Any])
  }
}

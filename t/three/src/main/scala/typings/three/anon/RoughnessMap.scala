package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoughnessMap extends StObject {
  
  var roughnessMap: IUniform[Any]
}
object RoughnessMap {
  
  inline def apply(roughnessMap: IUniform[Any]): RoughnessMap = {
    val __obj = js.Dynamic.literal(roughnessMap = roughnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoughnessMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoughnessMap] (val x: Self) extends AnyVal {
    
    inline def setRoughnessMap(value: IUniform[Any]): Self = StObject.set(x, "roughnessMap", value.asInstanceOf[js.Any])
  }
}

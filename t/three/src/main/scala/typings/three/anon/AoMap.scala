package typings.three.anon

import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AoMap extends StObject {
  
  var aoMap: IUniform[Any]
  
  var aoMapIntensity: IUniform[Double]
  
  var aoMapTransform: IUniform[Matrix3]
}
object AoMap {
  
  inline def apply(aoMap: IUniform[Any], aoMapIntensity: IUniform[Double], aoMapTransform: IUniform[Matrix3]): AoMap = {
    val __obj = js.Dynamic.literal(aoMap = aoMap.asInstanceOf[js.Any], aoMapIntensity = aoMapIntensity.asInstanceOf[js.Any], aoMapTransform = aoMapTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AoMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AoMap] (val x: Self) extends AnyVal {
    
    inline def setAoMap(value: IUniform[Any]): Self = StObject.set(x, "aoMap", value.asInstanceOf[js.Any])
    
    inline def setAoMapIntensity(value: IUniform[Double]): Self = StObject.set(x, "aoMapIntensity", value.asInstanceOf[js.Any])
    
    inline def setAoMapTransform(value: IUniform[Matrix3]): Self = StObject.set(x, "aoMapTransform", value.asInstanceOf[js.Any])
  }
}

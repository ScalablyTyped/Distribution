package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientMap extends StObject {
  
  var gradientMap: IUniform[Any]
}
object GradientMap {
  
  inline def apply(gradientMap: IUniform[Any]): GradientMap = {
    val __obj = js.Dynamic.literal(gradientMap = gradientMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientMap]
  }
  
  extension [Self <: GradientMap](x: Self) {
    
    inline def setGradientMap(value: IUniform[Any]): Self = StObject.set(x, "gradientMap", value.asInstanceOf[js.Any])
  }
}

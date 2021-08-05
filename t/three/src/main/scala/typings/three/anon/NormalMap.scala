package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalMap extends StObject {
  
  var normalMap: IUniform
  
  var normalScale: IUniform
}
object NormalMap {
  
  inline def apply(normalMap: IUniform, normalScale: IUniform): NormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap.asInstanceOf[js.Any], normalScale = normalScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalMap]
  }
  
  extension [Self <: NormalMap](x: Self) {
    
    inline def setNormalMap(value: IUniform): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    inline def setNormalScale(value: IUniform): Self = StObject.set(x, "normalScale", value.asInstanceOf[js.Any])
  }
}

package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecularMap extends StObject {
  
  var specularMap: IUniform
}
object SpecularMap {
  
  inline def apply(specularMap: IUniform): SpecularMap = {
    val __obj = js.Dynamic.literal(specularMap = specularMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecularMap]
  }
  
  extension [Self <: SpecularMap](x: Self) {
    
    inline def setSpecularMap(value: IUniform): Self = StObject.set(x, "specularMap", value.asInstanceOf[js.Any])
  }
}

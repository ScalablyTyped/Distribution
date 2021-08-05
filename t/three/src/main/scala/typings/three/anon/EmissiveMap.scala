package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmissiveMap extends StObject {
  
  var emissiveMap: IUniform
}
object EmissiveMap {
  
  inline def apply(emissiveMap: IUniform): EmissiveMap = {
    val __obj = js.Dynamic.literal(emissiveMap = emissiveMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmissiveMap]
  }
  
  extension [Self <: EmissiveMap](x: Self) {
    
    inline def setEmissiveMap(value: IUniform): Self = StObject.set(x, "emissiveMap", value.asInstanceOf[js.Any])
  }
}

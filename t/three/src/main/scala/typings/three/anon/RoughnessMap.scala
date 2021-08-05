package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoughnessMap extends StObject {
  
  var roughnessMap: IUniform
}
object RoughnessMap {
  
  inline def apply(roughnessMap: IUniform): RoughnessMap = {
    val __obj = js.Dynamic.literal(roughnessMap = roughnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoughnessMap]
  }
  
  extension [Self <: RoughnessMap](x: Self) {
    
    inline def setRoughnessMap(value: IUniform): Self = StObject.set(x, "roughnessMap", value.asInstanceOf[js.Any])
  }
}

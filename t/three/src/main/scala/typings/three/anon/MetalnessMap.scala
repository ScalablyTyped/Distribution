package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetalnessMap extends StObject {
  
  var metalnessMap: IUniform
}
object MetalnessMap {
  
  inline def apply(metalnessMap: IUniform): MetalnessMap = {
    val __obj = js.Dynamic.literal(metalnessMap = metalnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetalnessMap]
  }
  
  extension [Self <: MetalnessMap](x: Self) {
    
    inline def setMetalnessMap(value: IUniform): Self = StObject.set(x, "metalnessMap", value.asInstanceOf[js.Any])
  }
}

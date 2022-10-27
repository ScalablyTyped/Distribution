package typings.vite.mod.Terser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinifyOutput extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var decoded_map: js.UndefOr[js.Object | Null] = js.undefined
  
  var map: js.UndefOr[js.Object | String] = js.undefined
}
object MinifyOutput {
  
  inline def apply(): MinifyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOutput]
  }
  
  extension [Self <: MinifyOutput](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDecoded_map(value: js.Object): Self = StObject.set(x, "decoded_map", value.asInstanceOf[js.Any])
    
    inline def setDecoded_mapNull: Self = StObject.set(x, "decoded_map", null)
    
    inline def setDecoded_mapUndefined: Self = StObject.set(x, "decoded_map", js.undefined)
    
    inline def setMap(value: js.Object | String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}

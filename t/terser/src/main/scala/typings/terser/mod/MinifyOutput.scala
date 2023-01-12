package typings.terser.mod

import typings.jridgewellGenMapping.distTypesTypesMod.DecodedSourceMap
import typings.jridgewellGenMapping.distTypesTypesMod.EncodedSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinifyOutput extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var decoded_map: js.UndefOr[DecodedSourceMap | Null] = js.undefined
  
  var map: js.UndefOr[EncodedSourceMap | String] = js.undefined
}
object MinifyOutput {
  
  inline def apply(): MinifyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinifyOutput] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDecoded_map(value: DecodedSourceMap): Self = StObject.set(x, "decoded_map", value.asInstanceOf[js.Any])
    
    inline def setDecoded_mapNull: Self = StObject.set(x, "decoded_map", null)
    
    inline def setDecoded_mapUndefined: Self = StObject.set(x, "decoded_map", js.undefined)
    
    inline def setMap(value: EncodedSourceMap | String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}

package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAny extends StObject {
  
  /** Any typeUrl */
  var typeUrl: js.UndefOr[String | Null] = js.undefined
  
  /** Any value */
  var value: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IAny {
  
  inline def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  
  extension [Self <: IAny](x: Self) {
    
    inline def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlNull: Self = StObject.set(x, "typeUrl", null)
    
    inline def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

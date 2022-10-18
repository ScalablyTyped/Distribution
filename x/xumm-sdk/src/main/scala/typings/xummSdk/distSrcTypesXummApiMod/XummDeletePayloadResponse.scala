package typings.xummSdk.distSrcTypesXummApiMod

import typings.xummSdk.anon.Cancelled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummDeletePayloadResponse extends StObject {
  
  var custom_meta: XummCustomMeta
  
  var meta: XummPayloadMeta
  
  var result: Cancelled
}
object XummDeletePayloadResponse {
  
  inline def apply(custom_meta: XummCustomMeta, meta: XummPayloadMeta, result: Cancelled): XummDeletePayloadResponse = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummDeletePayloadResponse]
  }
  
  extension [Self <: XummDeletePayloadResponse](x: Self) {
    
    inline def setCustom_meta(value: XummCustomMeta): Self = StObject.set(x, "custom_meta", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: XummPayloadMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Cancelled): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}

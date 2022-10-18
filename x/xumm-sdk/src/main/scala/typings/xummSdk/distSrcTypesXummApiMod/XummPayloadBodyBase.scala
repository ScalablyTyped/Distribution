package typings.xummSdk.distSrcTypesXummApiMod

import typings.xummSdk.anon.Expire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummPayloadBodyBase extends StObject {
  
  var custom_meta: js.UndefOr[XummCustomMeta] = js.undefined
  
  var options: js.UndefOr[Expire] = js.undefined
  
  var user_token: js.UndefOr[String] = js.undefined
}
object XummPayloadBodyBase {
  
  inline def apply(): XummPayloadBodyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XummPayloadBodyBase]
  }
  
  extension [Self <: XummPayloadBodyBase](x: Self) {
    
    inline def setCustom_meta(value: XummCustomMeta): Self = StObject.set(x, "custom_meta", value.asInstanceOf[js.Any])
    
    inline def setCustom_metaUndefined: Self = StObject.set(x, "custom_meta", js.undefined)
    
    inline def setOptions(value: Expire): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
    
    inline def setUser_tokenUndefined: Self = StObject.set(x, "user_token", js.undefined)
  }
}

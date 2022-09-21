package typings.xummSdk.xummApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.xummSdk.xummApiMod.XummPostPayloadBodyJson
  - typings.xummSdk.xummApiMod.XummPostPayloadBodyBlob
*/
trait CreatePayload extends StObject
object CreatePayload {
  
  inline def XummPostPayloadBodyBlob(txblob: String): typings.xummSdk.xummApiMod.XummPostPayloadBodyBlob = {
    val __obj = js.Dynamic.literal(txblob = txblob.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xummSdk.xummApiMod.XummPostPayloadBodyBlob]
  }
  
  inline def XummPostPayloadBodyJson(txjson: XummJsonTransaction): typings.xummSdk.xummApiMod.XummPostPayloadBodyJson = {
    val __obj = js.Dynamic.literal(txjson = txjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xummSdk.xummApiMod.XummPostPayloadBodyJson]
  }
}

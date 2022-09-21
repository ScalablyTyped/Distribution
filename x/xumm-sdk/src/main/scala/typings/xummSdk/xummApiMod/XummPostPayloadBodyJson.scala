package typings.xummSdk.xummApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummPostPayloadBodyJson
  extends StObject
     with XummPayloadBodyBase
     with CreatePayload {
  
  var txjson: XummJsonTransaction
}
object XummPostPayloadBodyJson {
  
  inline def apply(txjson: XummJsonTransaction): XummPostPayloadBodyJson = {
    val __obj = js.Dynamic.literal(txjson = txjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadBodyJson]
  }
  
  extension [Self <: XummPostPayloadBodyJson](x: Self) {
    
    inline def setTxjson(value: XummJsonTransaction): Self = StObject.set(x, "txjson", value.asInstanceOf[js.Any])
  }
}

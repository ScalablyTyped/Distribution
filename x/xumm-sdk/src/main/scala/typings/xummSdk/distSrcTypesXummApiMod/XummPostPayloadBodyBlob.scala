package typings.xummSdk.distSrcTypesXummApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummPostPayloadBodyBlob
  extends StObject
     with XummPayloadBodyBase
     with CreatePayload {
  
  var txblob: String
}
object XummPostPayloadBodyBlob {
  
  inline def apply(txblob: String): XummPostPayloadBodyBlob = {
    val __obj = js.Dynamic.literal(txblob = txblob.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadBodyBlob]
  }
  
  extension [Self <: XummPostPayloadBodyBlob](x: Self) {
    
    inline def setTxblob(value: String): Self = StObject.set(x, "txblob", value.asInstanceOf[js.Any])
  }
}

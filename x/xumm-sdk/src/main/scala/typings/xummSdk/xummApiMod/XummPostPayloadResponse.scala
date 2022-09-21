package typings.xummSdk.xummApiMod

import typings.xummSdk.anon.Always
import typings.xummSdk.anon.Qrmatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummPostPayloadResponse extends StObject {
  
  var next: Always
  
  var pushed: Boolean
  
  var refs: Qrmatrix
  
  var uuid: String
}
object XummPostPayloadResponse {
  
  inline def apply(next: Always, pushed: Boolean, refs: Qrmatrix, uuid: String): XummPostPayloadResponse = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadResponse]
  }
  
  extension [Self <: XummPostPayloadResponse](x: Self) {
    
    inline def setNext(value: Always): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
    
    inline def setRefs(value: Qrmatrix): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}

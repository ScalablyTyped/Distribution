package typings.trezorConnect.libTypescriptTrezorProtobufMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirmwareUpload extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var payload: Buffer
}
object FirmwareUpload {
  
  inline def apply(payload: Buffer): FirmwareUpload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirmwareUpload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirmwareUpload] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}

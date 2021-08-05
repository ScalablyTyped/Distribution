package typings.webappsecCredentialManagement

import typings.std.BufferSource
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.ble
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.internal
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.nfc
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.usb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialdescriptor}
  */
trait PublicKeyCredentialDescriptor extends StObject {
  
  var id: BufferSource
  
  var transports: js.UndefOr[js.Array[usb | nfc | ble | internal]] = js.undefined
  
  var `type`: `public-key`
}
object PublicKeyCredentialDescriptor {
  
  inline def apply(id: BufferSource): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public-key")
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
  
  extension [Self <: PublicKeyCredentialDescriptor](x: Self) {
    
    inline def setId(value: BufferSource): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTransports(value: js.Array[usb | nfc | ble | internal]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    inline def setTransportsVarargs(value: (usb | nfc | ble | internal)*): Self = StObject.set(x, "transports", js.Array(value :_*))
    
    inline def setType(value: `public-key`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

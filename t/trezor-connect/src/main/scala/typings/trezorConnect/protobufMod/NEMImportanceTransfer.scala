package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMImportanceTransfer extends StObject {
  
  var mode: NEMImportanceTransferMode
  
  var public_key: String
}
object NEMImportanceTransfer {
  
  inline def apply(mode: NEMImportanceTransferMode, public_key: String): NEMImportanceTransfer = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMImportanceTransfer]
  }
  
  extension [Self <: NEMImportanceTransfer](x: Self) {
    
    inline def setMode(value: NEMImportanceTransferMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
  }
}

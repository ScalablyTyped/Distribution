package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.trezorConnectStrings.address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonRequestData extends StObject {
  
  var address: String
  
  var serializedPath: String
  
  var `type`: address
}
object ButtonRequestData {
  
  inline def apply(address: String, serializedPath: String): ButtonRequestData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("address")
    __obj.asInstanceOf[ButtonRequestData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonRequestData] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    
    inline def setType(value: address): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

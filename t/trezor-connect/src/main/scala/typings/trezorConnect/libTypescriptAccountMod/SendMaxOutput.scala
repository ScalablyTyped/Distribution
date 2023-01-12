package typings.trezorConnect.libTypescriptAccountMod

import typings.trezorConnect.trezorConnectStrings.`send-max`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMaxOutput
  extends StObject
     with ComposeOutput {
  
  var address: String
  
  var `type`: `send-max`
}
object SendMaxOutput {
  
  inline def apply(address: String): SendMaxOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("send-max")
    __obj.asInstanceOf[SendMaxOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMaxOutput] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setType(value: `send-max`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

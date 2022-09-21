package typings.trezorConnect.accountMod

import typings.trezorConnect.trezorConnectStrings.`send-max-noaddress`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoAddressSendMaxOutput
  extends StObject
     with ComposeOutput {
  
  var `type`: `send-max-noaddress`
}
object NoAddressSendMaxOutput {
  
  inline def apply(): NoAddressSendMaxOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("send-max-noaddress")
    __obj.asInstanceOf[NoAddressSendMaxOutput]
  }
  
  extension [Self <: NoAddressSendMaxOutput](x: Self) {
    
    inline def setType(value: `send-max-noaddress`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

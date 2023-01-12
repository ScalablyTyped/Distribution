package typings.trezorConnect.libTypescriptAccountMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoAddressSendMaxOutput] (val x: Self) extends AnyVal {
    
    inline def setType(value: `send-max-noaddress`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

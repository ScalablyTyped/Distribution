package typings.trezorConnect.libTypescriptAccountMod

import typings.trezorConnect.trezorConnectStrings.noaddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoAddressOutput
  extends StObject
     with ComposeOutput {
  
  var amount: String
  
  var `type`: noaddress
}
object NoAddressOutput {
  
  inline def apply(amount: String): NoAddressOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("noaddress")
    __obj.asInstanceOf[NoAddressOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoAddressOutput] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setType(value: noaddress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

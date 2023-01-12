package typings.trezorConnect.libTypescriptAccountMod

import typings.trezorConnect.trezorConnectStrings.PAYTOADDRESS
import typings.trezorConnect.trezorConnectStrings.external_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegularOutput
  extends StObject
     with ComposeOutput {
  
  var address: String
  
  var amount: String
  
  var script_type: js.UndefOr[PAYTOADDRESS] = js.undefined
  
  var `type`: js.UndefOr[external_] = js.undefined
}
object RegularOutput {
  
  inline def apply(address: String, amount: String): RegularOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegularOutput] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setScript_type(value: PAYTOADDRESS): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    inline def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
    
    inline def setType(value: external_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

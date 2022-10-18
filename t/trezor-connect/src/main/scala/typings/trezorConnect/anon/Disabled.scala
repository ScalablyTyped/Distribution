package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptAccountMod.SelectFeeLevel
import typings.trezorConnect.trezorConnectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled
  extends StObject
     with SelectFeeLevel {
  
  var disabled: `true`
  
  var fee: typings.trezorConnect.trezorConnectStrings.`0`
  
  var name: String
}
object Disabled {
  
  inline def apply(name: String): Disabled = {
    val __obj = js.Dynamic.literal(disabled = true, fee = "0", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setDisabled(value: `true`): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setFee(value: typings.trezorConnect.trezorConnectStrings.`0`): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

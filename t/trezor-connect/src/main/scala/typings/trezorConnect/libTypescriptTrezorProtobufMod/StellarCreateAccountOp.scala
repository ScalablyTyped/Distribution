package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarCreateAccountOp extends StObject {
  
  var new_account: String
  
  var source_account: js.UndefOr[String] = js.undefined
  
  var starting_balance: UintType
}
object StellarCreateAccountOp {
  
  inline def apply(new_account: String, starting_balance: UintType): StellarCreateAccountOp = {
    val __obj = js.Dynamic.literal(new_account = new_account.asInstanceOf[js.Any], starting_balance = starting_balance.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarCreateAccountOp]
  }
  
  extension [Self <: StellarCreateAccountOp](x: Self) {
    
    inline def setNew_account(value: String): Self = StObject.set(x, "new_account", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
    
    inline def setStarting_balance(value: UintType): Self = StObject.set(x, "starting_balance", value.asInstanceOf[js.Any])
  }
}

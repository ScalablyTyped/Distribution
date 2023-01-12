package typings.trezorConnect.libTypescriptNetworksStellarMod

import typings.trezorConnect.trezorConnectStrings.createAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarCreateAccountOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "source_account"
  var destination: String
  
  // Proto: "StellarCreateAccountOp"
  var source: js.UndefOr[String] = js.undefined
  
  // Proto: "new_account",
  var startingBalance: String
  
  var `type`: createAccount
}
object StellarCreateAccountOperation {
  
  inline def apply(destination: String, startingBalance: String): StellarCreateAccountOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("createAccount")
    __obj.asInstanceOf[StellarCreateAccountOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StellarCreateAccountOperation] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStartingBalance(value: String): Self = StObject.set(x, "startingBalance", value.asInstanceOf[js.Any])
    
    inline def setType(value: createAccount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.masterpass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterpassWallet
  extends StObject
     with CardWallet {
  
  var masterpass: WalletData
  
  var `type`: masterpass
}
object MasterpassWallet {
  
  inline def apply(masterpass: WalletData): MasterpassWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("masterpass")
    __obj.asInstanceOf[MasterpassWallet]
  }
  
  extension [Self <: MasterpassWallet](x: Self) {
    
    inline def setMasterpass(value: WalletData): Self = StObject.set(x, "masterpass", value.asInstanceOf[js.Any])
    
    inline def setType(value: masterpass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

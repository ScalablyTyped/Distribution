package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.masterpass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterpassWallet extends CardWallet {
  
  var masterpass: WalletData = js.native
  
  var `type`: masterpass = js.native
}
object MasterpassWallet {
  
  @scala.inline
  def apply(masterpass: WalletData, `type`: masterpass): MasterpassWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterpassWallet]
  }
  
  @scala.inline
  implicit class MasterpassWalletMutableBuilder[Self <: MasterpassWallet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterpass(value: WalletData): Self = StObject.set(x, "masterpass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: masterpass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

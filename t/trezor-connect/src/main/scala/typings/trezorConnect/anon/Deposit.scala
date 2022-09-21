package typings.trezorConnect.anon

import typings.trezorConnect.trezorConnectStrings.stake_delegation
import typings.trezorConnect.trezorConnectStrings.stake_deregistration
import typings.trezorConnect.trezorConnectStrings.stake_registration
import typings.trezorConnect.trezorConnectStrings.withdrawal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deposit extends StObject {
  
  var deposit: js.UndefOr[String] = js.undefined
  
  var subtype: withdrawal | stake_delegation | stake_registration | stake_deregistration | Null
  
  var withdrawal: js.UndefOr[String] = js.undefined
}
object Deposit {
  
  inline def apply(): Deposit = {
    val __obj = js.Dynamic.literal(subtype = null)
    __obj.asInstanceOf[Deposit]
  }
  
  extension [Self <: Deposit](x: Self) {
    
    inline def setDeposit(value: String): Self = StObject.set(x, "deposit", value.asInstanceOf[js.Any])
    
    inline def setDepositUndefined: Self = StObject.set(x, "deposit", js.undefined)
    
    inline def setSubtype(value: withdrawal | stake_delegation | stake_registration | stake_deregistration): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeNull: Self = StObject.set(x, "subtype", null)
    
    inline def setWithdrawal(value: String): Self = StObject.set(x, "withdrawal", value.asInstanceOf[js.Any])
    
    inline def setWithdrawalUndefined: Self = StObject.set(x, "withdrawal", js.undefined)
  }
}

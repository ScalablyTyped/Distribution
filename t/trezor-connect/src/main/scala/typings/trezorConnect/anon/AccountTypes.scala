package typings.trezorConnect.anon

import typings.trezorConnect.accountMod.DiscoveryAccount
import typings.trezorConnect.accountMod.DiscoveryAccountType
import typings.trezorConnect.trezorConnectStrings.end
import typings.trezorConnect.trezorConnectStrings.progress
import typings.trezorConnect.trezorConnectStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountTypes extends StObject {
  
  var accountTypes: js.UndefOr[js.Array[DiscoveryAccountType]] = js.undefined
  
  var accounts: js.UndefOr[js.Array[DiscoveryAccount]] = js.undefined
  
  var coinInfo: typings.trezorConnect.coinInfoMod.CoinInfo
  
  var defaultAccountType: js.UndefOr[DiscoveryAccountType] = js.undefined
  
  var preventEmpty: js.UndefOr[Boolean] = js.undefined
  
  var `type`: start | progress | end
}
object AccountTypes {
  
  inline def apply(coinInfo: typings.trezorConnect.coinInfoMod.CoinInfo, `type`: start | progress | end): AccountTypes = {
    val __obj = js.Dynamic.literal(coinInfo = coinInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTypes]
  }
  
  extension [Self <: AccountTypes](x: Self) {
    
    inline def setAccountTypes(value: js.Array[DiscoveryAccountType]): Self = StObject.set(x, "accountTypes", value.asInstanceOf[js.Any])
    
    inline def setAccountTypesUndefined: Self = StObject.set(x, "accountTypes", js.undefined)
    
    inline def setAccountTypesVarargs(value: DiscoveryAccountType*): Self = StObject.set(x, "accountTypes", js.Array(value*))
    
    inline def setAccounts(value: js.Array[DiscoveryAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: DiscoveryAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setCoinInfo(value: typings.trezorConnect.coinInfoMod.CoinInfo): Self = StObject.set(x, "coinInfo", value.asInstanceOf[js.Any])
    
    inline def setDefaultAccountType(value: DiscoveryAccountType): Self = StObject.set(x, "defaultAccountType", value.asInstanceOf[js.Any])
    
    inline def setDefaultAccountTypeUndefined: Self = StObject.set(x, "defaultAccountType", js.undefined)
    
    inline def setPreventEmpty(value: Boolean): Self = StObject.set(x, "preventEmpty", value.asInstanceOf[js.Any])
    
    inline def setPreventEmptyUndefined: Self = StObject.set(x, "preventEmpty", js.undefined)
    
    inline def setType(value: start | progress | end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

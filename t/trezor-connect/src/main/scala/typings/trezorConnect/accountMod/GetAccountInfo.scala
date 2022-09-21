package typings.trezorConnect.accountMod

import typings.trezorConnect.anon.Ledger
import typings.trezorConnect.protobufMod.CardanoDerivationType
import typings.trezorConnect.trezorConnectStrings.basic
import typings.trezorConnect.trezorConnectStrings.derived
import typings.trezorConnect.trezorConnectStrings.nonzero
import typings.trezorConnect.trezorConnectStrings.tokenBalances
import typings.trezorConnect.trezorConnectStrings.tokens
import typings.trezorConnect.trezorConnectStrings.txids
import typings.trezorConnect.trezorConnectStrings.txs
import typings.trezorConnect.trezorConnectStrings.used
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountInfo extends StObject {
  
  var coin: String
  
  var contractFilter: js.UndefOr[String] = js.undefined
  
  var defaultAccountType: js.UndefOr[DiscoveryAccountType] = js.undefined
  
  var derivationType: js.UndefOr[CardanoDerivationType] = js.undefined
  
  var descriptor: js.UndefOr[String] = js.undefined
  
  var details: js.UndefOr[basic | tokens | tokenBalances | txids | txs] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var marker: js.UndefOr[Ledger] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[Double] = js.undefined
  
  var tokens: js.UndefOr[nonzero | used | derived] = js.undefined
}
object GetAccountInfo {
  
  inline def apply(coin: String): GetAccountInfo = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountInfo]
  }
  
  extension [Self <: GetAccountInfo](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setContractFilter(value: String): Self = StObject.set(x, "contractFilter", value.asInstanceOf[js.Any])
    
    inline def setContractFilterUndefined: Self = StObject.set(x, "contractFilter", js.undefined)
    
    inline def setDefaultAccountType(value: DiscoveryAccountType): Self = StObject.set(x, "defaultAccountType", value.asInstanceOf[js.Any])
    
    inline def setDefaultAccountTypeUndefined: Self = StObject.set(x, "defaultAccountType", js.undefined)
    
    inline def setDerivationType(value: CardanoDerivationType): Self = StObject.set(x, "derivationType", value.asInstanceOf[js.Any])
    
    inline def setDerivationTypeUndefined: Self = StObject.set(x, "derivationType", js.undefined)
    
    inline def setDescriptor(value: String): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    inline def setDetails(value: basic | tokens | tokenBalances | txids | txs): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setMarker(value: Ledger): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setTokens(value: nonzero | used | derived): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
  }
}

package typings.trezorConnect.libTypescriptAccountMod

import typings.trezorConnect.anon.Erc20Contract
import typings.trezorConnect.anon.Index
import typings.trezorConnect.anon.Ledger
import typings.trezorConnect.anon.Tokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInfo extends StObject {
  
  // ethereum tokens
  var addresses: js.UndefOr[AccountAddresses] = js.undefined
  
  var availableBalance: String
  
  // bitcoin-like descriptor in legacy format (xpub) used by labeling (metadata)
  var balance: String
  
  var descriptor: String
  
  var empty: Boolean
  
  // bitcoin utxo
  var history: Tokens
  
  // address or xpub
  var legacyXpub: js.UndefOr[String] = js.undefined
  
  var marker: js.UndefOr[Ledger] = js.undefined
  
  var misc: js.UndefOr[Erc20Contract] = js.undefined
  
  var page: js.UndefOr[Index] = js.undefined
  
  var path: String
  
  var tokens: js.UndefOr[js.Array[TokenInfo]] = js.undefined
  
  // bitcoin addresses
  var utxo: js.UndefOr[js.Array[AccountUtxo]] = js.undefined
}
object AccountInfo {
  
  inline def apply(
    availableBalance: String,
    balance: String,
    descriptor: String,
    empty: Boolean,
    history: Tokens,
    path: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(availableBalance = availableBalance.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: AccountAddresses): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAvailableBalance(value: String): Self = StObject.set(x, "availableBalance", value.asInstanceOf[js.Any])
    
    inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setDescriptor(value: String): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: Tokens): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setLegacyXpub(value: String): Self = StObject.set(x, "legacyXpub", value.asInstanceOf[js.Any])
    
    inline def setLegacyXpubUndefined: Self = StObject.set(x, "legacyXpub", js.undefined)
    
    inline def setMarker(value: Ledger): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMisc(value: Erc20Contract): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
    
    inline def setMiscUndefined: Self = StObject.set(x, "misc", js.undefined)
    
    inline def setPage(value: Index): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[TokenInfo]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: TokenInfo*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setUtxo(value: js.Array[AccountUtxo]): Self = StObject.set(x, "utxo", value.asInstanceOf[js.Any])
    
    inline def setUtxoUndefined: Self = StObject.set(x, "utxo", js.undefined)
    
    inline def setUtxoVarargs(value: AccountUtxo*): Self = StObject.set(x, "utxo", js.Array(value*))
  }
}

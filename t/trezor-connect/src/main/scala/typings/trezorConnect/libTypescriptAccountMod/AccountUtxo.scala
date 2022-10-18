package typings.trezorConnect.libTypescriptAccountMod

import typings.trezorConnect.anon.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountUtxo extends StObject {
  
  var address: String
  
  var amount: String
  
  var blockHeight: Double
  
  var cardanoSpecific: js.UndefOr[Unit] = js.undefined
  
  var coinbase: js.UndefOr[Boolean] = js.undefined
  
  var confirmations: Double
  
  var path: String
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var txid: String
  
  var vout: Double
}
object AccountUtxo {
  
  inline def apply(
    address: String,
    amount: String,
    blockHeight: Double,
    confirmations: Double,
    path: String,
    txid: String,
    vout: Double
  ): AccountUtxo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], blockHeight = blockHeight.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], txid = txid.asInstanceOf[js.Any], vout = vout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUtxo]
  }
  
  extension [Self <: AccountUtxo](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBlockHeight(value: Double): Self = StObject.set(x, "blockHeight", value.asInstanceOf[js.Any])
    
    inline def setCardanoSpecific(value: Unit): Self = StObject.set(x, "cardanoSpecific", value.asInstanceOf[js.Any])
    
    inline def setCardanoSpecificUndefined: Self = StObject.set(x, "cardanoSpecific", js.undefined)
    
    inline def setCoinbase(value: Boolean): Self = StObject.set(x, "coinbase", value.asInstanceOf[js.Any])
    
    inline def setCoinbaseUndefined: Self = StObject.set(x, "coinbase", js.undefined)
    
    inline def setConfirmations(value: Double): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
    
    inline def setVout(value: Double): Self = StObject.set(x, "vout", value.asInstanceOf[js.Any])
  }
}

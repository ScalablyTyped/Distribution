package typings.trezorConnect.accountMod

import typings.trezorConnect.anon.Data
import typings.trezorConnect.anon.Deposit
import typings.trezorConnect.anon.Size
import typings.trezorConnect.trezorConnectStrings.failed
import typings.trezorConnect.trezorConnectStrings.recv
import typings.trezorConnect.trezorConnectStrings.self
import typings.trezorConnect.trezorConnectStrings.sent
import typings.trezorConnect.trezorConnectStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountTransaction extends StObject {
  
  var amount: String
  
  var blockHash: js.UndefOr[String] = js.undefined
  
  var blockHeight: js.UndefOr[Double] = js.undefined
  
  var blockTime: js.UndefOr[Double] = js.undefined
  
  var cardanoSpecific: js.UndefOr[Deposit] = js.undefined
  
  var details: Size
  
  var ethereumSpecific: js.UndefOr[Data] = js.undefined
  
  var fee: String
  
  var lockTime: js.UndefOr[Double] = js.undefined
  
  var rbf: js.UndefOr[Boolean] = js.undefined
  
  // amount + fee
  var targets: js.Array[TransactionTarget]
  
  var tokens: js.Array[TokenTransfer]
  
  var totalSpent: String
  
  var txid: String
  
  var `type`: sent | recv | self | failed | unknown
}
object AccountTransaction {
  
  inline def apply(
    amount: String,
    details: Size,
    fee: String,
    targets: js.Array[TransactionTarget],
    tokens: js.Array[TokenTransfer],
    totalSpent: String,
    txid: String,
    `type`: sent | recv | self | failed | unknown
  ): AccountTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], totalSpent = totalSpent.asInstanceOf[js.Any], txid = txid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTransaction]
  }
  
  extension [Self <: AccountTransaction](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockHashUndefined: Self = StObject.set(x, "blockHash", js.undefined)
    
    inline def setBlockHeight(value: Double): Self = StObject.set(x, "blockHeight", value.asInstanceOf[js.Any])
    
    inline def setBlockHeightUndefined: Self = StObject.set(x, "blockHeight", js.undefined)
    
    inline def setBlockTime(value: Double): Self = StObject.set(x, "blockTime", value.asInstanceOf[js.Any])
    
    inline def setBlockTimeUndefined: Self = StObject.set(x, "blockTime", js.undefined)
    
    inline def setCardanoSpecific(value: Deposit): Self = StObject.set(x, "cardanoSpecific", value.asInstanceOf[js.Any])
    
    inline def setCardanoSpecificUndefined: Self = StObject.set(x, "cardanoSpecific", js.undefined)
    
    inline def setDetails(value: Size): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setEthereumSpecific(value: Data): Self = StObject.set(x, "ethereumSpecific", value.asInstanceOf[js.Any])
    
    inline def setEthereumSpecificUndefined: Self = StObject.set(x, "ethereumSpecific", js.undefined)
    
    inline def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setLockTime(value: Double): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
    
    inline def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
    
    inline def setRbf(value: Boolean): Self = StObject.set(x, "rbf", value.asInstanceOf[js.Any])
    
    inline def setRbfUndefined: Self = StObject.set(x, "rbf", js.undefined)
    
    inline def setTargets(value: js.Array[TransactionTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: TransactionTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setTokens(value: js.Array[TokenTransfer]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: TokenTransfer*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setTotalSpent(value: String): Self = StObject.set(x, "totalSpent", value.asInstanceOf[js.Any])
    
    inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
    
    inline def setType(value: sent | recv | self | failed | unknown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

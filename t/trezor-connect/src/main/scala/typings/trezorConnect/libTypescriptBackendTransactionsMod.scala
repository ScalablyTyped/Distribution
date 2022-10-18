package typings.trezorConnect

import org.scalablytyped.runtime.StringDictionary
import typings.trezorConnect.anon.AllowPartialPayment
import typings.trezorConnect.anon.Data
import typings.trezorConnect.anon.Decimals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptBackendTransactionsMod {
  
  trait BlockbookTransaction extends StObject {
    
    var blockHash: js.UndefOr[String] = js.undefined
    
    var blockHeight: Double
    
    var blockTime: Double
    
    var confirmations: Double
    
    var ethereumSpecific: js.UndefOr[Data] = js.undefined
    
    var fees: String
    
    var hex: String
    
    var lockTime: js.UndefOr[Double] = js.undefined
    
    var tokenTransfers: js.UndefOr[js.Array[Decimals]] = js.undefined
    
    var txid: String
    
    var value: String
    
    var valueIn: String
    
    var version: js.UndefOr[Double] = js.undefined
    
    var vin: js.Array[VinVout]
    
    var vout: js.Array[VinVout]
  }
  object BlockbookTransaction {
    
    inline def apply(
      blockHeight: Double,
      blockTime: Double,
      confirmations: Double,
      fees: String,
      hex: String,
      txid: String,
      value: String,
      valueIn: String,
      vin: js.Array[VinVout],
      vout: js.Array[VinVout]
    ): BlockbookTransaction = {
      val __obj = js.Dynamic.literal(blockHeight = blockHeight.asInstanceOf[js.Any], blockTime = blockTime.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], fees = fees.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], txid = txid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueIn = valueIn.asInstanceOf[js.Any], vin = vin.asInstanceOf[js.Any], vout = vout.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockbookTransaction]
    }
    
    extension [Self <: BlockbookTransaction](x: Self) {
      
      inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      inline def setBlockHashUndefined: Self = StObject.set(x, "blockHash", js.undefined)
      
      inline def setBlockHeight(value: Double): Self = StObject.set(x, "blockHeight", value.asInstanceOf[js.Any])
      
      inline def setBlockTime(value: Double): Self = StObject.set(x, "blockTime", value.asInstanceOf[js.Any])
      
      inline def setConfirmations(value: Double): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
      
      inline def setEthereumSpecific(value: Data): Self = StObject.set(x, "ethereumSpecific", value.asInstanceOf[js.Any])
      
      inline def setEthereumSpecificUndefined: Self = StObject.set(x, "ethereumSpecific", js.undefined)
      
      inline def setFees(value: String): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setLockTime(value: Double): Self = StObject.set(x, "lockTime", value.asInstanceOf[js.Any])
      
      inline def setLockTimeUndefined: Self = StObject.set(x, "lockTime", js.undefined)
      
      inline def setTokenTransfers(value: js.Array[Decimals]): Self = StObject.set(x, "tokenTransfers", value.asInstanceOf[js.Any])
      
      inline def setTokenTransfersUndefined: Self = StObject.set(x, "tokenTransfers", js.undefined)
      
      inline def setTokenTransfersVarargs(value: Decimals*): Self = StObject.set(x, "tokenTransfers", js.Array(value*))
      
      inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueIn(value: String): Self = StObject.set(x, "valueIn", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVin(value: js.Array[VinVout]): Self = StObject.set(x, "vin", value.asInstanceOf[js.Any])
      
      inline def setVinVarargs(value: VinVout*): Self = StObject.set(x, "vin", js.Array(value*))
      
      inline def setVout(value: js.Array[VinVout]): Self = StObject.set(x, "vout", value.asInstanceOf[js.Any])
      
      inline def setVoutVarargs(value: VinVout*): Self = StObject.set(x, "vout", js.Array(value*))
    }
  }
  
  trait RippleLibAdjustment extends StObject {
    
    var address: String
    
    var amount: RippleLibAmount
    
    var tag: js.UndefOr[Double] = js.undefined
  }
  object RippleLibAdjustment {
    
    inline def apply(address: String, amount: RippleLibAmount): RippleLibAdjustment = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleLibAdjustment]
    }
    
    extension [Self <: RippleLibAdjustment](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAmount(value: RippleLibAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait RippleLibAmount extends StObject {
    
    var counterparty: js.UndefOr[String] = js.undefined
    
    var currency: String
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object RippleLibAmount {
    
    inline def apply(currency: String, value: String): RippleLibAmount = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleLibAmount]
    }
    
    extension [Self <: RippleLibAmount](x: Self) {
      
      inline def setCounterparty(value: String): Self = StObject.set(x, "counterparty", value.asInstanceOf[js.Any])
      
      inline def setCounterpartyUndefined: Self = StObject.set(x, "counterparty", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RippleLibMemo extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RippleLibMemo {
    
    inline def apply(): RippleLibMemo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RippleLibMemo]
    }
    
    extension [Self <: RippleLibMemo](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RippleLibOutcome extends StObject {
    
    var balanceChanges: StringDictionary[js.Array[RippleLibAmount]]
    
    var fee: String
    
    var indexInLedger: Double
    
    var ledgerVersion: Double
    
    var orderbookChanges: Any
    
    var result: String
    
    var timestamp: js.UndefOr[String] = js.undefined
  }
  object RippleLibOutcome {
    
    inline def apply(
      balanceChanges: StringDictionary[js.Array[RippleLibAmount]],
      fee: String,
      indexInLedger: Double,
      ledgerVersion: Double,
      orderbookChanges: Any,
      result: String
    ): RippleLibOutcome = {
      val __obj = js.Dynamic.literal(balanceChanges = balanceChanges.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], indexInLedger = indexInLedger.asInstanceOf[js.Any], ledgerVersion = ledgerVersion.asInstanceOf[js.Any], orderbookChanges = orderbookChanges.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleLibOutcome]
    }
    
    extension [Self <: RippleLibOutcome](x: Self) {
      
      inline def setBalanceChanges(value: StringDictionary[js.Array[RippleLibAmount]]): Self = StObject.set(x, "balanceChanges", value.asInstanceOf[js.Any])
      
      inline def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      inline def setIndexInLedger(value: Double): Self = StObject.set(x, "indexInLedger", value.asInstanceOf[js.Any])
      
      inline def setLedgerVersion(value: Double): Self = StObject.set(x, "ledgerVersion", value.asInstanceOf[js.Any])
      
      inline def setOrderbookChanges(value: Any): Self = StObject.set(x, "orderbookChanges", value.asInstanceOf[js.Any])
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait RippleLibTransaction extends StObject {
    
    var address: String
    
    var id: String
    
    var outcome: RippleLibOutcome
    
    var sequence: Double
    
    var specification: AllowPartialPayment
    
    var `type`: String
  }
  object RippleLibTransaction {
    
    inline def apply(
      address: String,
      id: String,
      outcome: RippleLibOutcome,
      sequence: Double,
      specification: AllowPartialPayment,
      `type`: String
    ): RippleLibTransaction = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], specification = specification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleLibTransaction]
    }
    
    extension [Self <: RippleLibTransaction](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOutcome(value: RippleLibOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSpecification(value: AllowPartialPayment): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trezorConnect.anon.Tx
    - typings.trezorConnect.anon.TxType
  */
  trait TypedRawTransaction extends StObject
  object TypedRawTransaction {
    
    inline def Tx(tx: BlockbookTransaction): typings.trezorConnect.anon.Tx = {
      val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("blockbook")
      __obj.asInstanceOf[typings.trezorConnect.anon.Tx]
    }
    
    inline def TxType(tx: RippleLibTransaction): typings.trezorConnect.anon.TxType = {
      val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ripple")
      __obj.asInstanceOf[typings.trezorConnect.anon.TxType]
    }
  }
  
  trait VinVout extends StObject {
    
    var addresses: js.UndefOr[js.Array[String]] = js.undefined
    
    var coinbase: js.UndefOr[String] = js.undefined
    
    var hex: js.UndefOr[String] = js.undefined
    
    var isAddress: Boolean
    
    var n: Double
    
    var sequence: js.UndefOr[Double] = js.undefined
    
    var txid: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
    
    var vout: js.UndefOr[Double] = js.undefined
  }
  object VinVout {
    
    inline def apply(isAddress: Boolean, n: Double): VinVout = {
      val __obj = js.Dynamic.literal(isAddress = isAddress.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[VinVout]
    }
    
    extension [Self <: VinVout](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setCoinbase(value: String): Self = StObject.set(x, "coinbase", value.asInstanceOf[js.Any])
      
      inline def setCoinbaseUndefined: Self = StObject.set(x, "coinbase", js.undefined)
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setIsAddress(value: Boolean): Self = StObject.set(x, "isAddress", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
      
      inline def setTxidUndefined: Self = StObject.set(x, "txid", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVout(value: Double): Self = StObject.set(x, "vout", value.asInstanceOf[js.Any])
      
      inline def setVoutUndefined: Self = StObject.set(x, "vout", js.undefined)
    }
  }
}

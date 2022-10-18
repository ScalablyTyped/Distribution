package typings.trezorConnect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNetworksRippleMod {
  
  trait RippleAddress extends StObject {
    
    var address: String
    
    var path: js.Array[Double]
    
    var serializedPath: String
  }
  object RippleAddress {
    
    inline def apply(address: String, path: js.Array[Double], serializedPath: String): RippleAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleAddress]
    }
    
    extension [Self <: RippleAddress](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait RippleGetAddress extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var path: String | js.Array[Double]
    
    var showOnTrezor: js.UndefOr[Boolean] = js.undefined
  }
  object RippleGetAddress {
    
    inline def apply(path: String | js.Array[Double]): RippleGetAddress = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleGetAddress]
    }
    
    extension [Self <: RippleGetAddress](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
      
      inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
    }
  }
  
  trait RipplePayment extends StObject {
    
    var amount: String
    
    var destination: String
    
    var destinationTag: js.UndefOr[Double] = js.undefined
  }
  object RipplePayment {
    
    inline def apply(amount: String, destination: String): RipplePayment = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[RipplePayment]
    }
    
    extension [Self <: RipplePayment](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationTag(value: Double): Self = StObject.set(x, "destinationTag", value.asInstanceOf[js.Any])
      
      inline def setDestinationTagUndefined: Self = StObject.set(x, "destinationTag", js.undefined)
    }
  }
  
  trait RippleSignTransaction extends StObject {
    
    var path: String | js.Array[Double]
    
    var transaction: RippleTransaction
  }
  object RippleSignTransaction {
    
    inline def apply(path: String | js.Array[Double], transaction: RippleTransaction): RippleSignTransaction = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleSignTransaction]
    }
    
    extension [Self <: RippleSignTransaction](x: Self) {
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setTransaction(value: RippleTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  trait RippleSignedTx extends StObject {
    
    var serializedTx: String
    
    var signature: String
  }
  object RippleSignedTx {
    
    inline def apply(serializedTx: String, signature: String): RippleSignedTx = {
      val __obj = js.Dynamic.literal(serializedTx = serializedTx.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleSignedTx]
    }
    
    extension [Self <: RippleSignedTx](x: Self) {
      
      inline def setSerializedTx(value: String): Self = StObject.set(x, "serializedTx", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait RippleTransaction extends StObject {
    
    var fee: String
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var maxLedgerVersion: js.UndefOr[Double] = js.undefined
    
    // Proto: "last_ledger_sequence"
    var payment: RipplePayment
    
    var sequence: Double
  }
  object RippleTransaction {
    
    inline def apply(fee: String, payment: RipplePayment, sequence: Double): RippleTransaction = {
      val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleTransaction]
    }
    
    extension [Self <: RippleTransaction](x: Self) {
      
      inline def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setMaxLedgerVersion(value: Double): Self = StObject.set(x, "maxLedgerVersion", value.asInstanceOf[js.Any])
      
      inline def setMaxLedgerVersionUndefined: Self = StObject.set(x, "maxLedgerVersion", js.undefined)
      
      inline def setPayment(value: RipplePayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    }
  }
}

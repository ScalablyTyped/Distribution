package typings.trezorConnect

import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceCancelMsg
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceInputOutput
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderMsg
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderSide
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderType
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceTimeInForce
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceTransferMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNetworksBinanceMod {
  
  trait BinanceAddress extends StObject {
    
    var address: String
    
    var path: js.Array[Double]
    
    var serializedPath: String
  }
  object BinanceAddress {
    
    inline def apply(address: String, path: js.Array[Double], serializedPath: String): BinanceAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinanceAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinanceAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait BinanceGetAddress extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var path: String | js.Array[Double]
    
    var showOnTrezor: js.UndefOr[Boolean] = js.undefined
  }
  object BinanceGetAddress {
    
    inline def apply(path: String | js.Array[Double]): BinanceGetAddress = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinanceGetAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinanceGetAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
      
      inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
    }
  }
  
  trait BinanceGetPublicKey extends StObject {
    
    var path: String | js.Array[Double]
    
    var showOnTrezor: js.UndefOr[Boolean] = js.undefined
  }
  object BinanceGetPublicKey {
    
    inline def apply(path: String | js.Array[Double]): BinanceGetPublicKey = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinanceGetPublicKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinanceGetPublicKey] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setShowOnTrezor(value: Boolean): Self = StObject.set(x, "showOnTrezor", value.asInstanceOf[js.Any])
      
      inline def setShowOnTrezorUndefined: Self = StObject.set(x, "showOnTrezor", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trezorConnect.anon.BinanceTransferMsgtypeBin
    - typings.trezorConnect.anon.BinanceOrderMsgtypeBinanc
    - typings.trezorConnect.anon.BinanceCancelMsgtypeBinan
  */
  trait BinancePreparedMessage extends StObject
  object BinancePreparedMessage {
    
    inline def BinanceCancelMsgtypeBinan(): typings.trezorConnect.anon.BinanceCancelMsgtypeBinan = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("BinanceCancelMsg")
      __obj.asInstanceOf[typings.trezorConnect.anon.BinanceCancelMsgtypeBinan]
    }
    
    inline def BinanceOrderMsgtypeBinanc(
      ordertype: BinanceOrderType,
      price: Double,
      quantity: Double,
      side: BinanceOrderSide,
      timeinforce: BinanceTimeInForce
    ): typings.trezorConnect.anon.BinanceOrderMsgtypeBinanc = {
      val __obj = js.Dynamic.literal(ordertype = ordertype.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], timeinforce = timeinforce.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("BinanceOrderMsg")
      __obj.asInstanceOf[typings.trezorConnect.anon.BinanceOrderMsgtypeBinanc]
    }
    
    inline def BinanceTransferMsgtypeBin(inputs: js.Array[BinanceInputOutput], outputs: js.Array[BinanceInputOutput]): typings.trezorConnect.anon.BinanceTransferMsgtypeBin = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("BinanceTransferMsg")
      __obj.asInstanceOf[typings.trezorConnect.anon.BinanceTransferMsgtypeBin]
    }
  }
  
  /* Inlined std.Required<trezor-connect.trezor-connect/lib/typescript/networks/binance.BinanceSDKTransaction> & {  messages :std.Array<trezor-connect.trezor-connect/lib/typescript/networks/binance.BinancePreparedMessage>} */
  trait BinancePreparedTransaction extends StObject {
    
    var account_number: Double
    
    var cancelOrder: BinanceCancelMsg
    
    var chain_id: String
    
    var memo: String
    
    var messages: js.Array[BinancePreparedMessage]
    
    var placeOrder: BinanceOrderMsg
    
    var sequence: Double
    
    var source: Double
    
    var transfer: BinanceTransferMsg
  }
  object BinancePreparedTransaction {
    
    inline def apply(
      account_number: Double,
      cancelOrder: BinanceCancelMsg,
      chain_id: String,
      memo: String,
      messages: js.Array[BinancePreparedMessage],
      placeOrder: BinanceOrderMsg,
      sequence: Double,
      source: Double,
      transfer: BinanceTransferMsg
    ): BinancePreparedTransaction = {
      val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], cancelOrder = cancelOrder.asInstanceOf[js.Any], chain_id = chain_id.asInstanceOf[js.Any], memo = memo.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], placeOrder = placeOrder.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinancePreparedTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinancePreparedTransaction] (val x: Self) extends AnyVal {
      
      inline def setAccount_number(value: Double): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      inline def setCancelOrder(value: BinanceCancelMsg): Self = StObject.set(x, "cancelOrder", value.asInstanceOf[js.Any])
      
      inline def setChain_id(value: String): Self = StObject.set(x, "chain_id", value.asInstanceOf[js.Any])
      
      inline def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[BinancePreparedMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: BinancePreparedMessage*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setPlaceOrder(value: BinanceOrderMsg): Self = StObject.set(x, "placeOrder", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTransfer(value: BinanceTransferMsg): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    }
  }
  
  trait BinancePublicKey extends StObject {
    
    var path: js.Array[Double]
    
    var publicKey: String
    
    var serializedPath: String
  }
  object BinancePublicKey {
    
    inline def apply(path: js.Array[Double], publicKey: String, serializedPath: String): BinancePublicKey = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinancePublicKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinancePublicKey] (val x: Self) extends AnyVal {
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSerializedPath(value: String): Self = StObject.set(x, "serializedPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait BinanceSDKTransaction extends StObject {
    
    var account_number: js.UndefOr[Double] = js.undefined
    
    var cancelOrder: js.UndefOr[BinanceCancelMsg] = js.undefined
    
    var chain_id: String
    
    // default 0
    var memo: js.UndefOr[String] = js.undefined
    
    var placeOrder: js.UndefOr[BinanceOrderMsg] = js.undefined
    
    var sequence: js.UndefOr[Double] = js.undefined
    
    // default 0
    var source: js.UndefOr[Double] = js.undefined
    
    // default 0
    var transfer: js.UndefOr[BinanceTransferMsg] = js.undefined
  }
  object BinanceSDKTransaction {
    
    inline def apply(chain_id: String): BinanceSDKTransaction = {
      val __obj = js.Dynamic.literal(chain_id = chain_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinanceSDKTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinanceSDKTransaction] (val x: Self) extends AnyVal {
      
      inline def setAccount_number(value: Double): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
      
      inline def setAccount_numberUndefined: Self = StObject.set(x, "account_number", js.undefined)
      
      inline def setCancelOrder(value: BinanceCancelMsg): Self = StObject.set(x, "cancelOrder", value.asInstanceOf[js.Any])
      
      inline def setCancelOrderUndefined: Self = StObject.set(x, "cancelOrder", js.undefined)
      
      inline def setChain_id(value: String): Self = StObject.set(x, "chain_id", value.asInstanceOf[js.Any])
      
      inline def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
      
      inline def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
      
      inline def setPlaceOrder(value: BinanceOrderMsg): Self = StObject.set(x, "placeOrder", value.asInstanceOf[js.Any])
      
      inline def setPlaceOrderUndefined: Self = StObject.set(x, "placeOrder", js.undefined)
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTransfer(value: BinanceTransferMsg): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
      
      inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    }
  }
  
  trait BinanceSignTransaction extends StObject {
    
    var path: String | js.Array[Double]
    
    var transaction: BinanceSDKTransaction
  }
  object BinanceSignTransaction {
    
    inline def apply(path: String | js.Array[Double], transaction: BinanceSDKTransaction): BinanceSignTransaction = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinanceSignTransaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinanceSignTransaction] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setTransaction(value: BinanceSDKTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
}

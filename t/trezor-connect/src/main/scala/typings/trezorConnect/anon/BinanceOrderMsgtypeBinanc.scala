package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksBinanceMod.BinancePreparedMessage
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderSide
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceOrderType
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceTimeInForce
import typings.trezorConnect.trezorConnectStrings.BinanceOrderMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.BinanceOrderMsg & {  type :'BinanceOrderMsg'} */
trait BinanceOrderMsgtypeBinanc
  extends StObject
     with BinancePreparedMessage {
  
  var id: js.UndefOr[String] = js.undefined
  
  var ordertype: BinanceOrderType
  
  var price: Double
  
  var quantity: Double
  
  var sender: js.UndefOr[String] = js.undefined
  
  var side: BinanceOrderSide
  
  var symbol: js.UndefOr[String] = js.undefined
  
  var timeinforce: BinanceTimeInForce
  
  var `type`: BinanceOrderMsg
}
object BinanceOrderMsgtypeBinanc {
  
  inline def apply(
    ordertype: BinanceOrderType,
    price: Double,
    quantity: Double,
    side: BinanceOrderSide,
    timeinforce: BinanceTimeInForce
  ): BinanceOrderMsgtypeBinanc = {
    val __obj = js.Dynamic.literal(ordertype = ordertype.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], timeinforce = timeinforce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinanceOrderMsg")
    __obj.asInstanceOf[BinanceOrderMsgtypeBinanc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinanceOrderMsgtypeBinanc] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOrdertype(value: BinanceOrderType): Self = StObject.set(x, "ordertype", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSide(value: BinanceOrderSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setTimeinforce(value: BinanceTimeInForce): Self = StObject.set(x, "timeinforce", value.asInstanceOf[js.Any])
    
    inline def setType(value: BinanceOrderMsg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

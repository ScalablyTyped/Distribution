package typings.trezorConnect.anon

import typings.trezorConnect.binanceMod.BinancePreparedMessage
import typings.trezorConnect.trezorConnectStrings.BinanceCancelMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.BinanceCancelMsg & {  type :'BinanceCancelMsg'} */
trait BinanceCancelMsgtypeBinan
  extends StObject
     with BinancePreparedMessage {
  
  var refid: js.UndefOr[String] = js.undefined
  
  var sender: js.UndefOr[String] = js.undefined
  
  var symbol: js.UndefOr[String] = js.undefined
  
  var `type`: BinanceCancelMsg
}
object BinanceCancelMsgtypeBinan {
  
  inline def apply(): BinanceCancelMsgtypeBinan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BinanceCancelMsg")
    __obj.asInstanceOf[BinanceCancelMsgtypeBinan]
  }
  
  extension [Self <: BinanceCancelMsgtypeBinan](x: Self) {
    
    inline def setRefid(value: String): Self = StObject.set(x, "refid", value.asInstanceOf[js.Any])
    
    inline def setRefidUndefined: Self = StObject.set(x, "refid", js.undefined)
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setType(value: BinanceCancelMsg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

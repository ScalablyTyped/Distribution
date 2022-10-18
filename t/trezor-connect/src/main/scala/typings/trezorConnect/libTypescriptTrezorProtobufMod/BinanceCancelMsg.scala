package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinanceCancelMsg extends StObject {
  
  var refid: js.UndefOr[String] = js.undefined
  
  var sender: js.UndefOr[String] = js.undefined
  
  var symbol: js.UndefOr[String] = js.undefined
}
object BinanceCancelMsg {
  
  inline def apply(): BinanceCancelMsg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinanceCancelMsg]
  }
  
  extension [Self <: BinanceCancelMsg](x: Self) {
    
    inline def setRefid(value: String): Self = StObject.set(x, "refid", value.asInstanceOf[js.Any])
    
    inline def setRefidUndefined: Self = StObject.set(x, "refid", js.undefined)
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}

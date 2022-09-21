package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosActionSellRam extends StObject {
  
  var account: String
  
  var bytes: Double
}
object EosActionSellRam {
  
  inline def apply(account: String, bytes: Double): EosActionSellRam = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosActionSellRam]
  }
  
  extension [Self <: EosActionSellRam](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
  }
}

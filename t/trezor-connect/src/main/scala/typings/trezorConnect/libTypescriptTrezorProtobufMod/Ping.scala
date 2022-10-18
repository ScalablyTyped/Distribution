package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ping extends StObject {
  
  var button_protection: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Ping {
  
  inline def apply(): Ping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ping]
  }
  
  extension [Self <: Ping](x: Self) {
    
    inline def setButton_protection(value: Boolean): Self = StObject.set(x, "button_protection", value.asInstanceOf[js.Any])
    
    inline def setButton_protectionUndefined: Self = StObject.set(x, "button_protection", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}

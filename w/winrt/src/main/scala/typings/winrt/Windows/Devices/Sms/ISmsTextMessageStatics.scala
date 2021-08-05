package typings.winrt.Windows.Devices.Sms

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsTextMessageStatics extends StObject {
  
  def fromBinaryData(format: SmsDataFormat, value: Uint8Array): SmsTextMessage
  
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage
}
object ISmsTextMessageStatics {
  
  inline def apply(
    fromBinaryData: (SmsDataFormat, Uint8Array) => SmsTextMessage,
    fromBinaryMessage: SmsBinaryMessage => SmsTextMessage
  ): ISmsTextMessageStatics = {
    val __obj = js.Dynamic.literal(fromBinaryData = js.Any.fromFunction2(fromBinaryData), fromBinaryMessage = js.Any.fromFunction1(fromBinaryMessage))
    __obj.asInstanceOf[ISmsTextMessageStatics]
  }
  
  extension [Self <: ISmsTextMessageStatics](x: Self) {
    
    inline def setFromBinaryData(value: (SmsDataFormat, Uint8Array) => SmsTextMessage): Self = StObject.set(x, "fromBinaryData", js.Any.fromFunction2(value))
    
    inline def setFromBinaryMessage(value: SmsBinaryMessage => SmsTextMessage): Self = StObject.set(x, "fromBinaryMessage", js.Any.fromFunction1(value))
  }
}

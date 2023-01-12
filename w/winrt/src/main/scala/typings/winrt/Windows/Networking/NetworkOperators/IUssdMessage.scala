package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUssdMessage extends StObject {
  
  var dataCodingScheme: Double
  
  def getPayload(): js.typedarray.Uint8Array
  
  var payloadAsText: String
  
  def setPayload(value: js.typedarray.Uint8Array): Unit
}
object IUssdMessage {
  
  inline def apply(
    dataCodingScheme: Double,
    getPayload: () => js.typedarray.Uint8Array,
    payloadAsText: String,
    setPayload: js.typedarray.Uint8Array => Unit
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[IUssdMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUssdMessage] (val x: Self) extends AnyVal {
    
    inline def setDataCodingScheme(value: Double): Self = StObject.set(x, "dataCodingScheme", value.asInstanceOf[js.Any])
    
    inline def setGetPayload(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "getPayload", js.Any.fromFunction0(value))
    
    inline def setPayloadAsText(value: String): Self = StObject.set(x, "payloadAsText", value.asInstanceOf[js.Any])
    
    inline def setSetPayload(value: js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "setPayload", js.Any.fromFunction1(value))
  }
}

package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUssdMessage extends StObject {
  
  var dataCodingScheme: Double
  
  def getPayload(): Uint8Array
  
  var payloadAsText: String
  
  def setPayload(value: Uint8Array): Unit
}
object IUssdMessage {
  
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => Uint8Array,
    payloadAsText: String,
    setPayload: Uint8Array => Unit
  ): IUssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[IUssdMessage]
  }
  
  @scala.inline
  implicit class IUssdMessageMutableBuilder[Self <: IUssdMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCodingScheme(value: Double): Self = StObject.set(x, "dataCodingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPayload(value: () => Uint8Array): Self = StObject.set(x, "getPayload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPayloadAsText(value: String): Self = StObject.set(x, "payloadAsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPayload(value: Uint8Array => Unit): Self = StObject.set(x, "setPayload", js.Any.fromFunction1(value))
  }
}

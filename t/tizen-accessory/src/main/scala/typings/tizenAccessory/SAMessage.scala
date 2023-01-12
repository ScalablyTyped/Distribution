package typings.tizenAccessory

import typings.tizenAccessory.anon.Onsent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMessage extends StObject {
  
  def sendData(peerAgent: SAPeerAgent, data: String, callback: Onsent): Unit
  
  def sendSecureData(peerAgent: SAPeerAgent, data: String, callback: Onsent): Unit
  
  def setMessageReceiveListener(receiveDataCallback: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit]): Unit
}
object SAMessage {
  
  inline def apply(
    sendData: (SAPeerAgent, String, Onsent) => Unit,
    sendSecureData: (SAPeerAgent, String, Onsent) => Unit,
    setMessageReceiveListener: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit] => Unit
  ): SAMessage = {
    val __obj = js.Dynamic.literal(sendData = js.Any.fromFunction3(sendData), sendSecureData = js.Any.fromFunction3(sendSecureData), setMessageReceiveListener = js.Any.fromFunction1(setMessageReceiveListener))
    __obj.asInstanceOf[SAMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SAMessage] (val x: Self) extends AnyVal {
    
    inline def setSendData(value: (SAPeerAgent, String, Onsent) => Unit): Self = StObject.set(x, "sendData", js.Any.fromFunction3(value))
    
    inline def setSendSecureData(value: (SAPeerAgent, String, Onsent) => Unit): Self = StObject.set(x, "sendSecureData", js.Any.fromFunction3(value))
    
    inline def setSetMessageReceiveListener(value: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit] => Unit): Self = StObject.set(x, "setMessageReceiveListener", js.Any.fromFunction1(value))
  }
}

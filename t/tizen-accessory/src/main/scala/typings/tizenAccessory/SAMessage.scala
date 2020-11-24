package typings.tizenAccessory

import typings.tizenAccessory.anon.Onsent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMessage extends js.Object {
  
  def sendData(peerAgent: SAPeerAgent, data: String, callback: Onsent): Unit = js.native
  
  def sendSecureData(peerAgent: SAPeerAgent, data: String, callback: Onsent): Unit = js.native
  
  def setMessageReceiveListener(receiveDataCallback: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit]): Unit = js.native
}
object SAMessage {
  
  @scala.inline
  def apply(
    sendData: (SAPeerAgent, String, Onsent) => Unit,
    sendSecureData: (SAPeerAgent, String, Onsent) => Unit,
    setMessageReceiveListener: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit] => Unit
  ): SAMessage = {
    val __obj = js.Dynamic.literal(sendData = js.Any.fromFunction3(sendData), sendSecureData = js.Any.fromFunction3(sendSecureData), setMessageReceiveListener = js.Any.fromFunction1(setMessageReceiveListener))
    __obj.asInstanceOf[SAMessage]
  }
  
  @scala.inline
  implicit class SAMessageOps[Self <: SAMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSendData(value: (SAPeerAgent, String, Onsent) => Unit): Self = this.set("sendData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSendSecureData(value: (SAPeerAgent, String, Onsent) => Unit): Self = this.set("sendSecureData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetMessageReceiveListener(value: js.Function2[/* peerAgent */ SAPeerAgent, /* data */ String, Unit] => Unit): Self = this.set("setMessageReceiveListener", js.Any.fromFunction1(value))
  }
}

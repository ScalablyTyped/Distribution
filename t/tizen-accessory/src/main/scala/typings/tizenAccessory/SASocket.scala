package typings.tizenAccessory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SASocket extends js.Object {
  
  def close(): Unit = js.native
  
  def isConnected(): Boolean = js.native
  
  val peerAgent: SAPeerAgent = js.native
  
  def sendData(channelId: Double, data: String): Unit = js.native
  
  def sendSecureData(channelId: Double, data: String): Unit = js.native
  
  def setDataReceiveListener(dataReceiveCallback: js.Function2[/* channelId */ Double, /* data */ String, Unit]): Unit = js.native
  
  def setSocketStatusListener(socketStatusCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
}
object SASocket {
  
  @scala.inline
  def apply(
    close: () => Unit,
    isConnected: () => Boolean,
    peerAgent: SAPeerAgent,
    sendData: (Double, String) => Unit,
    sendSecureData: (Double, String) => Unit,
    setDataReceiveListener: js.Function2[/* channelId */ Double, /* data */ String, Unit] => Unit,
    setSocketStatusListener: js.Function1[/* reason */ String, Unit] => Unit
  ): SASocket = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isConnected = js.Any.fromFunction0(isConnected), peerAgent = peerAgent.asInstanceOf[js.Any], sendData = js.Any.fromFunction2(sendData), sendSecureData = js.Any.fromFunction2(sendSecureData), setDataReceiveListener = js.Any.fromFunction1(setDataReceiveListener), setSocketStatusListener = js.Any.fromFunction1(setSocketStatusListener))
    __obj.asInstanceOf[SASocket]
  }
  
  @scala.inline
  implicit class SASocketOps[Self <: SASocket] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConnected(value: () => Boolean): Self = this.set("isConnected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeerAgent(value: SAPeerAgent): Self = this.set("peerAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendData(value: (Double, String) => Unit): Self = this.set("sendData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendSecureData(value: (Double, String) => Unit): Self = this.set("sendSecureData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDataReceiveListener(value: js.Function2[/* channelId */ Double, /* data */ String, Unit] => Unit): Self = this.set("setDataReceiveListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSocketStatusListener(value: js.Function1[/* reason */ String, Unit] => Unit): Self = this.set("setSocketStatusListener", js.Any.fromFunction1(value))
  }
}

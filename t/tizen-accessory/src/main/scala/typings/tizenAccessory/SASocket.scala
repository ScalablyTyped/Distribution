package typings.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SASocket extends StObject {
  
  def close(): Unit
  
  def isConnected(): Boolean
  
  val peerAgent: SAPeerAgent
  
  def sendData(channelId: Double, data: String): Unit
  
  def sendSecureData(channelId: Double, data: String): Unit
  
  def setDataReceiveListener(dataReceiveCallback: js.Function2[/* channelId */ Double, /* data */ String, Unit]): Unit
  
  def setSocketStatusListener(socketStatusCallback: js.Function1[/* reason */ String, Unit]): Unit
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
  implicit class SASocketMutableBuilder[Self <: SASocket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeerAgent(value: SAPeerAgent): Self = StObject.set(x, "peerAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendData(value: (Double, String) => Unit): Self = StObject.set(x, "sendData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendSecureData(value: (Double, String) => Unit): Self = StObject.set(x, "sendSecureData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDataReceiveListener(value: js.Function2[/* channelId */ Double, /* data */ String, Unit] => Unit): Self = StObject.set(x, "setDataReceiveListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSocketStatusListener(value: js.Function1[/* reason */ String, Unit] => Unit): Self = StObject.set(x, "setSocketStatusListener", js.Any.fromFunction1(value))
  }
}

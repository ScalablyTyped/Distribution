package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typings.winrt.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControlChannelTrigger
  extends StObject
     with IClosable {
  
  var controlChannelTriggerId: String
  
  var currentKeepAliveIntervalInMinutes: Double
  
  def decreaseNetworkKeepAliveInterval(): Unit
  
  def flushTransport(): Unit
  
  var keepAliveTrigger: IBackgroundTrigger
  
  var pushNotificationTrigger: IBackgroundTrigger
  
  var serverKeepAliveIntervalInMinutes: Double
  
  var transportObject: Any
  
  def usingTransport(transport: Any): Unit
  
  def waitForPushEnabled(): ControlChannelTriggerStatus
}
object IControlChannelTrigger {
  
  inline def apply(
    close: () => Unit,
    controlChannelTriggerId: String,
    currentKeepAliveIntervalInMinutes: Double,
    decreaseNetworkKeepAliveInterval: () => Unit,
    flushTransport: () => Unit,
    keepAliveTrigger: IBackgroundTrigger,
    pushNotificationTrigger: IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: Double,
    transportObject: Any,
    usingTransport: Any => Unit,
    waitForPushEnabled: () => ControlChannelTriggerStatus
  ): IControlChannelTrigger = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controlChannelTriggerId = controlChannelTriggerId.asInstanceOf[js.Any], currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes.asInstanceOf[js.Any], decreaseNetworkKeepAliveInterval = js.Any.fromFunction0(decreaseNetworkKeepAliveInterval), flushTransport = js.Any.fromFunction0(flushTransport), keepAliveTrigger = keepAliveTrigger.asInstanceOf[js.Any], pushNotificationTrigger = pushNotificationTrigger.asInstanceOf[js.Any], serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes.asInstanceOf[js.Any], transportObject = transportObject.asInstanceOf[js.Any], usingTransport = js.Any.fromFunction1(usingTransport), waitForPushEnabled = js.Any.fromFunction0(waitForPushEnabled))
    __obj.asInstanceOf[IControlChannelTrigger]
  }
  
  extension [Self <: IControlChannelTrigger](x: Self) {
    
    inline def setControlChannelTriggerId(value: String): Self = StObject.set(x, "controlChannelTriggerId", value.asInstanceOf[js.Any])
    
    inline def setCurrentKeepAliveIntervalInMinutes(value: Double): Self = StObject.set(x, "currentKeepAliveIntervalInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDecreaseNetworkKeepAliveInterval(value: () => Unit): Self = StObject.set(x, "decreaseNetworkKeepAliveInterval", js.Any.fromFunction0(value))
    
    inline def setFlushTransport(value: () => Unit): Self = StObject.set(x, "flushTransport", js.Any.fromFunction0(value))
    
    inline def setKeepAliveTrigger(value: IBackgroundTrigger): Self = StObject.set(x, "keepAliveTrigger", value.asInstanceOf[js.Any])
    
    inline def setPushNotificationTrigger(value: IBackgroundTrigger): Self = StObject.set(x, "pushNotificationTrigger", value.asInstanceOf[js.Any])
    
    inline def setServerKeepAliveIntervalInMinutes(value: Double): Self = StObject.set(x, "serverKeepAliveIntervalInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTransportObject(value: Any): Self = StObject.set(x, "transportObject", value.asInstanceOf[js.Any])
    
    inline def setUsingTransport(value: Any => Unit): Self = StObject.set(x, "usingTransport", js.Any.fromFunction1(value))
    
    inline def setWaitForPushEnabled(value: () => ControlChannelTriggerStatus): Self = StObject.set(x, "waitForPushEnabled", js.Any.fromFunction0(value))
  }
}

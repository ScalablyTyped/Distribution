package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typings.winrt.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControlChannelTrigger extends IClosable {
  
  var controlChannelTriggerId: String = js.native
  
  var currentKeepAliveIntervalInMinutes: Double = js.native
  
  def decreaseNetworkKeepAliveInterval(): Unit = js.native
  
  def flushTransport(): Unit = js.native
  
  var keepAliveTrigger: IBackgroundTrigger = js.native
  
  var pushNotificationTrigger: IBackgroundTrigger = js.native
  
  var serverKeepAliveIntervalInMinutes: Double = js.native
  
  var transportObject: js.Any = js.native
  
  def usingTransport(transport: js.Any): Unit = js.native
  
  def waitForPushEnabled(): ControlChannelTriggerStatus = js.native
}
object IControlChannelTrigger {
  
  @scala.inline
  def apply(
    close: () => Unit,
    controlChannelTriggerId: String,
    currentKeepAliveIntervalInMinutes: Double,
    decreaseNetworkKeepAliveInterval: () => Unit,
    flushTransport: () => Unit,
    keepAliveTrigger: IBackgroundTrigger,
    pushNotificationTrigger: IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: Double,
    transportObject: js.Any,
    usingTransport: js.Any => Unit,
    waitForPushEnabled: () => ControlChannelTriggerStatus
  ): IControlChannelTrigger = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controlChannelTriggerId = controlChannelTriggerId.asInstanceOf[js.Any], currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes.asInstanceOf[js.Any], decreaseNetworkKeepAliveInterval = js.Any.fromFunction0(decreaseNetworkKeepAliveInterval), flushTransport = js.Any.fromFunction0(flushTransport), keepAliveTrigger = keepAliveTrigger.asInstanceOf[js.Any], pushNotificationTrigger = pushNotificationTrigger.asInstanceOf[js.Any], serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes.asInstanceOf[js.Any], transportObject = transportObject.asInstanceOf[js.Any], usingTransport = js.Any.fromFunction1(usingTransport), waitForPushEnabled = js.Any.fromFunction0(waitForPushEnabled))
    __obj.asInstanceOf[IControlChannelTrigger]
  }
  
  @scala.inline
  implicit class IControlChannelTriggerMutableBuilder[Self <: IControlChannelTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlChannelTriggerId(value: String): Self = StObject.set(x, "controlChannelTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentKeepAliveIntervalInMinutes(value: Double): Self = StObject.set(x, "currentKeepAliveIntervalInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreaseNetworkKeepAliveInterval(value: () => Unit): Self = StObject.set(x, "decreaseNetworkKeepAliveInterval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlushTransport(value: () => Unit): Self = StObject.set(x, "flushTransport", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeepAliveTrigger(value: IBackgroundTrigger): Self = StObject.set(x, "keepAliveTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushNotificationTrigger(value: IBackgroundTrigger): Self = StObject.set(x, "pushNotificationTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerKeepAliveIntervalInMinutes(value: Double): Self = StObject.set(x, "serverKeepAliveIntervalInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportObject(value: js.Any): Self = StObject.set(x, "transportObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsingTransport(value: js.Any => Unit): Self = StObject.set(x, "usingTransport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitForPushEnabled(value: () => ControlChannelTriggerStatus): Self = StObject.set(x, "waitForPushEnabled", js.Any.fromFunction0(value))
  }
}

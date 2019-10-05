package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typings.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlChannelTrigger extends IClosable {
  var controlChannelTriggerId: String
  var currentKeepAliveIntervalInMinutes: Double
  var keepAliveTrigger: IBackgroundTrigger
  var pushNotificationTrigger: IBackgroundTrigger
  var serverKeepAliveIntervalInMinutes: Double
  var transportObject: js.Any
  def decreaseNetworkKeepAliveInterval(): Unit
  def flushTransport(): Unit
  def usingTransport(transport: js.Any): Unit
  def waitForPushEnabled(): ControlChannelTriggerStatus
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
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controlChannelTriggerId = controlChannelTriggerId, currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes, decreaseNetworkKeepAliveInterval = js.Any.fromFunction0(decreaseNetworkKeepAliveInterval), flushTransport = js.Any.fromFunction0(flushTransport), keepAliveTrigger = keepAliveTrigger, pushNotificationTrigger = pushNotificationTrigger, serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes, transportObject = transportObject, usingTransport = js.Any.fromFunction1(usingTransport), waitForPushEnabled = js.Any.fromFunction0(waitForPushEnabled))
  
    __obj.asInstanceOf[IControlChannelTrigger]
  }
}


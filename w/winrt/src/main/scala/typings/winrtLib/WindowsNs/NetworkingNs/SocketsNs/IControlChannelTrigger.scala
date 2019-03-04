package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlChannelTrigger
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  var controlChannelTriggerId: java.lang.String
  var currentKeepAliveIntervalInMinutes: scala.Double
  var keepAliveTrigger: winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTrigger
  var pushNotificationTrigger: winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTrigger
  var serverKeepAliveIntervalInMinutes: scala.Double
  var transportObject: js.Any
  def decreaseNetworkKeepAliveInterval(): scala.Unit
  def flushTransport(): scala.Unit
  def usingTransport(transport: js.Any): scala.Unit
  def waitForPushEnabled(): ControlChannelTriggerStatus
}

object IControlChannelTrigger {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    controlChannelTriggerId: java.lang.String,
    currentKeepAliveIntervalInMinutes: scala.Double,
    decreaseNetworkKeepAliveInterval: js.Function0[scala.Unit],
    flushTransport: js.Function0[scala.Unit],
    keepAliveTrigger: winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTrigger,
    pushNotificationTrigger: winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: scala.Double,
    transportObject: js.Any,
    usingTransport: js.Function1[js.Any, scala.Unit],
    waitForPushEnabled: js.Function0[ControlChannelTriggerStatus]
  ): IControlChannelTrigger = {
    val __obj = js.Dynamic.literal(close = close, controlChannelTriggerId = controlChannelTriggerId, currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes, decreaseNetworkKeepAliveInterval = decreaseNetworkKeepAliveInterval, flushTransport = flushTransport, keepAliveTrigger = keepAliveTrigger, pushNotificationTrigger = pushNotificationTrigger, serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes, transportObject = transportObject, usingTransport = usingTransport, waitForPushEnabled = waitForPushEnabled)
  
    __obj.asInstanceOf[IControlChannelTrigger]
  }
}


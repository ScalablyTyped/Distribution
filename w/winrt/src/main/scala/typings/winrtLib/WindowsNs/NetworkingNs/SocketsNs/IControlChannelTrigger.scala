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


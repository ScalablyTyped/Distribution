package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.ControlChannelTrigger")
@js.native
class ControlChannelTrigger protected () extends IControlChannelTrigger {
  def this(channelId: java.lang.String, serverKeepAliveIntervalInMinutes: scala.Double) = this()
  def this(channelId: java.lang.String, serverKeepAliveIntervalInMinutes: scala.Double, resourceRequestType: ControlChannelTriggerResourceType) = this()
  /* CompleteClass */
  override var controlChannelTriggerId: java.lang.String = js.native
  /* CompleteClass */
  override var currentKeepAliveIntervalInMinutes: scala.Double = js.native
  /* CompleteClass */
  override var keepAliveTrigger: winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTrigger = js.native
  /* CompleteClass */
  override var pushNotificationTrigger: winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTrigger = js.native
  /* CompleteClass */
  override var serverKeepAliveIntervalInMinutes: scala.Double = js.native
  /* CompleteClass */
  override var transportObject: js.Any = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def decreaseNetworkKeepAliveInterval(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def flushTransport(): scala.Unit = js.native
  /* CompleteClass */
  override def usingTransport(transport: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def waitForPushEnabled(): ControlChannelTriggerStatus = js.native
}


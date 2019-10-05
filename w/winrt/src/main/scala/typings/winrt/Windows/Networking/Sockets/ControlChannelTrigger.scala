package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.ControlChannelTrigger")
@js.native
class ControlChannelTrigger protected () extends IControlChannelTrigger {
  def this(channelId: String, serverKeepAliveIntervalInMinutes: Double) = this()
  def this(
    channelId: String,
    serverKeepAliveIntervalInMinutes: Double,
    resourceRequestType: ControlChannelTriggerResourceType
  ) = this()
  /* CompleteClass */
  override var controlChannelTriggerId: String = js.native
  /* CompleteClass */
  override var currentKeepAliveIntervalInMinutes: Double = js.native
  /* CompleteClass */
  override var keepAliveTrigger: IBackgroundTrigger = js.native
  /* CompleteClass */
  override var pushNotificationTrigger: IBackgroundTrigger = js.native
  /* CompleteClass */
  override var serverKeepAliveIntervalInMinutes: Double = js.native
  /* CompleteClass */
  override var transportObject: js.Any = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def decreaseNetworkKeepAliveInterval(): Unit = js.native
  def dispose(): Unit = js.native
  /* CompleteClass */
  override def flushTransport(): Unit = js.native
  /* CompleteClass */
  override def usingTransport(transport: js.Any): Unit = js.native
  /* CompleteClass */
  override def waitForPushEnabled(): ControlChannelTriggerStatus = js.native
}


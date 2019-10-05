package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControlChannelTriggerFactory extends js.Object {
  def createControlChannelTrigger(channelId: String, serverKeepAliveIntervalInMinutes: Double): ControlChannelTrigger = js.native
  def createControlChannelTrigger(
    channelId: String,
    serverKeepAliveIntervalInMinutes: Double,
    resourceRequestType: ControlChannelTriggerResourceType
  ): ControlChannelTrigger = js.native
}


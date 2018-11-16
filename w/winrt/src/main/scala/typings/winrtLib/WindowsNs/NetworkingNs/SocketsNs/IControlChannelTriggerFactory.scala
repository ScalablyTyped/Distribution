package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControlChannelTriggerFactory extends js.Object {
  def createControlChannelTrigger(channelId: java.lang.String, serverKeepAliveIntervalInMinutes: scala.Double): ControlChannelTrigger = js.native
  def createControlChannelTrigger(
    channelId: java.lang.String,
    serverKeepAliveIntervalInMinutes: scala.Double,
    resourceRequestType: ControlChannelTriggerResourceType
  ): ControlChannelTrigger = js.native
}


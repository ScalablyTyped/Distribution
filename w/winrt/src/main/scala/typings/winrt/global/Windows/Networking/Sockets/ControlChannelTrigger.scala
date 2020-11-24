package typings.winrt.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Networking.Sockets.ControlChannelTrigger")
@js.native
class ControlChannelTrigger protected ()
  extends typings.winrt.Windows.Networking.Sockets.ControlChannelTrigger {
  def this(channelId: String, serverKeepAliveIntervalInMinutes: Double) = this()
  def this(
    channelId: String,
    serverKeepAliveIntervalInMinutes: Double,
    resourceRequestType: typings.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType
  ) = this()
}

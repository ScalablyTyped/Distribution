package typings
package twilsockLib.libTwilsockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Twilsock channel level protocol implementation
  */
@JSImport("twilsock/lib/twilsock", "TwilsockImpl")
@js.native
class TwilsockImpl protected () extends TwilsockChannel {
  def this(websocket: twilsockLib.libWebsocketchannelMod.WebSocketChannel, transport: twilsockLib.libPacketinterfaceMod.PacketInterface, config: twilsockLib.libConfigurationMod.Configuration) = this()
}


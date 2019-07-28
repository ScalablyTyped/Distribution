package typings.twilsock.libTwilsockMod

import typings.twilsock.libConfigurationMod.Configuration
import typings.twilsock.libPacketinterfaceMod.PacketInterface
import typings.twilsock.libWebsocketchannelMod.WebSocketChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Twilsock channel level protocol implementation
  */
@JSImport("twilsock/lib/twilsock", "TwilsockImpl")
@js.native
class TwilsockImpl protected () extends TwilsockChannel {
  def this(websocket: WebSocketChannel, transport: PacketInterface, config: Configuration) = this()
}


package typings
package twilsockLib.libPacketinterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/packetinterface", "PacketInterface")
@js.native
class PacketInterface protected () extends js.Object {
  def this(channel: twilsockLib.libInterfacesChannelMod.Channel, config: twilsockLib.libConfigurationMod.Configuration) = this()
  val activeRequests: js.Any = js.native
  val channel: js.Any = js.native
  val config: js.Any = js.native
  val isConnected: scala.Boolean = js.native
  var storeRequest: js.Any = js.native
  def processReply(reply: js.Any): scala.Unit = js.native
  def send(header: twilsockLib.libProtocolProtocolMod.ProtocolNs.Header): java.lang.String = js.native
  def send(header: twilsockLib.libProtocolProtocolMod.ProtocolNs.Header, payload: js.Any): java.lang.String = js.native
  def sendClose(): scala.Unit = js.native
  def sendInit(): js.Promise[twilsockLib.libProtocolMessagesMod.InitReply] = js.native
  def sendWithReply(header: twilsockLib.libProtocolProtocolMod.ProtocolNs.Header): js.Promise[PacketResponse] = js.native
  def sendWithReply(header: twilsockLib.libProtocolProtocolMod.ProtocolNs.Header, payload: js.Any): js.Promise[PacketResponse] = js.native
  def shutdown(): scala.Unit = js.native
}


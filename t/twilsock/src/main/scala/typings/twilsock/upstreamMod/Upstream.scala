package typings.twilsock.upstreamMod

import typings.twilsock.configurationMod.Configuration
import typings.twilsock.packetinterfaceMod.PacketInterface
import typings.twilsock.twilsockMod.TwilsockImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/services/upstream", "Upstream")
@js.native
class Upstream protected () extends js.Object {
  def this(transport: PacketInterface, twilsock: TwilsockImpl, config: Configuration) = this()
  val config: js.Any = js.native
  val pendingMessages: js.Any = js.native
  val transport: js.Any = js.native
  val twilsock: js.Any = js.native
  def actualSend(message: js.Any): js.Promise[Result] = js.native
  def rejectPendingMessages(): Unit = js.native
  def saveMessage(message: js.Any): js.Promise[Result] = js.native
  /**
    * Send an upstream message
    * @param {Twilsock#Message} message Message structure with header, body and remote address
    * @returns {Promise<Result>} Result from remote side
    */
  def send(method: String, url: String): js.Promise[Result] = js.native
  def send(method: String, url: String, headers: Headers): js.Promise[Result] = js.native
  def send(method: String, url: String, headers: Headers, body: js.Any): js.Promise[Result] = js.native
  def sendPendingMessages(): Unit = js.native
}


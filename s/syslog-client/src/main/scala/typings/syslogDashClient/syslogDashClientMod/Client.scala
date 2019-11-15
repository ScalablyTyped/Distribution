package typings.syslogDashClient.syslogDashClientMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("syslog-client", "Client")
@js.native
class Client () extends EventEmitter {
  def this(target: String) = this()
  def this(target: String, options: ClientOptions) = this()
  def buildFormattedMessage(message: String, options: MessageOptions): Buffer = js.native
  def close(): Client = js.native
  def getTransport(cb: js.Function2[/* error */ Error | Null, /* transport */ Transport, Unit]): Unit = js.native
  def log(message: String): Client = js.native
  def log(message: String, options: MessageOptions): Client = js.native
  def log(message: String, options: MessageOptions, cb: js.Function1[/* error */ Error | Null, Unit]): Client = js.native
  def onClose(): Client = js.native
  def onError(error: Error): Client = js.native
}


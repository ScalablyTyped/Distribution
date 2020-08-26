package typings.twilsock

import typings.twilsock.abstractmessageMod.AbstractMessage
import typings.twilsock.initregistrationMod.InitRegistration
import typings.twilsock.protocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/init", JSImport.Namespace)
@js.native
object initMod extends js.Object {
  @js.native
  class Init protected () extends AbstractMessage {
    def this(token: String, continuationToken: String, metadata: js.Object) = this()
    def this(
      token: String,
      continuationToken: String,
      metadata: js.Object,
      registrations: js.Array[InitRegistration]
    ) = this()
    def this(
      token: String,
      continuationToken: String,
      metadata: js.Object,
      registrations: js.UndefOr[scala.Nothing],
      tweaks: js.Object
    ) = this()
    def this(
      token: String,
      continuationToken: String,
      metadata: js.Object,
      registrations: js.Array[InitRegistration],
      tweaks: js.Object
    ) = this()
    val capabilities: js.Array[String] = js.native
    val continuation_token: String = js.native
    val method: MessageType = js.native
    val registrations: js.Array[InitRegistration] = js.native
    val token: String = js.native
  }
  
}


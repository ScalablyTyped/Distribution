package typings.twilsock.libProtocolMessagesMod

import typings.twilsock.libProtocolInitregistrationMod.InitRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages", "Init")
@js.native
class Init protected ()
  extends typings.twilsock.libProtocolMessagesInitMod.Init {
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
    registrations: js.Array[InitRegistration],
    tweaks: js.Object
  ) = this()
}


package typings
package twilsockLib.libProtocolMessagesInitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/init", "Init")
@js.native
class Init protected ()
  extends twilsockLib.libProtocolMessagesAbstractmessageMod.AbstractMessage {
  def this(token: java.lang.String, continuationToken: java.lang.String, metadata: js.Object) = this()
  def this(token: java.lang.String, continuationToken: java.lang.String, metadata: js.Object, registrations: js.Array[twilsockLib.libProtocolInitregistrationMod.InitRegistration]) = this()
  def this(token: java.lang.String, continuationToken: java.lang.String, metadata: js.Object, registrations: js.Array[twilsockLib.libProtocolInitregistrationMod.InitRegistration], tweaks: js.Object) = this()
  val capabilities: js.Array[java.lang.String] = js.native
  val continuation_token: java.lang.String = js.native
  val method: twilsockLib.libProtocolProtocolMod.ProtocolNs.MessageType = js.native
  val registrations: js.Array[twilsockLib.libProtocolInitregistrationMod.InitRegistration] = js.native
  val token: java.lang.String = js.native
}


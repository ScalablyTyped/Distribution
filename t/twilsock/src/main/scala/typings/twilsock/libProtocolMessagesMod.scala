package typings.twilsock

import typings.twilsock.libProtocolInitregistrationMod.InitRegistration
import typings.twilsock.libProtocolMessagesInitReplyMod.ContinuationTokenStatus
import typings.twilsock.libProtocolProtocolMod.Protocol.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages", JSImport.Namespace)
@js.native
object libProtocolMessagesMod extends js.Object {
  @js.native
  class Close ()
    extends typings.twilsock.libProtocolMessagesCloseMod.Close
  
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
  
  @js.native
  class InitReply protected ()
    extends typings.twilsock.libProtocolMessagesInitReplyMod.InitReply {
    def this(
      id: String,
      continuationToken: String,
      continuationTokenStatus: ContinuationTokenStatus,
      offlineStorage: js.Any,
      initRegistrations: js.Any,
      debugInfo: js.Any
    ) = this()
  }
  
  @js.native
  class Message protected ()
    extends typings.twilsock.libProtocolMessagesMessageMod.Message {
    def this(grant: String, contentType: String, request: Request) = this()
  }
  
  @js.native
  class Reply protected ()
    extends typings.twilsock.libProtocolMessagesReplyMod.Reply {
    def this(id: String) = this()
  }
  
  @js.native
  class Update protected ()
    extends typings.twilsock.libProtocolMessagesUpdateMod.Update {
    def this(token: String) = this()
  }
  
}


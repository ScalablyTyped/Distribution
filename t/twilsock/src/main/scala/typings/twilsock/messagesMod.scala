package typings.twilsock

import typings.std.Set
import typings.twilsock.initReplyMod.ContinuationTokenStatus
import typings.twilsock.initregistrationMod.InitRegistration
import typings.twilsock.protocolMod.Protocol.Request
import typings.twilsock.telemetryMod.TelemetryEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("twilsock/lib/protocol/messages", "Close")
  @js.native
  class Close ()
    extends typings.twilsock.closeMod.Close
  
  @JSImport("twilsock/lib/protocol/messages", "Init")
  @js.native
  class Init protected ()
    extends typings.twilsock.initMod.Init {
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
  }
  
  @JSImport("twilsock/lib/protocol/messages", "InitReply")
  @js.native
  class InitReply protected ()
    extends typings.twilsock.initReplyMod.InitReply {
    def this(
      id: String,
      continuationToken: String,
      continuationTokenStatus: ContinuationTokenStatus,
      offlineStorage: js.Any,
      initRegistrations: js.Any,
      debugInfo: js.Any,
      confirmedCapabilities: Set[String]
    ) = this()
  }
  
  @JSImport("twilsock/lib/protocol/messages", "Message")
  @js.native
  class Message protected ()
    extends typings.twilsock.messageMod.Message {
    def this(grant: String, contentType: String, request: Request) = this()
  }
  
  @JSImport("twilsock/lib/protocol/messages", "Reply")
  @js.native
  class Reply protected ()
    extends typings.twilsock.replyMod.Reply {
    def this(id: String) = this()
  }
  
  @JSImport("twilsock/lib/protocol/messages", "Telemetry")
  @js.native
  class Telemetry protected ()
    extends typings.twilsock.telemetryMod.Telemetry {
    def this(events: js.Array[TelemetryEvent]) = this()
  }
  
  @JSImport("twilsock/lib/protocol/messages", "Update")
  @js.native
  class Update protected ()
    extends typings.twilsock.updateMod.Update {
    def this(token: String) = this()
  }
}

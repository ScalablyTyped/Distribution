package typings.twilsock

import typings.twilsock.abstractmessageMod.AbstractMessage
import typings.twilsock.protocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/protocol/messages/telemetry", JSImport.Namespace)
@js.native
object telemetryMod extends js.Object {
  
  @js.native
  class Telemetry protected () extends AbstractMessage {
    def this(events: js.Array[TelemetryEvent]) = this()
    
    var events: js.Array[TelemetryEvent] = js.native
    
    val method: MessageType = js.native
  }
  
  @js.native
  class TelemetryEvent protected () extends js.Object {
    def this(
       // relative to event send time
    start: Double,
       // relative to event send time
    end: Double,
      title: String,
      details: String
    ) = this()
    def this(
       // relative to event send time
    start: Double,
       // relative to event send time
    end: Double,
      title: String,
      details: String,
       // optional, default will be random assigned by backend
    id: String
    ) = this()
    def this(
       // relative to event send time
    start: Double,
       // relative to event send time
    end: Double,
      title: String,
      details: String,
       // optional, default will be random assigned by backend
    id: js.UndefOr[scala.Nothing],
      `type`: String
    ) = this()
    def this(
       // relative to event send time
    start: Double,
       // relative to event send time
    end: Double,
      title: String,
      details: String,
       // optional, default will be random assigned by backend
    id: String,
      `type`: String
    ) = this()
    
    val details: String = js.native
    
    val end: Double = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val start: Double = js.native
    
    val title: String = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
}

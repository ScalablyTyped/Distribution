package typings.twilsock

import typings.twilsock.abstractmessageMod.AbstractMessage
import typings.twilsock.protocolMod.Protocol.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object telemetryMod {
  
  @JSImport("twilsock/lib/protocol/messages/telemetry", "Telemetry")
  @js.native
  class Telemetry protected () extends AbstractMessage {
    def this(events: js.Array[TelemetryEvent]) = this()
    
    var events: js.Array[TelemetryEvent] = js.native
    
    val method: MessageType = js.native
  }
  
  @JSImport("twilsock/lib/protocol/messages/telemetry", "TelemetryEvent")
  @js.native
  class TelemetryEvent protected () extends StObject {
    def this(
      start: Double,
      // relative to event send time
    end: Double,
      // relative to event send time
    title: String,
      details: String
    ) = this()
    def this(
      start: Double,
      // relative to event send time
    end: Double,
      // relative to event send time
    title: String,
      details: String,
      id: String
    ) = this()
    def this(
      start: Double,
      // relative to event send time
    end: Double,
      // relative to event send time
    title: String,
      details: String,
      id: js.UndefOr[scala.Nothing],
      // optional, default will be random assigned by backend
    `type`: String
    ) = this()
    def this(
      start: Double,
      // relative to event send time
    end: Double,
      // relative to event send time
    title: String,
      details: String,
      id: String,
      // optional, default will be random assigned by backend
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

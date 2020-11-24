package typings.twilsock

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import typings.twilsock.configurationMod.Configuration
import typings.twilsock.packetinterfaceMod.PacketInterface
import typings.twilsock.telemetryMod.TelemetryEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/services/telemetrytracker", JSImport.Namespace)
@js.native
object telemetrytrackerMod extends js.Object {
  
  @js.native
  sealed trait EventSendingLimitation extends js.Object
  @js.native
  object EventSendingLimitation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventSendingLimitation with Double] = js.native
    
    @js.native
    sealed trait AnyEvents extends EventSendingLimitation
    /* 1 */ @js.native
    object AnyEvents extends TopLevel[AnyEvents with Double]
    
    @js.native
    sealed trait AnyEventsIncludingUnfinished extends EventSendingLimitation
    /* 2 */ @js.native
    object AnyEventsIncludingUnfinished extends TopLevel[AnyEventsIncludingUnfinished with Double]
    
    @js.native
    sealed trait MinEventsPortion extends EventSendingLimitation
    /* 0 */ @js.native
    object MinEventsPortion extends TopLevel[MinEventsPortion with Double]
  }
  
  @js.native
  class TelemetryEventDescription protected () extends js.Object {
    def this(title: String, details: String, start: Date) = this()
    def this(title: String, details: String, start: Date, end: Date) = this()
    def this(title: String, details: String, start: Date, end: js.UndefOr[scala.Nothing], `type`: String) = this()
    def this(title: String, details: String, start: Date, end: Date, `type`: String) = this()
    def this(
      title: String,
      details: String,
      start: Date,
      end: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      id: String
    ) = this()
    def this(
      title: String,
      details: String,
      start: Date,
      end: js.UndefOr[scala.Nothing],
      `type`: String,
      id: String
    ) = this()
    def this(
      title: String,
      details: String,
      start: Date,
      end: Date,
      `type`: js.UndefOr[scala.Nothing],
      id: String
    ) = this()
    def this(title: String, details: String, start: Date, end: Date, `type`: String, id: String) = this()
    
    val details: String = js.native
    
    var end: Date = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val start: Date = js.native
    
    val title: String = js.native
    
    def toTelemetryEvent(): TelemetryEvent = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
  
  @js.native
  sealed trait TelemetryPoint extends js.Object
  @js.native
  object TelemetryPoint extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TelemetryPoint with Double] = js.native
    
    @js.native
    sealed trait End extends TelemetryPoint
    /* 1 */ @js.native
    object End extends TopLevel[End with Double]
    
    @js.native
    sealed trait Start extends TelemetryPoint
    /* 0 */ @js.native
    object Start extends TopLevel[Start with Double]
  }
  
  @js.native
  class TelemetryTracker protected () extends js.Object {
    def this(config: Configuration, packetInterface: PacketInterface) = this()
    
    var _canSendTelemetry: js.Any = js.native
    
    def addPartialEvent(incompleteEvent: TelemetryEventDescription, eventKey: String, point: TelemetryPoint): Unit = js.native
    
    def addTelemetryEvent(event: TelemetryEventDescription): Unit = js.native
    
    def canSendTelemetry: Boolean = js.native
    def canSendTelemetry_=(enable: Boolean): Unit = js.native
    
    val config: js.Any = js.native
    
    var getTelemetryPortion: js.Any = js.native
    
    def getTelemetryToSend(sendingLimit: EventSendingLimitation): js.Array[TelemetryEventDescription] = js.native
    
    var hasInitializationFinished: js.Any = js.native
    
    def isTelemetryEnabled: Boolean = js.native
    
    val maxEventsPortionToSend: js.Any = js.native
    
    var merge: js.Any = js.native
    
    val minEventsPortionToSend: js.Any = js.native
    
    val packetInterface: js.Any = js.native
    
    var pendingEvents: js.Any = js.native
    
    var readyEvents: js.Any = js.native
    
    def sendTelemetry(limit: EventSendingLimitation): Unit = js.native
    
    def sendTelemetryIfMinimalPortionCollected(): Unit = js.native
  }
}

package typings.twilsock

import typings.std.Date
import typings.twilsock.configurationMod.Configuration
import typings.twilsock.packetinterfaceMod.PacketInterface
import typings.twilsock.telemetryMod.TelemetryEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object telemetrytrackerMod {
  
  @js.native
  sealed trait EventSendingLimitation extends StObject
  @JSImport("twilsock/lib/services/telemetrytracker", "EventSendingLimitation")
  @js.native
  object EventSendingLimitation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventSendingLimitation & Double] = js.native
    
    @js.native
    sealed trait AnyEvents
      extends StObject
         with EventSendingLimitation
    /* 1 */ val AnyEvents: typings.twilsock.telemetrytrackerMod.EventSendingLimitation.AnyEvents & Double = js.native
    
    @js.native
    sealed trait AnyEventsIncludingUnfinished
      extends StObject
         with EventSendingLimitation
    /* 2 */ val AnyEventsIncludingUnfinished: typings.twilsock.telemetrytrackerMod.EventSendingLimitation.AnyEventsIncludingUnfinished & Double = js.native
    
    @js.native
    sealed trait MinEventsPortion
      extends StObject
         with EventSendingLimitation
    /* 0 */ val MinEventsPortion: typings.twilsock.telemetrytrackerMod.EventSendingLimitation.MinEventsPortion & Double = js.native
  }
  
  @JSImport("twilsock/lib/services/telemetrytracker", "TelemetryEventDescription")
  @js.native
  class TelemetryEventDescription protected () extends StObject {
    def this(title: String, details: String, start: Date) = this()
    def this(title: String, details: String, start: Date, end: Date) = this()
    def this(title: String, details: String, start: Date, end: Unit, `type`: String) = this()
    def this(title: String, details: String, start: Date, end: Date, `type`: String) = this()
    def this(title: String, details: String, start: Date, end: Unit, `type`: String, id: String) = this()
    def this(title: String, details: String, start: Date, end: Unit, `type`: Unit, id: String) = this()
    def this(title: String, details: String, start: Date, end: Date, `type`: String, id: String) = this()
    def this(title: String, details: String, start: Date, end: Date, `type`: Unit, id: String) = this()
    
    val details: String = js.native
    
    var end: Date = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val start: Date = js.native
    
    val title: String = js.native
    
    def toTelemetryEvent(): TelemetryEvent = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
  
  @js.native
  sealed trait TelemetryPoint extends StObject
  @JSImport("twilsock/lib/services/telemetrytracker", "TelemetryPoint")
  @js.native
  object TelemetryPoint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TelemetryPoint & Double] = js.native
    
    @js.native
    sealed trait End
      extends StObject
         with TelemetryPoint
    /* 1 */ val End: typings.twilsock.telemetrytrackerMod.TelemetryPoint.End & Double = js.native
    
    @js.native
    sealed trait Start
      extends StObject
         with TelemetryPoint
    /* 0 */ val Start: typings.twilsock.telemetrytrackerMod.TelemetryPoint.Start & Double = js.native
  }
  
  @JSImport("twilsock/lib/services/telemetrytracker", "TelemetryTracker")
  @js.native
  class TelemetryTracker protected () extends StObject {
    def this(config: Configuration, packetInterface: PacketInterface) = this()
    
    /* private */ var _canSendTelemetry: js.Any = js.native
    
    def addPartialEvent(incompleteEvent: TelemetryEventDescription, eventKey: String, point: TelemetryPoint): Unit = js.native
    
    def addTelemetryEvent(event: TelemetryEventDescription): Unit = js.native
    
    def canSendTelemetry: Boolean = js.native
    def canSendTelemetry_=(enable: Boolean): Unit = js.native
    
    /* private */ val config: js.Any = js.native
    
    /* private */ var getTelemetryPortion: js.Any = js.native
    
    def getTelemetryToSend(sendingLimit: EventSendingLimitation): js.Array[TelemetryEventDescription] = js.native
    
    /* private */ var hasInitializationFinished: js.Any = js.native
    
    def isTelemetryEnabled: Boolean = js.native
    
    /* private */ val maxEventsPortionToSend: js.Any = js.native
    
    /* private */ var merge: js.Any = js.native
    
    /* private */ val minEventsPortionToSend: js.Any = js.native
    
    /* private */ val packetInterface: js.Any = js.native
    
    /* private */ var pendingEvents: js.Any = js.native
    
    /* private */ var readyEvents: js.Any = js.native
    
    def sendTelemetry(limit: EventSendingLimitation): Unit = js.native
    
    def sendTelemetryIfMinimalPortionCollected(): Unit = js.native
  }
}

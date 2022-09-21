package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock", "TelemetryTracker")
@js.native
open class TelemetryTracker protected () extends StObject {
  def this(config: Configuration, packetInterface: PacketInterface) = this()
  
  /* private */ var _canSendTelemetry: Any = js.native
  
  // Add incomplete event (with either starting or ending time point)
  def addPartialEvent(incompleteEvent: TelemetryEventDescription, eventKey: String, point: TelemetryPoint): Unit = js.native
  
  // Add complete event
  def addTelemetryEvent(event: TelemetryEventDescription): Unit = js.native
  
  def canSendTelemetry: Boolean = js.native
  def canSendTelemetry_=(enable: Boolean): Unit = js.native
  
  /* private */ val config: Any = js.native
  
  /* private */ var getTelemetryPortion: Any = js.native
  
  def getTelemetryToSend(sendingLimit: EventSendingLimitation): js.Array[TelemetryEventDescription] = js.native
  
  // events ready to send
  /* private */ var hasInitializationFinished: Any = js.native
  
  // Keeping this private prevents the type declaration from being generated properly.
  // Ideally, this should be private.
  def isTelemetryEnabled: Boolean = js.native
  
  // max events batch size to be sent in a single Telemetry message
  /* private */ val maxEventsPortionToSend: Any = js.native
  
  // Merging 2 partial events:
  //   use start.startTime & end.endTime.
  // For other fields,
  //   if there are values in end, use them,
  //   else use values from start.
  /* private */ var merge: Any = js.native
  
  // accumulated events count that is big enough to be sent out of schedule (not on timer but on new event registration)
  /* private */ val minEventsPortionToSend: Any = js.native
  
  // to check confirmed capabilities
  /* private */ val packetInterface: Any = js.native
  
  /* private */ var pendingEvents: Any = js.native
  
  // started events: have TelemetryEvent::startTime only
  /* private */ var readyEvents: Any = js.native
  
  // NB: getTelemetryToSend will return non-empty array only if we have already received initReply
  // and telemetry.v1 capability is enabled there.
  def sendTelemetry(limit: EventSendingLimitation): Unit = js.native
  
  def sendTelemetryIfMinimalPortionCollected(): Unit = js.native
}

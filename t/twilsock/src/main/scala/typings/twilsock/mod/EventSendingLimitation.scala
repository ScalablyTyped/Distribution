package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventSendingLimitation extends StObject
@JSImport("twilsock", "EventSendingLimitation")
@js.native
object EventSendingLimitation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventSendingLimitation & Double] = js.native
  
  // check for minimal amount of telemetry events, skip sending if less than 100 events are ready to send
  @js.native
  sealed trait AnyEvents
    extends StObject
       with EventSendingLimitation
  /* 1 */ val AnyEvents: typings.twilsock.mod.EventSendingLimitation.AnyEvents & Double = js.native
  
  // send all collected events, do not check for count, skip sending only if no events are ready to send
  @js.native
  sealed trait AnyEventsIncludingUnfinished
    extends StObject
       with EventSendingLimitation
  /* 2 */ val AnyEventsIncludingUnfinished: typings.twilsock.mod.EventSendingLimitation.AnyEventsIncludingUnfinished & Double = js.native
  
  @js.native
  sealed trait MinEventsPortion
    extends StObject
       with EventSendingLimitation
  /* 0 */ val MinEventsPortion: typings.twilsock.mod.EventSendingLimitation.MinEventsPortion & Double = js.native
}

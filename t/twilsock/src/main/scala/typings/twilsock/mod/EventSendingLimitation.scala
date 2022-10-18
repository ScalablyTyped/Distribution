package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventSendingLimitation extends StObject
@JSImport("twilsock", "EventSendingLimitation")
@js.native
object EventSendingLimitation extends StObject {
  
  // check for minimal amount of telemetry events, skip sending if less than 100 events are ready to send
  @js.native
  sealed trait AnyEvents
    extends StObject
       with EventSendingLimitation
  
  // send all collected events, do not check for count, skip sending only if no events are ready to send
  @js.native
  sealed trait AnyEventsIncludingUnfinished
    extends StObject
       with EventSendingLimitation
  
  @js.native
  sealed trait MinEventsPortion
    extends StObject
       with EventSendingLimitation
}

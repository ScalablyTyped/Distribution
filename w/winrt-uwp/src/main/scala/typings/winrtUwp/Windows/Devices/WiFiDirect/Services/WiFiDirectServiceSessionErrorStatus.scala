package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectServiceSessionErrorStatus extends StObject
/** Values used in the WiFiDirectServiceSession.ErrorStatus property. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus")
@js.native
object WiFiDirectServiceSessionErrorStatus extends StObject {
  
  /** The L2 connection was disassociated unexpectedly. */
  @js.native
  sealed trait disassociated
    extends StObject
       with WiFiDirectServiceSessionErrorStatus
  
  /** The session was closed from the local side of the session. */
  @js.native
  sealed trait localClose
    extends StObject
       with WiFiDirectServiceSessionErrorStatus
  
  /** Session timed out due to no response from the remote side of the session. */
  @js.native
  sealed trait noResponseFromRemote
    extends StObject
       with WiFiDirectServiceSessionErrorStatus
  
  /** Session status is OK. */
  @js.native
  sealed trait ok
    extends StObject
       with WiFiDirectServiceSessionErrorStatus
  
  /** The session was closed from the remote side of the session. */
  @js.native
  sealed trait remoteClose
    extends StObject
       with WiFiDirectServiceSessionErrorStatus
  
  /** A general system failure has occurred. */
  @js.native
  sealed trait systemFailure
    extends StObject
       with WiFiDirectServiceSessionErrorStatus
}

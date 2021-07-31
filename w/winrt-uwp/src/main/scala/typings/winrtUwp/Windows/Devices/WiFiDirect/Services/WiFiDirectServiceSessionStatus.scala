package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectServiceSessionStatus extends StObject
/** Values used to describe the status of a Wi-Fi Direct Service Session. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus")
@js.native
object WiFiDirectServiceSessionStatus extends StObject {
  
  /** The session has been closed. */
  @js.native
  sealed trait closed
    extends StObject
       with WiFiDirectServiceSessionStatus
  
  /** The session has been initiated. */
  @js.native
  sealed trait initiated
    extends StObject
       with WiFiDirectServiceSessionStatus
  
  /** The session is open. */
  @js.native
  sealed trait open
    extends StObject
       with WiFiDirectServiceSessionStatus
  
  /** A session has been requested. */
  @js.native
  sealed trait requested
    extends StObject
       with WiFiDirectServiceSessionStatus
}

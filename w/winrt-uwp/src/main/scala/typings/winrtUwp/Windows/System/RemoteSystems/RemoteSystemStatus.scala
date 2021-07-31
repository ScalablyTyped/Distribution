package typings.winrtUwp.Windows.System.RemoteSystems

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RemoteSystemStatus extends StObject
/** Contains the values that describe a remote system's availability status. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatus")
@js.native
object RemoteSystemStatus extends StObject {
  
  /** The remote system is available. */
  @js.native
  sealed trait available
    extends StObject
       with RemoteSystemStatus
  
  /** The availability of the remote system is currently being discovered. */
  @js.native
  sealed trait discoveringAvailability
    extends StObject
       with RemoteSystemStatus
  
  /** The remote system is unavailable. */
  @js.native
  sealed trait unavailable
    extends StObject
       with RemoteSystemStatus
  
  /** The availability of the remote system is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with RemoteSystemStatus
}

package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoamingStates extends StObject
/** Defines the roaming states. */
@JSGlobal("Windows.Networking.Connectivity.RoamingStates")
@js.native
object RoamingStates extends StObject {
  
  /** No roaming information. */
  @js.native
  sealed trait none
    extends StObject
       with RoamingStates
  
  /** The connection is not currently roaming. */
  @js.native
  sealed trait notRoaming
    extends StObject
       with RoamingStates
  
  /** The connection is currently roaming. */
  @js.native
  sealed trait roaming
    extends StObject
       with RoamingStates
}

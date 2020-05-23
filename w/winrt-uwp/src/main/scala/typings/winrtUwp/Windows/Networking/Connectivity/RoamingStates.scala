package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoamingStates extends js.Object

/** Defines the roaming states. */
@JSGlobal("Windows.Networking.Connectivity.RoamingStates")
@js.native
object RoamingStates extends js.Object {
  /** No roaming information. */
  @js.native
  sealed trait none extends RoamingStates
  
  /** The connection is not currently roaming. */
  @js.native
  sealed trait notRoaming extends RoamingStates
  
  /** The connection is currently roaming. */
  @js.native
  sealed trait roaming extends RoamingStates
  
}


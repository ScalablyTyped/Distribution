package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoamingStates extends js.Object

@JSGlobal("Windows.Networking.Connectivity.RoamingStates")
@js.native
object RoamingStates extends js.Object {
  @js.native
  sealed trait none extends RoamingStates
  
  @js.native
  sealed trait notRoaming extends RoamingStates
  
  @js.native
  sealed trait roaming extends RoamingStates
  
  /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.RoamingStates.none with Double = js.native
  /* 1 */ val notRoaming: typings.winrt.Windows.Networking.Connectivity.RoamingStates.notRoaming with Double = js.native
  /* 2 */ val roaming: typings.winrt.Windows.Networking.Connectivity.RoamingStates.roaming with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoamingStates with Double] = js.native
}


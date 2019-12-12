package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Connectivity.RoamingStates.none
import typings.winrt.Windows.Networking.Connectivity.RoamingStates.notRoaming
import typings.winrt.Windows.Networking.Connectivity.RoamingStates.roaming
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoamingStates with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object notRoaming extends TopLevel[notRoaming with Double]
  
  /* 2 */ @js.native
  object roaming extends TopLevel[roaming with Double]
  
}


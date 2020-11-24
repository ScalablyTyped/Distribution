package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

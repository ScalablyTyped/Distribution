package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoamingStates extends StObject
@JSGlobal("Windows.Networking.Connectivity.RoamingStates")
@js.native
object RoamingStates extends StObject {
  
  @js.native
  sealed trait none
    extends StObject
       with RoamingStates
  
  @js.native
  sealed trait notRoaming
    extends StObject
       with RoamingStates
  
  @js.native
  sealed trait roaming
    extends StObject
       with RoamingStates
}

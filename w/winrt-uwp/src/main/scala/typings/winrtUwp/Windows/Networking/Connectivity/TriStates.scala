package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TriStates extends StObject
/** Used with the NetworkUsageStates structure to define the desired roaming state and shared state of a network connection. */
@JSGlobal("Windows.Networking.Connectivity.TriStates")
@js.native
object TriStates extends StObject {
  
  /** Used when the corresponding state should not be used as a filter, e.g., both yes and no. */
  @js.native
  sealed trait doNotCare
    extends StObject
       with TriStates
  
  /** The corresponding state is not set. */
  @js.native
  sealed trait no
    extends StObject
       with TriStates
  
  /** The corresponding state is set. */
  @js.native
  sealed trait yes
    extends StObject
       with TriStates
}

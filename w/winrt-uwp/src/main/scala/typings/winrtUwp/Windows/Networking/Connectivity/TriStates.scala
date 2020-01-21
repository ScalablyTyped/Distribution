package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriStates extends js.Object

/** Used with the NetworkUsageStates structure to define the desired roaming state and shared state of a network connection. */
@JSGlobal("Windows.Networking.Connectivity.TriStates")
@js.native
object TriStates extends js.Object {
  /** Used when the corresponding state should not be used as a filter, e.g., both yes and no. */
  @js.native
  sealed trait doNotCare extends TriStates
  
  /** The corresponding state is not set. */
  @js.native
  sealed trait no extends TriStates
  
  /** The corresponding state is set. */
  @js.native
  sealed trait yes extends TriStates
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TriStates with Double] = js.native
  /* 0 */ @js.native
  object doNotCare extends TopLevel[doNotCare with Double]
  
  /* 1 */ @js.native
  object no extends TopLevel[no with Double]
  
  /* 2 */ @js.native
  object yes extends TopLevel[yes with Double]
  
}


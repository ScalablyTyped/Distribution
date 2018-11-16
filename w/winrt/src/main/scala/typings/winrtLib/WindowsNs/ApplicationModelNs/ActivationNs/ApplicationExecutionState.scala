package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationExecutionState extends js.Object

@JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
@js.native
object ApplicationExecutionState extends js.Object {
  @js.native
  sealed trait closedByUser
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  @js.native
  sealed trait notRunning
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  @js.native
  sealed trait running
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  @js.native
  sealed trait suspended
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  @js.native
  sealed trait terminated
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  val closedByUser: closedByUser with java.lang.String = js.native
  val notRunning: notRunning with java.lang.String = js.native
  val running: running with java.lang.String = js.native
  val suspended: suspended with java.lang.String = js.native
  val terminated: terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState with java.lang.String
  ] = js.native
}


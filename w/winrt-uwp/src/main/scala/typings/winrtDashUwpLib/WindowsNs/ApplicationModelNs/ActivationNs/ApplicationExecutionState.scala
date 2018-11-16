package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationExecutionState extends js.Object

/** Specifies the execution state of the app. */
@JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
@js.native
object ApplicationExecutionState extends js.Object {
  /** The app was closed by the user. */
  @js.native
  sealed trait closedByUser
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /** The app is not running. */
  @js.native
  sealed trait notRunning
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /** The app is running. */
  @js.native
  sealed trait running
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /** The app is suspended. */
  @js.native
  sealed trait suspended
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /** The app was terminated after being suspended. */
  @js.native
  sealed trait terminated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  val closedByUser: closedByUser with java.lang.String = js.native
  val notRunning: notRunning with java.lang.String = js.native
  val running: running with java.lang.String = js.native
  val suspended: suspended with java.lang.String = js.native
  val terminated: terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState with java.lang.String
  ] = js.native
}


package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentProgressState extends js.Object

/** Represents the state of a deployment request. */
@JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
@js.native
object DeploymentProgressState extends js.Object {
  /** The deployment request is being processed. */
  @js.native
  sealed trait processing
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState
  
  /** The deployment request is queued. */
  @js.native
  sealed trait queued
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState
  
  /* 1 */ val processing: processing with scala.Double = js.native
  /* 0 */ val queued: queued with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState with scala.Double
  ] = js.native
}


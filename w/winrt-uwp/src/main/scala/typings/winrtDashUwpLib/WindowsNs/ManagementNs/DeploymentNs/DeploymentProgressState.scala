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
  
  val processing: processing with java.lang.String = js.native
  val queued: queued with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState with java.lang.String
  ] = js.native
}


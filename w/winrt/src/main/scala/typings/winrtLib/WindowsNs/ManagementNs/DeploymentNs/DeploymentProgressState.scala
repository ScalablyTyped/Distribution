package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentProgressState extends js.Object

@JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
@js.native
object DeploymentProgressState extends js.Object {
  @js.native
  sealed trait processing
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState
  
  @js.native
  sealed trait queued
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState
  
  /* 1 */ val processing: processing with scala.Double = js.native
  /* 0 */ val queued: queued with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState with scala.Double
  ] = js.native
}


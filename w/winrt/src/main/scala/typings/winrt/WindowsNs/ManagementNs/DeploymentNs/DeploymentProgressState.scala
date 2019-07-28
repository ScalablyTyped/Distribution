package typings.winrt.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentProgressState extends js.Object

@JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
@js.native
object DeploymentProgressState extends js.Object {
  @js.native
  sealed trait processing extends DeploymentProgressState
  
  @js.native
  sealed trait queued extends DeploymentProgressState
  
  /* 1 */ val processing: typings.winrt.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState.processing with Double = js.native
  /* 0 */ val queued: typings.winrt.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState.queued with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentProgressState with Double] = js.native
}


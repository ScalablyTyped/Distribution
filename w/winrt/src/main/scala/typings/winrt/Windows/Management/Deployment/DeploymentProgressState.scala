package typings.winrt.Windows.Management.Deployment

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
  
  /* 1 */ val processing: typings.winrt.Windows.Management.Deployment.DeploymentProgressState.processing with Double = js.native
  /* 0 */ val queued: typings.winrt.Windows.Management.Deployment.DeploymentProgressState.queued with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentProgressState with Double] = js.native
}


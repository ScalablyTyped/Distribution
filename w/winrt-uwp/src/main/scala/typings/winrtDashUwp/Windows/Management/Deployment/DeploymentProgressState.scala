package typings.winrtDashUwp.Windows.Management.Deployment

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
  sealed trait processing extends DeploymentProgressState
  
  /** The deployment request is queued. */
  @js.native
  sealed trait queued extends DeploymentProgressState
  
  /* 1 */ val processing: typings.winrtDashUwp.Windows.Management.Deployment.DeploymentProgressState.processing with Double = js.native
  /* 0 */ val queued: typings.winrtDashUwp.Windows.Management.Deployment.DeploymentProgressState.queued with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentProgressState with Double] = js.native
}


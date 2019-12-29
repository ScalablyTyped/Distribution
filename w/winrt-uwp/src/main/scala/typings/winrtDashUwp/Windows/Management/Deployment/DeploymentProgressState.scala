package typings.winrtDashUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentProgressState with Double] = js.native
  /* 1 */ @js.native
  object processing extends TopLevel[processing with Double]
  
  /* 0 */ @js.native
  object queued extends TopLevel[queued with Double]
  
}


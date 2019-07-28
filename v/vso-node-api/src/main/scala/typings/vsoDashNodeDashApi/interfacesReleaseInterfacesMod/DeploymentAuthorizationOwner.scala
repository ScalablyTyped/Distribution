package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentAuthorizationOwner extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentAuthorizationOwner")
@js.native
object DeploymentAuthorizationOwner extends js.Object {
  @js.native
  sealed trait Automatic extends DeploymentAuthorizationOwner
  
  @js.native
  sealed trait DeploymentSubmitter extends DeploymentAuthorizationOwner
  
  @js.native
  sealed trait FirstPreDeploymentApprover extends DeploymentAuthorizationOwner
  
  /* 0 */ val Automatic: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner.Automatic with Double = js.native
  /* 1 */ val DeploymentSubmitter: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner.DeploymentSubmitter with Double = js.native
  /* 2 */ val FirstPreDeploymentApprover: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner.FirstPreDeploymentApprover with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentAuthorizationOwner with Double] = js.native
}


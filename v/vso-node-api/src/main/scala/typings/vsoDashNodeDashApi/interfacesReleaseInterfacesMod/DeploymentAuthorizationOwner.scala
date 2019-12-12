package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner.Automatic
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner.DeploymentSubmitter
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner.FirstPreDeploymentApprover
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentAuthorizationOwner with Double] = js.native
  /* 0 */ @js.native
  object Automatic extends TopLevel[Automatic with Double]
  
  /* 1 */ @js.native
  object DeploymentSubmitter extends TopLevel[DeploymentSubmitter with Double]
  
  /* 2 */ @js.native
  object FirstPreDeploymentApprover extends TopLevel[FirstPreDeploymentApprover with Double]
  
}


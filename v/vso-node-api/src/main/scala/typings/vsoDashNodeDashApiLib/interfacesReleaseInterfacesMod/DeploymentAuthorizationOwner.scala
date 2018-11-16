package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentAuthorizationOwner extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentAuthorizationOwner")
@js.native
object DeploymentAuthorizationOwner extends js.Object {
  @js.native
  sealed trait Automatic
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner
  
  @js.native
  sealed trait DeploymentSubmitter
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner
  
  @js.native
  sealed trait FirstPreDeploymentApprover
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner
  
  /* 0 */ val Automatic: Automatic with scala.Double = js.native
  /* 1 */ val DeploymentSubmitter: DeploymentSubmitter with scala.Double = js.native
  /* 2 */ val FirstPreDeploymentApprover: FirstPreDeploymentApprover with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentAuthorizationOwner with scala.Double
  ] = js.native
}


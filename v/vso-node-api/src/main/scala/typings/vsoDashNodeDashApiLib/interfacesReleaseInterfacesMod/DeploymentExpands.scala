package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentExpands extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentExpands")
@js.native
object DeploymentExpands extends js.Object {
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentExpands
  
  @js.native
  sealed trait Approvals
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentExpands
  
  @js.native
  sealed trait Artifacts
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentExpands
  
  @js.native
  sealed trait DeploymentOnly
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentExpands
  
  /* 0 */ val All: All with scala.Double = js.native
  /* 2 */ val Approvals: Approvals with scala.Double = js.native
  /* 4 */ val Artifacts: Artifacts with scala.Double = js.native
  /* 1 */ val DeploymentOnly: DeploymentOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentExpands with scala.Double
  ] = js.native
}


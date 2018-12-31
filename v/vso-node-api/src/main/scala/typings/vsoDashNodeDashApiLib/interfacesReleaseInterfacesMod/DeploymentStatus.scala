package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentStatus")
@js.native
object DeploymentStatus extends js.Object {
  /**
    * The deployment status is all.
    */
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus
  
  /**
    * The deployment status is failed.
    */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus
  
  /**
    * The deployment status is inprogress.
    */
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus
  
  /**
    * The deployment status is not deployed.
    */
  @js.native
  sealed trait NotDeployed
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus
  
  /**
    * The deployment status is partiallysucceeded.
    */
  @js.native
  sealed trait PartiallySucceeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus
  
  /**
    * The deployment status is succeeded.
    */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus
  
  /**
    * The deployment status is undefined.
    */
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus
  
  /* 31 */ val All: All with scala.Double = js.native
  /* 16 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 1 */ val NotDeployed: NotDeployed with scala.Double = js.native
  /* 8 */ val PartiallySucceeded: PartiallySucceeded with scala.Double = js.native
  /* 4 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus with scala.Double
  ] = js.native
}


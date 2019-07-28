package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
  sealed trait All extends DeploymentStatus
  
  /**
    * The deployment status is failed.
    */
  @js.native
  sealed trait Failed extends DeploymentStatus
  
  /**
    * The deployment status is inprogress.
    */
  @js.native
  sealed trait InProgress extends DeploymentStatus
  
  /**
    * The deployment status is not deployed.
    */
  @js.native
  sealed trait NotDeployed extends DeploymentStatus
  
  /**
    * The deployment status is partiallysucceeded.
    */
  @js.native
  sealed trait PartiallySucceeded extends DeploymentStatus
  
  /**
    * The deployment status is succeeded.
    */
  @js.native
  sealed trait Succeeded extends DeploymentStatus
  
  /**
    * The deployment status is undefined.
    */
  @js.native
  sealed trait Undefined extends DeploymentStatus
  
  /* 31 */ val All: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.All with Double = js.native
  /* 16 */ val Failed: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.Failed with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.InProgress with Double = js.native
  /* 1 */ val NotDeployed: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.NotDeployed with Double = js.native
  /* 8 */ val PartiallySucceeded: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.PartiallySucceeded with Double = js.native
  /* 4 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.Succeeded with Double = js.native
  /* 0 */ val Undefined: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentStatus.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentStatus with Double] = js.native
}


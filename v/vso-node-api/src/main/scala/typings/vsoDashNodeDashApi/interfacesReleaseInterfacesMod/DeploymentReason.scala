package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentReason extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentReason")
@js.native
object DeploymentReason extends js.Object {
  /**
    * The deployment reason is automated.
    */
  @js.native
  sealed trait Automated extends DeploymentReason
  
  /**
    * The deployment reason is manual.
    */
  @js.native
  sealed trait Manual extends DeploymentReason
  
  /**
    * The deployment reason is none.
    */
  @js.native
  sealed trait None extends DeploymentReason
  
  /**
    * The deployment reason is scheduled.
    */
  @js.native
  sealed trait Scheduled extends DeploymentReason
  
  /* 2 */ val Automated: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentReason.Automated with Double = js.native
  /* 1 */ val Manual: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentReason.Manual with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentReason.None with Double = js.native
  /* 4 */ val Scheduled: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeploymentReason.Scheduled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentReason with Double] = js.native
}


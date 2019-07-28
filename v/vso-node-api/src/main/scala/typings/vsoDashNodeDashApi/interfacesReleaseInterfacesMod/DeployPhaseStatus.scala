package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeployPhaseStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseStatus")
@js.native
object DeployPhaseStatus extends js.Object {
  @js.native
  sealed trait Canceled extends DeployPhaseStatus
  
  @js.native
  sealed trait Cancelling extends DeployPhaseStatus
  
  @js.native
  sealed trait Failed extends DeployPhaseStatus
  
  @js.native
  sealed trait InProgress extends DeployPhaseStatus
  
  @js.native
  sealed trait NotStarted extends DeployPhaseStatus
  
  @js.native
  sealed trait PartiallySucceeded extends DeployPhaseStatus
  
  @js.native
  sealed trait Skipped extends DeployPhaseStatus
  
  @js.native
  sealed trait Succeeded extends DeployPhaseStatus
  
  @js.native
  sealed trait Undefined extends DeployPhaseStatus
  
  /* 32 */ val Canceled: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Canceled with Double = js.native
  /* 128 */ val Cancelling: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Cancelling with Double = js.native
  /* 16 */ val Failed: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Failed with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.InProgress with Double = js.native
  /* 1 */ val NotStarted: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.NotStarted with Double = js.native
  /* 4 */ val PartiallySucceeded: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.PartiallySucceeded with Double = js.native
  /* 64 */ val Skipped: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Skipped with Double = js.native
  /* 8 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Succeeded with Double = js.native
  /* 0 */ val Undefined: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseStatus with Double] = js.native
}


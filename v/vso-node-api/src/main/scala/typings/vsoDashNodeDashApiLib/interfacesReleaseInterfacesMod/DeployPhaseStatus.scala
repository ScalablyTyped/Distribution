package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeployPhaseStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseStatus")
@js.native
object DeployPhaseStatus extends js.Object {
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  @js.native
  sealed trait Cancelling
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  @js.native
  sealed trait NotStarted
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  @js.native
  sealed trait PartiallySucceeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  @js.native
  sealed trait Skipped
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus
  
  /* 32 */ val Canceled: Canceled with scala.Double = js.native
  /* 128 */ val Cancelling: Cancelling with scala.Double = js.native
  /* 16 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 1 */ val NotStarted: NotStarted with scala.Double = js.native
  /* 4 */ val PartiallySucceeded: PartiallySucceeded with scala.Double = js.native
  /* 64 */ val Skipped: Skipped with scala.Double = js.native
  /* 8 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeployPhaseStatus with scala.Double
  ] = js.native
}


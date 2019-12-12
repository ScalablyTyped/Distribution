package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Canceled
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Cancelling
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Failed
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.InProgress
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.NotStarted
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.PartiallySucceeded
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Skipped
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Succeeded
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Undefined
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseStatus with Double] = js.native
  /* 32 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 128 */ @js.native
  object Cancelling extends TopLevel[Cancelling with Double]
  
  /* 16 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 1 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  /* 4 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  /* 64 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
  /* 8 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}


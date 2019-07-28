package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TaskStatus")
@js.native
object TaskStatus extends js.Object {
  @js.native
  sealed trait Canceled extends TaskStatus
  
  @js.native
  sealed trait Failed extends TaskStatus
  
  @js.native
  sealed trait Failure extends TaskStatus
  
  @js.native
  sealed trait InProgress extends TaskStatus
  
  @js.native
  sealed trait PartiallySucceeded extends TaskStatus
  
  @js.native
  sealed trait Pending extends TaskStatus
  
  @js.native
  sealed trait Skipped extends TaskStatus
  
  @js.native
  sealed trait Succeeded extends TaskStatus
  
  @js.native
  sealed trait Success extends TaskStatus
  
  @js.native
  sealed trait Unknown extends TaskStatus
  
  /* 5 */ val Canceled: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Canceled with Double = js.native
  /* 8 */ val Failed: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Failed with Double = js.native
  /* 4 */ val Failure: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Failure with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.InProgress with Double = js.native
  /* 9 */ val PartiallySucceeded: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.PartiallySucceeded with Double = js.native
  /* 1 */ val Pending: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Pending with Double = js.native
  /* 6 */ val Skipped: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Skipped with Double = js.native
  /* 7 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Succeeded with Double = js.native
  /* 3 */ val Success: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Success with Double = js.native
  /* 0 */ val Unknown: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus with Double] = js.native
}


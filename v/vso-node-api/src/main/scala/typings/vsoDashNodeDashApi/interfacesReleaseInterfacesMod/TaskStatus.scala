package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Canceled
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Failed
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Failure
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.InProgress
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.PartiallySucceeded
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Pending
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Skipped
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Succeeded
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Success
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.TaskStatus.Unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus with Double] = js.native
  /* 5 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 8 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 4 */ @js.native
  object Failure extends TopLevel[Failure with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 9 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 6 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
  /* 7 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 3 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}


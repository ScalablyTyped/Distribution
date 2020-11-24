package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskStatus extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TaskStatus")
@js.native
object TaskStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus with Double] = js.native
  
  @js.native
  sealed trait Canceled extends TaskStatus
  /* 5 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  @js.native
  sealed trait Failed extends TaskStatus
  /* 8 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  @js.native
  sealed trait Failure extends TaskStatus
  /* 4 */ @js.native
  object Failure extends TopLevel[Failure with Double]
  
  @js.native
  sealed trait InProgress extends TaskStatus
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait PartiallySucceeded extends TaskStatus
  /* 9 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  @js.native
  sealed trait Pending extends TaskStatus
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  @js.native
  sealed trait Skipped extends TaskStatus
  /* 6 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
  @js.native
  sealed trait Succeeded extends TaskStatus
  /* 7 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  @js.native
  sealed trait Success extends TaskStatus
  /* 3 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  @js.native
  sealed trait Unknown extends TaskStatus
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}

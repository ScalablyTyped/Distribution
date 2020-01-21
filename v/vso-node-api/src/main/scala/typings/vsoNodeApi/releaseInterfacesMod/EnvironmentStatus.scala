package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnvironmentStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "EnvironmentStatus")
@js.native
object EnvironmentStatus extends js.Object {
  @js.native
  sealed trait Canceled extends EnvironmentStatus
  
  @js.native
  sealed trait InProgress extends EnvironmentStatus
  
  @js.native
  sealed trait NotStarted extends EnvironmentStatus
  
  @js.native
  sealed trait PartiallySucceeded extends EnvironmentStatus
  
  @js.native
  sealed trait Queued extends EnvironmentStatus
  
  @js.native
  sealed trait Rejected extends EnvironmentStatus
  
  @js.native
  sealed trait Scheduled extends EnvironmentStatus
  
  @js.native
  sealed trait Succeeded extends EnvironmentStatus
  
  @js.native
  sealed trait Undefined extends EnvironmentStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentStatus with Double] = js.native
  /* 8 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 1 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  /* 128 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  /* 32 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /* 16 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  /* 64 */ @js.native
  object Scheduled extends TopLevel[Scheduled with Double]
  
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}


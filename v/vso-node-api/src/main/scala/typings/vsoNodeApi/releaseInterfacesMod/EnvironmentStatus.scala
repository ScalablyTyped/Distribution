package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentStatus extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "EnvironmentStatus")
@js.native
object EnvironmentStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentStatus with Double] = js.native
  
  @js.native
  sealed trait Canceled extends EnvironmentStatus
  /* 8 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  @js.native
  sealed trait InProgress extends EnvironmentStatus
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait NotStarted extends EnvironmentStatus
  /* 1 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  @js.native
  sealed trait PartiallySucceeded extends EnvironmentStatus
  /* 128 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  @js.native
  sealed trait Queued extends EnvironmentStatus
  /* 32 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  @js.native
  sealed trait Rejected extends EnvironmentStatus
  /* 16 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  @js.native
  sealed trait Scheduled extends EnvironmentStatus
  /* 64 */ @js.native
  object Scheduled extends TopLevel[Scheduled with Double]
  
  @js.native
  sealed trait Succeeded extends EnvironmentStatus
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  @js.native
  sealed trait Undefined extends EnvironmentStatus
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
}

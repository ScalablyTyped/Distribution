package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildStatus extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildStatus")
@js.native
object BuildStatus extends js.Object {
  /**
    * All status.
    */
  @js.native
  sealed trait All extends BuildStatus
  
  /**
    * The build is cancelling
    */
  @js.native
  sealed trait Cancelling extends BuildStatus
  
  /**
    * The build has completed.
    */
  @js.native
  sealed trait Completed extends BuildStatus
  
  /**
    * The build is currently in progress.
    */
  @js.native
  sealed trait InProgress extends BuildStatus
  
  /**
    * No status.
    */
  @js.native
  sealed trait None extends BuildStatus
  
  /**
    * The build has not yet started.
    */
  @js.native
  sealed trait NotStarted extends BuildStatus
  
  /**
    * The build is inactive in the queue.
    */
  @js.native
  sealed trait Postponed extends BuildStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildStatus with Double] = js.native
  /* 47 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 4 */ @js.native
  object Cancelling extends TopLevel[Cancelling with Double]
  
  /* 2 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 32 */ @js.native
  object NotStarted extends TopLevel[NotStarted with Double]
  
  /* 8 */ @js.native
  object Postponed extends TopLevel[Postponed with Double]
  
}


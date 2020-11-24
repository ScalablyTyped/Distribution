package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildReason extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildReason")
@js.native
object BuildReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildReason with Double] = js.native
  
  /**
    * All reasons.
    */
  @js.native
  sealed trait All extends BuildReason
  /* 495 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * The build was started for the trigger TriggerType.BatchedContinuousIntegration.
    */
  @js.native
  sealed trait BatchedCI extends BuildReason
  /* 4 */ @js.native
  object BatchedCI extends TopLevel[BatchedCI with Double]
  
  /**
    * The build was started for the trigger ContinuousIntegrationType.Gated.
    */
  @js.native
  sealed trait CheckInShelveset extends BuildReason
  /* 128 */ @js.native
  object CheckInShelveset extends TopLevel[CheckInShelveset with Double]
  
  /**
    * The build was started for the trigger TriggerType.ContinuousIntegration.
    */
  @js.native
  sealed trait IndividualCI extends BuildReason
  /* 2 */ @js.native
  object IndividualCI extends TopLevel[IndividualCI with Double]
  
  /**
    * The build was started manually.
    */
  @js.native
  sealed trait Manual extends BuildReason
  /* 1 */ @js.native
  object Manual extends TopLevel[Manual with Double]
  
  /**
    * No reason. This value should not be used.
    */
  @js.native
  sealed trait None extends BuildReason
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * The build was started by a pull request. Added in resource version 3.
    */
  @js.native
  sealed trait PullRequest extends BuildReason
  /* 256 */ @js.native
  object PullRequest extends TopLevel[PullRequest with Double]
  
  /**
    * The build was started for the trigger TriggerType.Schedule.
    */
  @js.native
  sealed trait Schedule extends BuildReason
  /* 8 */ @js.native
  object Schedule
    extends TopLevel[typings.vsoNodeApi.buildInterfacesMod.BuildReason.Schedule with Double]
  
  /**
    * The build was triggered for retention policy purposes.
    */
  @js.native
  sealed trait Triggered extends BuildReason
  /* 431 */ @js.native
  object Triggered extends TopLevel[Triggered with Double]
  
  /**
    * The build was created by a user.
    */
  @js.native
  sealed trait UserCreated extends BuildReason
  /* 32 */ @js.native
  object UserCreated extends TopLevel[UserCreated with Double]
  
  /**
    * The build was started manually for private validation.
    */
  @js.native
  sealed trait ValidateShelveset extends BuildReason
  /* 64 */ @js.native
  object ValidateShelveset extends TopLevel[ValidateShelveset with Double]
}

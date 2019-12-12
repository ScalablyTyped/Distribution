package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.All
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.BatchedCI
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.CheckInShelveset
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.IndividualCI
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.Manual
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.None
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.PullRequest
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.Triggered
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.UserCreated
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.ValidateShelveset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildReason extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildReason")
@js.native
object BuildReason extends js.Object {
  /**
    * All reasons.
    */
  @js.native
  sealed trait All extends BuildReason
  
  /**
    * The build was started for the trigger TriggerType.BatchedContinuousIntegration.
    */
  @js.native
  sealed trait BatchedCI extends BuildReason
  
  /**
    * The build was started for the trigger ContinuousIntegrationType.Gated.
    */
  @js.native
  sealed trait CheckInShelveset extends BuildReason
  
  /**
    * The build was started for the trigger TriggerType.ContinuousIntegration.
    */
  @js.native
  sealed trait IndividualCI extends BuildReason
  
  /**
    * The build was started manually.
    */
  @js.native
  sealed trait Manual extends BuildReason
  
  /**
    * No reason. This value should not be used.
    */
  @js.native
  sealed trait None extends BuildReason
  
  /**
    * The build was started by a pull request. Added in resource version 3.
    */
  @js.native
  sealed trait PullRequest extends BuildReason
  
  /**
    * The build was started for the trigger TriggerType.Schedule.
    */
  @js.native
  sealed trait Schedule extends BuildReason
  
  /**
    * The build was triggered for retention policy purposes.
    */
  @js.native
  sealed trait Triggered extends BuildReason
  
  /**
    * The build was created by a user.
    */
  @js.native
  sealed trait UserCreated extends BuildReason
  
  /**
    * The build was started manually for private validation.
    */
  @js.native
  sealed trait ValidateShelveset extends BuildReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildReason with Double] = js.native
  /* 495 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 4 */ @js.native
  object BatchedCI extends TopLevel[BatchedCI with Double]
  
  /* 128 */ @js.native
  object CheckInShelveset extends TopLevel[CheckInShelveset with Double]
  
  /* 2 */ @js.native
  object IndividualCI extends TopLevel[IndividualCI with Double]
  
  /* 1 */ @js.native
  object Manual extends TopLevel[Manual with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 256 */ @js.native
  object PullRequest extends TopLevel[PullRequest with Double]
  
  /* 8 */ @js.native
  object Schedule
    extends TopLevel[
          typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason.Schedule with Double
        ]
  
  /* 431 */ @js.native
  object Triggered extends TopLevel[Triggered with Double]
  
  /* 32 */ @js.native
  object UserCreated extends TopLevel[UserCreated with Double]
  
  /* 64 */ @js.native
  object ValidateShelveset extends TopLevel[ValidateShelveset with Double]
  
}


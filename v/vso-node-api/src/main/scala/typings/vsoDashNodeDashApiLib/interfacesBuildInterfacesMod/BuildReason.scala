package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was started for the trigger TriggerType.BatchedContinuousIntegration.
    */
  @js.native
  sealed trait BatchedCI
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was started for the trigger ContinuousIntegrationType.Gated.
    */
  @js.native
  sealed trait CheckInShelveset
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was started for the trigger TriggerType.ContinuousIntegration.
    */
  @js.native
  sealed trait IndividualCI
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was started manually.
    */
  @js.native
  sealed trait Manual
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * No reason. This value should not be used.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was started by a pull request. Added in resource version 3.
    */
  @js.native
  sealed trait PullRequest
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was started for the trigger TriggerType.Schedule.
    */
  @js.native
  sealed trait Schedule
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was triggered for retention policy purposes.
    */
  @js.native
  sealed trait Triggered
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was created by a user.
    */
  @js.native
  sealed trait UserCreated
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /**
    * The build was started manually for private validation.
    */
  @js.native
  sealed trait ValidateShelveset
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason
  
  /* 495 */ val All: All with scala.Double = js.native
  /* 4 */ val BatchedCI: BatchedCI with scala.Double = js.native
  /* 128 */ val CheckInShelveset: CheckInShelveset with scala.Double = js.native
  /* 2 */ val IndividualCI: IndividualCI with scala.Double = js.native
  /* 1 */ val Manual: Manual with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 256 */ val PullRequest: PullRequest with scala.Double = js.native
  /* 8 */ val Schedule: Schedule with scala.Double = js.native
  /* 431 */ val Triggered: Triggered with scala.Double = js.native
  /* 32 */ val UserCreated: UserCreated with scala.Double = js.native
  /* 64 */ val ValidateShelveset: ValidateShelveset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason with scala.Double] = js.native
}


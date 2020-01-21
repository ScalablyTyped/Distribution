package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionTriggerType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionTriggerType")
@js.native
object DefinitionTriggerType extends js.Object {
  /**
    * All types.
    */
  @js.native
  sealed trait All extends DefinitionTriggerType
  
  /**
    * A build should be started for multiple changesets at a time at a specified interval.
    */
  @js.native
  sealed trait BatchedContinuousIntegration extends DefinitionTriggerType
  
  /**
    * A validation build should be started for each batch of check-ins.
    */
  @js.native
  sealed trait BatchedGatedCheckIn extends DefinitionTriggerType
  
  /**
    * A build should be started for each changeset.
    */
  @js.native
  sealed trait ContinuousIntegration extends DefinitionTriggerType
  
  /**
    * A validation build should be started for each check-in.
    */
  @js.native
  sealed trait GatedCheckIn extends DefinitionTriggerType
  
  /**
    * Manual builds only.
    */
  @js.native
  sealed trait None extends DefinitionTriggerType
  
  /**
    * A build should be triggered when a GitHub pull request is created or updated. Added in resource version 3
    */
  @js.native
  sealed trait PullRequest extends DefinitionTriggerType
  
  /**
    * A build should be started on a specified schedule whether or not changesets exist.
    */
  @js.native
  sealed trait Schedule extends DefinitionTriggerType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionTriggerType with Double] = js.native
  /* 127 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 4 */ @js.native
  object BatchedContinuousIntegration extends TopLevel[BatchedContinuousIntegration with Double]
  
  /* 32 */ @js.native
  object BatchedGatedCheckIn extends TopLevel[BatchedGatedCheckIn with Double]
  
  /* 2 */ @js.native
  object ContinuousIntegration extends TopLevel[ContinuousIntegration with Double]
  
  /* 16 */ @js.native
  object GatedCheckIn extends TopLevel[GatedCheckIn with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 64 */ @js.native
  object PullRequest extends TopLevel[PullRequest with Double]
  
  /* 8 */ @js.native
  object Schedule
    extends TopLevel[typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.Schedule with Double]
  
}


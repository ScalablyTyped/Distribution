package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  
  /* 127 */ val All: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionTriggerType.All with Double = js.native
  /* 4 */ val BatchedContinuousIntegration: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionTriggerType.BatchedContinuousIntegration with Double = js.native
  /* 32 */ val BatchedGatedCheckIn: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionTriggerType.BatchedGatedCheckIn with Double = js.native
  /* 2 */ val ContinuousIntegration: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionTriggerType.ContinuousIntegration with Double = js.native
  /* 16 */ val GatedCheckIn: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionTriggerType.GatedCheckIn with Double = js.native
  /* 1 */ val None: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionTriggerType.None with Double = js.native
  /* 64 */ val PullRequest: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionTriggerType.PullRequest with Double = js.native
  /* 8 */ val Schedule: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionTriggerType.Schedule with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionTriggerType with Double] = js.native
}


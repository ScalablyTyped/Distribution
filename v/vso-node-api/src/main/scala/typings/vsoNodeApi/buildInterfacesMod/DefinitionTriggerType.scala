package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionTriggerType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionTriggerType")
@js.native
object DefinitionTriggerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionTriggerType with Double] = js.native
  
  /**
    * All types.
    */
  @js.native
  sealed trait All extends DefinitionTriggerType
  /* 127 */ val All: typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.All with Double = js.native
  
  /**
    * A build should be started for multiple changesets at a time at a specified interval.
    */
  @js.native
  sealed trait BatchedContinuousIntegration extends DefinitionTriggerType
  /* 4 */ val BatchedContinuousIntegration: typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.BatchedContinuousIntegration with Double = js.native
  
  /**
    * A validation build should be started for each batch of check-ins.
    */
  @js.native
  sealed trait BatchedGatedCheckIn extends DefinitionTriggerType
  /* 32 */ val BatchedGatedCheckIn: typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.BatchedGatedCheckIn with Double = js.native
  
  /**
    * A build should be started for each changeset.
    */
  @js.native
  sealed trait ContinuousIntegration extends DefinitionTriggerType
  /* 2 */ val ContinuousIntegration: typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.ContinuousIntegration with Double = js.native
  
  /**
    * A validation build should be started for each check-in.
    */
  @js.native
  sealed trait GatedCheckIn extends DefinitionTriggerType
  /* 16 */ val GatedCheckIn: typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.GatedCheckIn with Double = js.native
  
  /**
    * Manual builds only.
    */
  @js.native
  sealed trait None extends DefinitionTriggerType
  /* 1 */ val None: typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.None with Double = js.native
  
  /**
    * A build should be triggered when a GitHub pull request is created or updated. Added in resource version 3
    */
  @js.native
  sealed trait PullRequest extends DefinitionTriggerType
  /* 64 */ val PullRequest: typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.PullRequest with Double = js.native
  
  /**
    * A build should be started on a specified schedule whether or not changesets exist.
    */
  @js.native
  sealed trait Schedule extends DefinitionTriggerType
  /* 8 */ val Schedule: typings.vsoNodeApi.buildInterfacesMod.DefinitionTriggerType.Schedule with Double = js.native
}

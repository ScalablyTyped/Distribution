package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionTriggerType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionTriggerType")
@js.native
object DefinitionTriggerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionTriggerType & Double] = js.native
  
  /**
    * All types.
    */
  @js.native
  sealed trait All
    extends StObject
       with DefinitionTriggerType
  /* 127 */ val All: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionTriggerType.All & Double = js.native
  
  /**
    * A build should be started for multiple changesets at a time at a specified interval.
    */
  @js.native
  sealed trait BatchedContinuousIntegration
    extends StObject
       with DefinitionTriggerType
  /* 4 */ val BatchedContinuousIntegration: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionTriggerType.BatchedContinuousIntegration & Double = js.native
  
  /**
    * A validation build should be started for each batch of check-ins.
    */
  @js.native
  sealed trait BatchedGatedCheckIn
    extends StObject
       with DefinitionTriggerType
  /* 32 */ val BatchedGatedCheckIn: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionTriggerType.BatchedGatedCheckIn & Double = js.native
  
  /**
    * A build should be started for each changeset.
    */
  @js.native
  sealed trait ContinuousIntegration
    extends StObject
       with DefinitionTriggerType
  /* 2 */ val ContinuousIntegration: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionTriggerType.ContinuousIntegration & Double = js.native
  
  /**
    * A validation build should be started for each check-in.
    */
  @js.native
  sealed trait GatedCheckIn
    extends StObject
       with DefinitionTriggerType
  /* 16 */ val GatedCheckIn: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionTriggerType.GatedCheckIn & Double = js.native
  
  /**
    * Manual builds only.
    */
  @js.native
  sealed trait None
    extends StObject
       with DefinitionTriggerType
  /* 1 */ val None: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionTriggerType.None & Double = js.native
  
  /**
    * A build should be triggered when a GitHub pull request is created or updated. Added in resource version 3
    */
  @js.native
  sealed trait PullRequest
    extends StObject
       with DefinitionTriggerType
  /* 64 */ val PullRequest: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionTriggerType.PullRequest & Double = js.native
  
  /**
    * A build should be started on a specified schedule whether or not changesets exist.
    */
  @js.native
  sealed trait Schedule
    extends StObject
       with DefinitionTriggerType
  /* 8 */ val Schedule: typings.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionTriggerType.Schedule & Double = js.native
}

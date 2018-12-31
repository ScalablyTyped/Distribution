package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType
  
  /**
    * A build should be started for multiple changesets at a time at a specified interval.
    */
  @js.native
  sealed trait BatchedContinuousIntegration
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType
  
  /**
    * A validation build should be started for each batch of check-ins.
    */
  @js.native
  sealed trait BatchedGatedCheckIn
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType
  
  /**
    * A build should be started for each changeset.
    */
  @js.native
  sealed trait ContinuousIntegration
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType
  
  /**
    * A validation build should be started for each check-in.
    */
  @js.native
  sealed trait GatedCheckIn
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType
  
  /**
    * Manual builds only.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType
  
  /**
    * A build should be triggered when a GitHub pull request is created or updated. Added in resource version 3
    */
  @js.native
  sealed trait PullRequest
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType
  
  /**
    * A build should be started on a specified schedule whether or not changesets exist.
    */
  @js.native
  sealed trait Schedule
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType
  
  /* 127 */ val All: All with scala.Double = js.native
  /* 4 */ val BatchedContinuousIntegration: BatchedContinuousIntegration with scala.Double = js.native
  /* 32 */ val BatchedGatedCheckIn: BatchedGatedCheckIn with scala.Double = js.native
  /* 2 */ val ContinuousIntegration: ContinuousIntegration with scala.Double = js.native
  /* 16 */ val GatedCheckIn: GatedCheckIn with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 64 */ val PullRequest: PullRequest with scala.Double = js.native
  /* 8 */ val Schedule: Schedule with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionTriggerType with scala.Double
  ] = js.native
}


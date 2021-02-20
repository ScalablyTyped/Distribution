package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentOperationStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentOperationStatus")
@js.native
object DeploymentOperationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentOperationStatus with Double] = js.native
  
  /**
    * The deployment operation status is all.
    */
  @js.native
  sealed trait All extends DeploymentOperationStatus
  /* 258047 */ val All: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.All with Double = js.native
  
  /**
    * The deployment operation status is approved.
    */
  @js.native
  sealed trait Approved extends DeploymentOperationStatus
  /* 8 */ val Approved: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Approved with Double = js.native
  
  /**
    * The deployment operation status is canceled.
    */
  @js.native
  sealed trait Canceled extends DeploymentOperationStatus
  /* 2048 */ val Canceled: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Canceled with Double = js.native
  
  /**
    * The deployment operation status is cancelling.
    */
  @js.native
  sealed trait Cancelling extends DeploymentOperationStatus
  /* 32768 */ val Cancelling: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Cancelling with Double = js.native
  
  /**
    * The deployment operation status is deferred.
    */
  @js.native
  sealed trait Deferred extends DeploymentOperationStatus
  /* 32 */ val Deferred: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Deferred with Double = js.native
  
  /**
    * The deployment operation status is EvaluatingGates.
    */
  @js.native
  sealed trait EvaluatingGates extends DeploymentOperationStatus
  /* 65536 */ val EvaluatingGates: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.EvaluatingGates with Double = js.native
  
  /**
    * The deployment operation status is GateFailed.
    */
  @js.native
  sealed trait GateFailed extends DeploymentOperationStatus
  /* 131072 */ val GateFailed: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.GateFailed with Double = js.native
  
  /**
    * The deployment operation status is manualintervention pending.
    */
  @js.native
  sealed trait ManualInterventionPending extends DeploymentOperationStatus
  /* 8192 */ val ManualInterventionPending: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.ManualInterventionPending with Double = js.native
  
  /**
    * The deployment operation status is pending.
    */
  @js.native
  sealed trait Pending extends DeploymentOperationStatus
  /* 4 */ val Pending: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Pending with Double = js.native
  
  /**
    * The deployment operation status is phase canceled.
    */
  @js.native
  sealed trait PhaseCanceled extends DeploymentOperationStatus
  /* 4096 */ val PhaseCanceled: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.PhaseCanceled with Double = js.native
  
  /**
    * The deployment operation status is phase failed.
    */
  @js.native
  sealed trait PhaseFailed extends DeploymentOperationStatus
  /* 1024 */ val PhaseFailed: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.PhaseFailed with Double = js.native
  
  /**
    * The deployment operation status is phase inprogress.
    */
  @js.native
  sealed trait PhaseInProgress extends DeploymentOperationStatus
  /* 128 */ val PhaseInProgress: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.PhaseInProgress with Double = js.native
  
  /**
    * The deployment operation status is phase partially succeeded.
    */
  @js.native
  sealed trait PhasePartiallySucceeded extends DeploymentOperationStatus
  /* 512 */ val PhasePartiallySucceeded: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.PhasePartiallySucceeded with Double = js.native
  
  /**
    * The deployment operation status is phase succeeded.
    */
  @js.native
  sealed trait PhaseSucceeded extends DeploymentOperationStatus
  /* 256 */ val PhaseSucceeded: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.PhaseSucceeded with Double = js.native
  
  /**
    * The deployment operation status is queued.
    */
  @js.native
  sealed trait Queued extends DeploymentOperationStatus
  /* 1 */ val Queued: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Queued with Double = js.native
  
  /**
    * The deployment operation status is queued for agent.
    */
  @js.native
  sealed trait QueuedForAgent extends DeploymentOperationStatus
  /* 64 */ val QueuedForAgent: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.QueuedForAgent with Double = js.native
  
  /**
    * The deployment operation status is queued for pipeline.
    */
  @js.native
  sealed trait QueuedForPipeline extends DeploymentOperationStatus
  /* 16384 */ val QueuedForPipeline: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.QueuedForPipeline with Double = js.native
  
  /**
    * The deployment operation status is rejected.
    */
  @js.native
  sealed trait Rejected extends DeploymentOperationStatus
  /* 16 */ val Rejected: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Rejected with Double = js.native
  
  /**
    * The deployment operation status is scheduled.
    */
  @js.native
  sealed trait Scheduled extends DeploymentOperationStatus
  /* 2 */ val Scheduled: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Scheduled with Double = js.native
  
  /**
    * The deployment operation status is undefined.
    */
  @js.native
  sealed trait Undefined extends DeploymentOperationStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.DeploymentOperationStatus.Undefined with Double = js.native
}

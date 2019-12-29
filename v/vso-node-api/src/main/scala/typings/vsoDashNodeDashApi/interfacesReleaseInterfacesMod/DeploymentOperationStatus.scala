package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentOperationStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentOperationStatus")
@js.native
object DeploymentOperationStatus extends js.Object {
  /**
    * The deployment operation status is all.
    */
  @js.native
  sealed trait All extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is approved.
    */
  @js.native
  sealed trait Approved extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is canceled.
    */
  @js.native
  sealed trait Canceled extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is cancelling.
    */
  @js.native
  sealed trait Cancelling extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is deferred.
    */
  @js.native
  sealed trait Deferred extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is EvaluatingGates.
    */
  @js.native
  sealed trait EvaluatingGates extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is GateFailed.
    */
  @js.native
  sealed trait GateFailed extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is manualintervention pending.
    */
  @js.native
  sealed trait ManualInterventionPending extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is pending.
    */
  @js.native
  sealed trait Pending extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase canceled.
    */
  @js.native
  sealed trait PhaseCanceled extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase failed.
    */
  @js.native
  sealed trait PhaseFailed extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase inprogress.
    */
  @js.native
  sealed trait PhaseInProgress extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase partially succeeded.
    */
  @js.native
  sealed trait PhasePartiallySucceeded extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is phase succeeded.
    */
  @js.native
  sealed trait PhaseSucceeded extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is queued.
    */
  @js.native
  sealed trait Queued extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is queued for agent.
    */
  @js.native
  sealed trait QueuedForAgent extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is queued for pipeline.
    */
  @js.native
  sealed trait QueuedForPipeline extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is rejected.
    */
  @js.native
  sealed trait Rejected extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is scheduled.
    */
  @js.native
  sealed trait Scheduled extends DeploymentOperationStatus
  
  /**
    * The deployment operation status is undefined.
    */
  @js.native
  sealed trait Undefined extends DeploymentOperationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentOperationStatus with Double] = js.native
  /* 258047 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 8 */ @js.native
  object Approved extends TopLevel[Approved with Double]
  
  /* 2048 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 32768 */ @js.native
  object Cancelling extends TopLevel[Cancelling with Double]
  
  /* 32 */ @js.native
  object Deferred extends TopLevel[Deferred with Double]
  
  /* 65536 */ @js.native
  object EvaluatingGates extends TopLevel[EvaluatingGates with Double]
  
  /* 131072 */ @js.native
  object GateFailed extends TopLevel[GateFailed with Double]
  
  /* 8192 */ @js.native
  object ManualInterventionPending extends TopLevel[ManualInterventionPending with Double]
  
  /* 4 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 4096 */ @js.native
  object PhaseCanceled extends TopLevel[PhaseCanceled with Double]
  
  /* 1024 */ @js.native
  object PhaseFailed extends TopLevel[PhaseFailed with Double]
  
  /* 128 */ @js.native
  object PhaseInProgress extends TopLevel[PhaseInProgress with Double]
  
  /* 512 */ @js.native
  object PhasePartiallySucceeded extends TopLevel[PhasePartiallySucceeded with Double]
  
  /* 256 */ @js.native
  object PhaseSucceeded extends TopLevel[PhaseSucceeded with Double]
  
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /* 64 */ @js.native
  object QueuedForAgent extends TopLevel[QueuedForAgent with Double]
  
  /* 16384 */ @js.native
  object QueuedForPipeline extends TopLevel[QueuedForPipeline with Double]
  
  /* 16 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  /* 2 */ @js.native
  object Scheduled extends TopLevel[Scheduled with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}


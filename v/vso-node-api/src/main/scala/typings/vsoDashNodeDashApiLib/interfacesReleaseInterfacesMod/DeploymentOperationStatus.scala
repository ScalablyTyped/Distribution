package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is approved.
       */
  @js.native
  sealed trait Approved
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is canceled.
       */
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is cancelling.
       */
  @js.native
  sealed trait Cancelling
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is deferred.
       */
  @js.native
  sealed trait Deferred
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is EvaluatingGates.
       */
  @js.native
  sealed trait EvaluatingGates
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is GateFailed.
       */
  @js.native
  sealed trait GateFailed
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is manualintervention pending.
       */
  @js.native
  sealed trait ManualInterventionPending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is pending.
       */
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is phase canceled.
       */
  @js.native
  sealed trait PhaseCanceled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is phase failed.
       */
  @js.native
  sealed trait PhaseFailed
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is phase inprogress.
       */
  @js.native
  sealed trait PhaseInProgress
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is phase partially succeeded.
       */
  @js.native
  sealed trait PhasePartiallySucceeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is phase succeeded.
       */
  @js.native
  sealed trait PhaseSucceeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is queued.
       */
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is queued for agent.
       */
  @js.native
  sealed trait QueuedForAgent
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is queued for pipeline.
       */
  @js.native
  sealed trait QueuedForPipeline
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is rejected.
       */
  @js.native
  sealed trait Rejected
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is scheduled.
       */
  @js.native
  sealed trait Scheduled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /**
       * The deployment operation status is undefined.
       */
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus
  
  /* 258047 */ val All: All with scala.Double = js.native
  /* 8 */ val Approved: Approved with scala.Double = js.native
  /* 2048 */ val Canceled: Canceled with scala.Double = js.native
  /* 32768 */ val Cancelling: Cancelling with scala.Double = js.native
  /* 32 */ val Deferred: Deferred with scala.Double = js.native
  /* 65536 */ val EvaluatingGates: EvaluatingGates with scala.Double = js.native
  /* 131072 */ val GateFailed: GateFailed with scala.Double = js.native
  /* 8192 */ val ManualInterventionPending: ManualInterventionPending with scala.Double = js.native
  /* 4 */ val Pending: Pending with scala.Double = js.native
  /* 4096 */ val PhaseCanceled: PhaseCanceled with scala.Double = js.native
  /* 1024 */ val PhaseFailed: PhaseFailed with scala.Double = js.native
  /* 128 */ val PhaseInProgress: PhaseInProgress with scala.Double = js.native
  /* 512 */ val PhasePartiallySucceeded: PhasePartiallySucceeded with scala.Double = js.native
  /* 256 */ val PhaseSucceeded: PhaseSucceeded with scala.Double = js.native
  /* 1 */ val Queued: Queued with scala.Double = js.native
  /* 64 */ val QueuedForAgent: QueuedForAgent with scala.Double = js.native
  /* 16384 */ val QueuedForPipeline: QueuedForPipeline with scala.Double = js.native
  /* 16 */ val Rejected: Rejected with scala.Double = js.native
  /* 2 */ val Scheduled: Scheduled with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus with scala.Double
  ] = js.native
}


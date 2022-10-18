package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentOperationStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentOperationStatus")
@js.native
object DeploymentOperationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentOperationStatus & Double] = js.native
  
  /**
    * The deployment operation status is all.
    */
  @js.native
  sealed trait All
    extends StObject
       with DeploymentOperationStatus
  /* 258047 */ val All: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.All & Double = js.native
  
  /**
    * The deployment operation status is approved.
    */
  @js.native
  sealed trait Approved
    extends StObject
       with DeploymentOperationStatus
  /* 8 */ val Approved: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Approved & Double = js.native
  
  /**
    * The deployment operation status is canceled.
    */
  @js.native
  sealed trait Canceled
    extends StObject
       with DeploymentOperationStatus
  /* 2048 */ val Canceled: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Canceled & Double = js.native
  
  /**
    * The deployment operation status is cancelling.
    */
  @js.native
  sealed trait Cancelling
    extends StObject
       with DeploymentOperationStatus
  /* 32768 */ val Cancelling: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Cancelling & Double = js.native
  
  /**
    * The deployment operation status is deferred.
    */
  @js.native
  sealed trait Deferred
    extends StObject
       with DeploymentOperationStatus
  /* 32 */ val Deferred: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Deferred & Double = js.native
  
  /**
    * The deployment operation status is EvaluatingGates.
    */
  @js.native
  sealed trait EvaluatingGates
    extends StObject
       with DeploymentOperationStatus
  /* 65536 */ val EvaluatingGates: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.EvaluatingGates & Double = js.native
  
  /**
    * The deployment operation status is GateFailed.
    */
  @js.native
  sealed trait GateFailed
    extends StObject
       with DeploymentOperationStatus
  /* 131072 */ val GateFailed: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.GateFailed & Double = js.native
  
  /**
    * The deployment operation status is manualintervention pending.
    */
  @js.native
  sealed trait ManualInterventionPending
    extends StObject
       with DeploymentOperationStatus
  /* 8192 */ val ManualInterventionPending: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.ManualInterventionPending & Double = js.native
  
  /**
    * The deployment operation status is pending.
    */
  @js.native
  sealed trait Pending
    extends StObject
       with DeploymentOperationStatus
  /* 4 */ val Pending: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Pending & Double = js.native
  
  /**
    * The deployment operation status is phase canceled.
    */
  @js.native
  sealed trait PhaseCanceled
    extends StObject
       with DeploymentOperationStatus
  /* 4096 */ val PhaseCanceled: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseCanceled & Double = js.native
  
  /**
    * The deployment operation status is phase failed.
    */
  @js.native
  sealed trait PhaseFailed
    extends StObject
       with DeploymentOperationStatus
  /* 1024 */ val PhaseFailed: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseFailed & Double = js.native
  
  /**
    * The deployment operation status is phase inprogress.
    */
  @js.native
  sealed trait PhaseInProgress
    extends StObject
       with DeploymentOperationStatus
  /* 128 */ val PhaseInProgress: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseInProgress & Double = js.native
  
  /**
    * The deployment operation status is phase partially succeeded.
    */
  @js.native
  sealed trait PhasePartiallySucceeded
    extends StObject
       with DeploymentOperationStatus
  /* 512 */ val PhasePartiallySucceeded: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhasePartiallySucceeded & Double = js.native
  
  /**
    * The deployment operation status is phase succeeded.
    */
  @js.native
  sealed trait PhaseSucceeded
    extends StObject
       with DeploymentOperationStatus
  /* 256 */ val PhaseSucceeded: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseSucceeded & Double = js.native
  
  /**
    * The deployment operation status is queued.
    */
  @js.native
  sealed trait Queued
    extends StObject
       with DeploymentOperationStatus
  /* 1 */ val Queued: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Queued & Double = js.native
  
  /**
    * The deployment operation status is queued for agent.
    */
  @js.native
  sealed trait QueuedForAgent
    extends StObject
       with DeploymentOperationStatus
  /* 64 */ val QueuedForAgent: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.QueuedForAgent & Double = js.native
  
  /**
    * The deployment operation status is queued for pipeline.
    */
  @js.native
  sealed trait QueuedForPipeline
    extends StObject
       with DeploymentOperationStatus
  /* 16384 */ val QueuedForPipeline: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.QueuedForPipeline & Double = js.native
  
  /**
    * The deployment operation status is rejected.
    */
  @js.native
  sealed trait Rejected
    extends StObject
       with DeploymentOperationStatus
  /* 16 */ val Rejected: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Rejected & Double = js.native
  
  /**
    * The deployment operation status is scheduled.
    */
  @js.native
  sealed trait Scheduled
    extends StObject
       with DeploymentOperationStatus
  /* 2 */ val Scheduled: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Scheduled & Double = js.native
  
  /**
    * The deployment operation status is undefined.
    */
  @js.native
  sealed trait Undefined
    extends StObject
       with DeploymentOperationStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Undefined & Double = js.native
}

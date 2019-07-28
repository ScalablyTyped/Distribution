package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EvaluationOperationStatus extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EvaluationOperationStatus")
@js.native
object EvaluationOperationStatus extends js.Object {
  /**
    * The operation was cancelled by the user.
    */
  @js.native
  sealed trait Cancelled extends EvaluationOperationStatus
  
  /**
    * The operation completed with a failure.
    */
  @js.native
  sealed trait Failed extends EvaluationOperationStatus
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait InProgress extends EvaluationOperationStatus
  
  /**
    * The operation could not be found.
    */
  @js.native
  sealed trait NotFound extends EvaluationOperationStatus
  
  /**
    * The operation object does not have the status set.
    */
  @js.native
  sealed trait NotSet extends EvaluationOperationStatus
  
  /**
    * The operation has been queued.
    */
  @js.native
  sealed trait Queued extends EvaluationOperationStatus
  
  /**
    * The operation completed successfully.
    */
  @js.native
  sealed trait Succeeded extends EvaluationOperationStatus
  
  /**
    * The operation timed out.
    */
  @js.native
  sealed trait TimedOut extends EvaluationOperationStatus
  
  /* 3 */ val Cancelled: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.Cancelled with Double = js.native
  /* 5 */ val Failed: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.Failed with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.InProgress with Double = js.native
  /* 7 */ val NotFound: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.NotFound with Double = js.native
  /* 0 */ val NotSet: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.NotSet with Double = js.native
  /* 1 */ val Queued: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.Queued with Double = js.native
  /* 4 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.Succeeded with Double = js.native
  /* 6 */ val TimedOut: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.TimedOut with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EvaluationOperationStatus with Double] = js.native
}


package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

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
  sealed trait Cancelled
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus
  
  /**
       * The operation completed with a failure.
       */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus
  
  /**
       * The operation is in progress.
       */
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus
  
  /**
       * The operation could not be found.
       */
  @js.native
  sealed trait NotFound
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus
  
  /**
       * The operation object does not have the status set.
       */
  @js.native
  sealed trait NotSet
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus
  
  /**
       * The operation has been queued.
       */
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus
  
  /**
       * The operation completed successfully.
       */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus
  
  /**
       * The operation timed out.
       */
  @js.native
  sealed trait TimedOut
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus
  
  /* 3 */ val Cancelled: Cancelled with scala.Double = js.native
  /* 5 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 7 */ val NotFound: NotFound with scala.Double = js.native
  /* 0 */ val NotSet: NotSet with scala.Double = js.native
  /* 1 */ val Queued: Queued with scala.Double = js.native
  /* 4 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 6 */ val TimedOut: TimedOut with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.EvaluationOperationStatus with scala.Double
  ] = js.native
}


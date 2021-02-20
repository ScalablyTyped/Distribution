package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EvaluationOperationStatus extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EvaluationOperationStatus")
@js.native
object EvaluationOperationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EvaluationOperationStatus with Double] = js.native
  
  /**
    * The operation was cancelled by the user.
    */
  @js.native
  sealed trait Cancelled extends EvaluationOperationStatus
  /* 3 */ val Cancelled: typings.vsoNodeApi.notificationInterfacesMod.EvaluationOperationStatus.Cancelled with Double = js.native
  
  /**
    * The operation completed with a failure.
    */
  @js.native
  sealed trait Failed extends EvaluationOperationStatus
  /* 5 */ val Failed: typings.vsoNodeApi.notificationInterfacesMod.EvaluationOperationStatus.Failed with Double = js.native
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait InProgress extends EvaluationOperationStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.notificationInterfacesMod.EvaluationOperationStatus.InProgress with Double = js.native
  
  /**
    * The operation could not be found.
    */
  @js.native
  sealed trait NotFound extends EvaluationOperationStatus
  /* 7 */ val NotFound: typings.vsoNodeApi.notificationInterfacesMod.EvaluationOperationStatus.NotFound with Double = js.native
  
  /**
    * The operation object does not have the status set.
    */
  @js.native
  sealed trait NotSet extends EvaluationOperationStatus
  /* 0 */ val NotSet: typings.vsoNodeApi.notificationInterfacesMod.EvaluationOperationStatus.NotSet with Double = js.native
  
  /**
    * The operation has been queued.
    */
  @js.native
  sealed trait Queued extends EvaluationOperationStatus
  /* 1 */ val Queued: typings.vsoNodeApi.notificationInterfacesMod.EvaluationOperationStatus.Queued with Double = js.native
  
  /**
    * The operation completed successfully.
    */
  @js.native
  sealed trait Succeeded extends EvaluationOperationStatus
  /* 4 */ val Succeeded: typings.vsoNodeApi.notificationInterfacesMod.EvaluationOperationStatus.Succeeded with Double = js.native
  
  /**
    * The operation timed out.
    */
  @js.native
  sealed trait TimedOut extends EvaluationOperationStatus
  /* 6 */ val TimedOut: typings.vsoNodeApi.notificationInterfacesMod.EvaluationOperationStatus.TimedOut with Double = js.native
}

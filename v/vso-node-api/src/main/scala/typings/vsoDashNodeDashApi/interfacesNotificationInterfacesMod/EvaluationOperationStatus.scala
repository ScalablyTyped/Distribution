package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EvaluationOperationStatus with Double] = js.native
  /* 3 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  /* 5 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 7 */ @js.native
  object NotFound extends TopLevel[NotFound with Double]
  
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 6 */ @js.native
  object TimedOut extends TopLevel[TimedOut with Double]
  
}


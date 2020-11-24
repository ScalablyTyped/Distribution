package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EvaluationOperationStatus extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EvaluationOperationStatus")
@js.native
object EvaluationOperationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EvaluationOperationStatus with Double] = js.native
  
  /**
    * The operation was cancelled by the user.
    */
  @js.native
  sealed trait Cancelled extends EvaluationOperationStatus
  /* 3 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  /**
    * The operation completed with a failure.
    */
  @js.native
  sealed trait Failed extends EvaluationOperationStatus
  /* 5 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait InProgress extends EvaluationOperationStatus
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /**
    * The operation could not be found.
    */
  @js.native
  sealed trait NotFound extends EvaluationOperationStatus
  /* 7 */ @js.native
  object NotFound extends TopLevel[NotFound with Double]
  
  /**
    * The operation object does not have the status set.
    */
  @js.native
  sealed trait NotSet extends EvaluationOperationStatus
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /**
    * The operation has been queued.
    */
  @js.native
  sealed trait Queued extends EvaluationOperationStatus
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /**
    * The operation completed successfully.
    */
  @js.native
  sealed trait Succeeded extends EvaluationOperationStatus
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /**
    * The operation timed out.
    */
  @js.native
  sealed trait TimedOut extends EvaluationOperationStatus
  /* 6 */ @js.native
  object TimedOut extends TopLevel[TimedOut with Double]
}

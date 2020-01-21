package typings.vsoNodeApi.operationsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationStatus extends js.Object

@JSImport("vso-node-api/interfaces/common/OperationsInterfaces", "OperationStatus")
@js.native
object OperationStatus extends js.Object {
  /**
    * The operation was cancelled by the user.
    */
  @js.native
  sealed trait Cancelled extends OperationStatus
  
  /**
    * The operation completed with a failure.
    */
  @js.native
  sealed trait Failed extends OperationStatus
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait InProgress extends OperationStatus
  
  /**
    * The operation object does not have the status set.
    */
  @js.native
  sealed trait NotSet extends OperationStatus
  
  /**
    * The operation has been queued.
    */
  @js.native
  sealed trait Queued extends OperationStatus
  
  /**
    * The operation completed successfully.
    */
  @js.native
  sealed trait Succeeded extends OperationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationStatus with Double] = js.native
  /* 3 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  /* 5 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}


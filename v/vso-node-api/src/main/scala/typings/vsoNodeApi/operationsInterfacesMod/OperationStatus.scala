package typings.vsoNodeApi.operationsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperationStatus extends js.Object
@JSImport("vso-node-api/interfaces/common/OperationsInterfaces", "OperationStatus")
@js.native
object OperationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationStatus with Double] = js.native
  
  /**
    * The operation was cancelled by the user.
    */
  @js.native
  sealed trait Cancelled extends OperationStatus
  /* 3 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  /**
    * The operation completed with a failure.
    */
  @js.native
  sealed trait Failed extends OperationStatus
  /* 5 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait InProgress extends OperationStatus
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /**
    * The operation object does not have the status set.
    */
  @js.native
  sealed trait NotSet extends OperationStatus
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /**
    * The operation has been queued.
    */
  @js.native
  sealed trait Queued extends OperationStatus
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
  /**
    * The operation completed successfully.
    */
  @js.native
  sealed trait Succeeded extends OperationStatus
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
}

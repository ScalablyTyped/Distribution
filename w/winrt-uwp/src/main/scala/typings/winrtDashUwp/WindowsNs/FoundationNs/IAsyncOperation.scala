package typings.winrtDashUwp.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an asynchronous operation, which returns a result upon completion. This is the return type for many Windows Runtime asynchronous methods that have results but don't report progress. */
@js.native
trait IAsyncOperation[TResult] extends IAsyncInfo {
  /** Gets or sets the method that handles the operation completed notification. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[TResult] = js.native
  /** Gets or sets the method that handles the operation completed notification. */
  def completed(asyncInfo: IAsyncOperation[TResult], asyncStatus: AsyncStatus): Unit = js.native
  /**
    * Returns the results of the operation.
    * @return The results of the operation.
    */
  def getResults(): TResult = js.native
}


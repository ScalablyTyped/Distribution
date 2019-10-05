package typings.winrtDashUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an asynchronous operation that can report progress updates to callers. This is the return type for many Windows Runtime asynchronous methods that have results and also report progress. */
@js.native
trait IAsyncOperationWithProgress[TResult, TProgress] extends IAsyncInfo {
  /** Gets or sets the method that handles the operation completed notification. */
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.native
  /** Gets or sets the method that handles progress notifications. */
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress] = js.native
  /** Gets or sets the method that handles the operation completed notification. */
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit = js.native
  /**
    * Returns the results of the operation.
    * @return The results of the operation.
    */
  def getResults(): TResult = js.native
  /** Gets or sets the method that handles progress notifications. */
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit = js.native
}


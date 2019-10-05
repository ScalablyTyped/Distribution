package typings.winrtDashUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an asynchronous action that can report progress updates to callers. This is the return type for all Windows Runtime asynchronous methods that don't have a result object, but do report progress to callback listeners. */
@js.native
trait IAsyncActionWithProgress[TProgress] extends IAsyncInfo {
  /** Gets or sets the method that handles the action completed notification. */
  @JSName("completed")
  var completed_Original: AsyncActionWithProgressCompletedHandler[TProgress] = js.native
  /** Gets or sets the callback method that receives progress notification. */
  @JSName("progress")
  var progress_Original: AsyncActionProgressHandler[TProgress] = js.native
  /** Gets or sets the method that handles the action completed notification. */
  def completed(asyncInfo: IAsyncActionWithProgress[TProgress], asyncStatus: AsyncStatus): Unit = js.native
  /** Returns the results of the action. */
  def getResults(): Unit = js.native
  /** Gets or sets the callback method that receives progress notification. */
  def progress(asyncInfo: IAsyncActionWithProgress[TProgress], progressInfo: TProgress): Unit = js.native
}


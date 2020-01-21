package typings.winrt

import typings.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typings.winrt.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompleted[TResult, TProgress] extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress] = js.native
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): TResult = js.native
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit = js.native
}


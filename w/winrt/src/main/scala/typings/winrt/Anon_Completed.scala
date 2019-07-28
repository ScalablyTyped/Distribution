package typings.winrt

import typings.winrt.WindowsNs.FoundationNs.AsyncOperationProgressHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationWithProgressCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Completed[TResult, TProgress] extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress] = js.native
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): TResult = js.native
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit = js.native
}


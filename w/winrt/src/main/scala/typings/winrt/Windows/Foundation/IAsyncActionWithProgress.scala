package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncActionWithProgress[TProgress]
  extends IAsyncInfo
     with IPromise[Unit] {
  @JSName("completed")
  var completed_Original: AsyncActionWithProgressCompletedHandler[TProgress] = js.native
  @JSName("progress")
  var progress_Original: AsyncActionProgressHandler[TProgress] = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  def completed(asyncInfo: IAsyncActionWithProgress[TProgress], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): Unit = js.native
  def progress(asyncInfo: IAsyncActionWithProgress[TProgress], progressInfo: TProgress): Unit = js.native
}


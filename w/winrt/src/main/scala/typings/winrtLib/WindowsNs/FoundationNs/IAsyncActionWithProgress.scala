package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncActionWithProgress[TProgress]
  extends IAsyncInfo
     with IPromise[scala.Unit] {
  @JSName("completed")
  var completed_Original: AsyncActionWithProgressCompletedHandler[TProgress] = js.native
  @JSName("progress")
  var progress_Original: AsyncActionProgressHandler[TProgress] = js.native
  /* InferMemberOverrides */
  override def cancel(): scala.Unit = js.native
  def completed(asyncInfo: IAsyncActionWithProgress[TProgress], asyncStatus: AsyncStatus): scala.Unit = js.native
  def getResults(): scala.Unit = js.native
  def progress(asyncInfo: IAsyncActionWithProgress[TProgress], progressInfo: TProgress): scala.Unit = js.native
}


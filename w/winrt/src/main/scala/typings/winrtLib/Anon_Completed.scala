package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Completed[TResult, TProgress] extends js.Object {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.native
  @JSName("progress")
  var progress_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationProgressHandler[TResult, TProgress] = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[TResult, TProgress],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): TResult = js.native
  def progress(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[TResult, TProgress],
    progressInfo: TProgress
  ): scala.Unit = js.native
}


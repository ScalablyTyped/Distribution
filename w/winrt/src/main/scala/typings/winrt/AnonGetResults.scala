package typings.winrt

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetResults[TResult] extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[TResult] = js.native
  def completed(asyncInfo: IAsyncOperation[TResult], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): TResult = js.native
}


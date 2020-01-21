package typings.winrt

import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompletedGetResultsAny extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[_] = js.native
  def completed(asyncInfo: IAsyncOperation[_], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): js.Any = js.native
}


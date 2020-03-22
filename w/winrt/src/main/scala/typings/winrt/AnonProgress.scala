package typings.winrt

import typings.winrt.Windows.Devices.Sms.ISmsMessage
import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProgress extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[IVectorView[ISmsMessage]] = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[ISmsMessage], Double] = js.native
  def completed(asyncInfo: IAsyncOperation[IVectorView[ISmsMessage]], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): IVectorView[ISmsMessage] = js.native
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], progressInfo: Double): Unit = js.native
}


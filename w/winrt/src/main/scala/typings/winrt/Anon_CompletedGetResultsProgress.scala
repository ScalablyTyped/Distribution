package typings.winrt

import typings.winrt.WindowsNs.DevicesNs.SmsNs.ISmsMessage
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationProgressHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CompletedGetResultsProgress extends js.Object {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[IVectorView[ISmsMessage]] = js.native
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[ISmsMessage], Double] = js.native
  def completed(asyncInfo: IAsyncOperation[IVectorView[ISmsMessage]], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): IVectorView[ISmsMessage] = js.native
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], progressInfo: Double): Unit = js.native
}


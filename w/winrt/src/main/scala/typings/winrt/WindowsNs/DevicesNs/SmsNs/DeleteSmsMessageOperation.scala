package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.winrt.Anon_CompletedGetResultsAny
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
@js.native
class DeleteSmsMessageOperation () extends IAsyncAction {
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  var operation: Anon_CompletedGetResultsAny = js.native
  /* CompleteClass */
  override var status: AsyncStatus = js.native
  /* CompleteClass */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessageOperation[U](): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessageOperation[U](success: js.Function1[/* value */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessageOperation[U](success: js.Function1[/* value */ js.Any, _], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessageOperation[U](
    success: js.Function1[/* value */ js.Any, _],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def `then`[U](success: js.Function1[/* value */ js.Any, IPromise[U] | U]): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ js.Any, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ js.Any, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
}


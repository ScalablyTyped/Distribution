package typings.winrt.Windows.Devices.Sms

import typings.winrt.AnonCompletedGetResultsAny
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
@js.native
class SendSmsMessageOperation () extends IAsyncAction {
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  var operation: AnonCompletedGetResultsAny = js.native
  /* CompleteClass */
  override var status: AsyncStatus = js.native
  /* CompleteClass */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[_]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[_], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](
    success: js.Function0[_],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
}


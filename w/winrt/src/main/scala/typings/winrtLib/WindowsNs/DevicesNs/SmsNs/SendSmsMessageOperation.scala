package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
@js.native
class SendSmsMessageOperation ()
  extends winrtLib.WindowsNs.FoundationNs.IAsyncAction {
  /* CompleteClass */
  override var errorCode: scala.Double = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  var operation: winrtLib.Anon_AsyncInfoAsyncStatusCompleted = js.native
  /* CompleteClass */
  override var status: winrtLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](): scala.Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[_]): scala.Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[_], error: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](
    success: js.Function0[_],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}


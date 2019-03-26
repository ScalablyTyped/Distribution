package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
@js.native
class DeleteSmsMessageOperation ()
  extends winrtLib.WindowsNs.FoundationNs.IAsyncAction {
  /* CompleteClass */
  override var errorCode: scala.Double = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  var operation: winrtLib.Anon_CompletedGetResultsAny = js.native
  /* CompleteClass */
  override var status: winrtLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessageOperation[U](): scala.Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessageOperation[U](success: js.Function1[/* value */ js.Any, _]): scala.Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessageOperation[U](success: js.Function1[/* value */ js.Any, _], error: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessageOperation[U](
    success: js.Function1[/* value */ js.Any, _],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def `then`[U](success: js.Function1[/* value */ js.Any, winrtLib.WindowsNs.FoundationNs.IPromise[U] | U]): winrtLib.WindowsNs.FoundationNs.IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ js.Any, winrtLib.WindowsNs.FoundationNs.IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, winrtLib.WindowsNs.FoundationNs.IPromise[U] | U]
  ): winrtLib.WindowsNs.FoundationNs.IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ js.Any, winrtLib.WindowsNs.FoundationNs.IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, winrtLib.WindowsNs.FoundationNs.IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): winrtLib.WindowsNs.FoundationNs.IPromise[U] = js.native
}


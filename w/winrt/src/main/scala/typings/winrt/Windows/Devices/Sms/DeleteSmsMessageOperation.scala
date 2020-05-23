package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IPromise
import typings.winrt.anon.CompletedGetResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSmsMessageOperation extends IAsyncAction {
  var operation: CompletedGetResults = js.native
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


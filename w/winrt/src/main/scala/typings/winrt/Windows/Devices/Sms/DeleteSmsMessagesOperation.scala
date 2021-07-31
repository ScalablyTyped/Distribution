package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IPromise
import typings.winrt.anon.CompletedGetResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSmsMessagesOperation
  extends StObject
     with IAsyncAction {
  
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: js.Function1[/* value */ js.Any, js.Any]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: js.Function1[/* value */ js.Any, js.Any], error: js.Function1[/* error */ js.Any, js.Any]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](
    success: js.Function1[/* value */ js.Any, js.Any],
    error: js.Function1[/* error */ js.Any, js.Any],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](
    success: js.Function1[/* value */ js.Any, js.Any],
    error: Unit,
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: Unit, error: js.Function1[/* error */ js.Any, js.Any]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](
    success: Unit,
    error: js.Function1[/* error */ js.Any, js.Any],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ js.Any, Unit]): Unit = js.native
  
  var operation: CompletedGetResults = js.native
  
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
  def `then`[U](
    success: js.Function1[/* value */ js.Any, IPromise[U] | U],
    error: Unit,
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
}

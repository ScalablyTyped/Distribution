package typings.winrt.Windows.Security.Authentication.OnlineId

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.anon.CompletedGetResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignOutUserOperation extends IAsyncAction {
  var operation: CompletedGetResults = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](
    success: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](success: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](success: js.Function0[_]): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](
    success: js.Function0[_],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](success: js.Function0[_], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  @JSName("done")
  def done_MSignOutUserOperation[U](
    success: js.Function0[_],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
}


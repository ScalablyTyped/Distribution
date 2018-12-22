package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[TResult]
  extends stdLib.PromiseLike[TResult] {
  def cancel(): scala.Unit = js.native
  def done[U](): scala.Unit = js.native
  def done[U](success: js.Function1[/* value */ TResult, _]): scala.Unit = js.native
  def done[U](success: js.Function1[/* value */ TResult, _], error: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def done[U](
    success: js.Function1[/* value */ TResult, _],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def `then`[U](
    success: js.Function1[/* value */ TResult, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): IPromise[U] = js.native
}


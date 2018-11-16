package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncAction extends IAsyncInfo {
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  var done: js.UndefOr[
    js.Function3[
      /* success */ js.UndefOr[js.Function0[_]], 
      /* error */ js.UndefOr[js.Function1[/* error */ js.Any, _]], 
      /* progress */ js.UndefOr[js.Function1[/* progress */ js.Any, scala.Unit]], 
      scala.Unit
    ]
  ] = js.native
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): scala.Unit = js.native
  def getResults(): scala.Unit = js.native
  def `then`[U](): js.Any = js.native
  def `then`[U](success: js.Function0[_ | U]): js.Any = js.native
  def `then`[U](success: js.Function0[_ | U], error: js.Function1[/* error */ js.Any, _ | U]): js.Any = js.native
  def `then`[U](
    success: js.Function0[_ | U],
    error: js.Function1[/* error */ js.Any, _ | U],
    progress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): js.Any = js.native
}


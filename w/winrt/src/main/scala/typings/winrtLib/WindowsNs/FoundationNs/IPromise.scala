package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T] extends js.Object {
  var addEventListener: js.UndefOr[
    js.Function3[
      /* type */ java.lang.String, 
      /* listener */ js.Function, 
      /* capture */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.native
  var dispatchEvent: js.UndefOr[js.Function2[/* type */ java.lang.String, /* details */ js.Any, scala.Boolean]] = js.native
  var onerror: js.UndefOr[js.Function1[/* eventInfo */ stdLib.CustomEvent[_], scala.Unit]] = js.native
  var removeEventListener: js.UndefOr[
    js.Function3[
      /* eventType */ java.lang.String, 
      /* listener */ js.Function, 
      /* capture */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.native
  def cancel(): scala.Unit = js.native
  def done[U](): scala.Unit = js.native
  def done[U](success: js.Function1[/* value */ T, _]): scala.Unit = js.native
  def done[U](success: js.Function1[/* value */ T, _], error: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def done[U](
    success: js.Function1[/* value */ T, _],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def `then`[U](): IPromise[U] = js.native
  def `then`[U](success: js.Function1[/* value */ T, IPromise[U] | U]): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ T, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ T, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): IPromise[U] = js.native
}


package typings
package winjsLib.WinJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T] extends js.Object {
  def cancel(): scala.Unit = js.native
  def done[U](): scala.Unit = js.native
  def done[U](onComplete: js.Function1[/* value */ T, _]): scala.Unit = js.native
  def done[U](onComplete: js.Function1[/* value */ T, _], onError: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  def done[U](
    onComplete: js.Function1[/* value */ T, _],
    onError: js.Function1[/* error */ js.Any, _],
    onProgress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def `then`[U](): IPromise[U] = js.native
  def `then`[U](onComplete: js.Function1[/* value */ T, IPromise[U] | U | scala.Unit]): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | scala.Unit],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | scala.Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | scala.Unit],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | scala.Unit],
    onProgress: js.Function1[/* progress */ js.Any, scala.Unit]
  ): IPromise[U] = js.native
}


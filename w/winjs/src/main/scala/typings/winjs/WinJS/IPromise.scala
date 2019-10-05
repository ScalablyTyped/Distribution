package typings.winjs.WinJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T] extends js.Object {
  def cancel(): Unit = js.native
  def done[U](): Unit = js.native
  def done[U](onComplete: js.Function1[/* value */ T, _]): Unit = js.native
  def done[U](onComplete: js.Function1[/* value */ T, _], onError: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def done[U](
    onComplete: js.Function1[/* value */ T, _],
    onError: js.Function1[/* error */ js.Any, _],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def `then`[U](): IPromise[U] = js.native
  def `then`[U](onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit]): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
}


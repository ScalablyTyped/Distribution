package typings.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thenable[T] extends js.Object {
  def `then`[U](): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* reason */ js.Any, U]): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U]): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U], onRejected: js.Function1[/* reason */ js.Any, U]): Thenable[U] = js.native
}


package typings.throttleDebounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("throttle-debounce", "throttle")
@js.native
object throttle extends js.Object {
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, callback: T): throttle[T] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, callback: T, debounceMode: Boolean): throttle[T] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, noTrailing: Boolean, callback: T): throttle[T] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, noTrailing: Boolean, callback: T, debounceMode: Boolean): throttle[T] = js.native
}


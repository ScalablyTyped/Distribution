package typings.throttleDebounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("throttle-debounce", "debounce")
@js.native
object debounce extends js.Object {
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, atBegin: Boolean, callback: T): debounce[T] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, callback: T): debounce[T] = js.native
}


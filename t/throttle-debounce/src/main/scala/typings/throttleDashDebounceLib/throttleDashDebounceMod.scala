package typings
package throttleDashDebounceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("throttle-debounce", JSImport.Namespace)
@js.native
object throttleDashDebounceMod extends js.Object {
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: scala.Double, atBegin: scala.Boolean, callback: T): T = js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: scala.Double, callback: T): T = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: scala.Double, callback: T): T = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: scala.Double, callback: T, debounceMode: scala.Boolean): T = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: scala.Double, noTrailing: scala.Boolean, callback: T): T = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: scala.Double, noTrailing: scala.Boolean, callback: T, debounceMode: scala.Boolean): T = js.native
}


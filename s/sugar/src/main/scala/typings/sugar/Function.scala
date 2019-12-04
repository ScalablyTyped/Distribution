package typings.sugar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function extends js.Object {
  def after(n: Double): Function = js.native
  def cancel(): Function = js.native
  def debounce(): Function = js.native
  def debounce(ms: Double): Function = js.native
  def delay(): Function = js.native
  def delay(ms: Double, args: js.Any*): Function = js.native
  def every(): Function = js.native
  def every(ms: Double, args: js.Any*): Function = js.native
  def `lazy`(): Function = js.native
  def `lazy`(ms: Double): Function = js.native
  def `lazy`(ms: Double, immediate: Boolean): Function = js.native
  def `lazy`(ms: Double, immediate: Boolean, limit: Double): Function = js.native
  def lock(): Function = js.native
  def lock(n: Double): Function = js.native
  def memoize(): Function = js.native
  def memoize(hashFn: java.lang.String): Function = js.native
  def memoize(hashFn: java.lang.String, limit: Double): Function = js.native
  def memoize(hashFn: Function): Function = js.native
  def memoize(hashFn: Function, limit: Double): Function = js.native
  def once(): Function = js.native
  def partial(args: js.Any*): Function = js.native
  def throttle(): Function = js.native
  def throttle(ms: Double): Function = js.native
}


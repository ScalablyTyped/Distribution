package typings.sugar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function extends StObject {
  
  def after(n: Double): Function = js.native
  
  def cancel(): Function = js.native
  
  def debounce(): Function = js.native
  def debounce(ms: Double): Function = js.native
  
  def delay(ms: js.UndefOr[scala.Nothing], args: js.Any*): Function = js.native
  def delay(ms: Double, args: js.Any*): Function = js.native
  
  def every(ms: js.UndefOr[scala.Nothing], args: js.Any*): Function = js.native
  def every(ms: Double, args: js.Any*): Function = js.native
  
  def `lazy`(): Function = js.native
  def `lazy`(ms: js.UndefOr[scala.Nothing], immediate: js.UndefOr[scala.Nothing], limit: Double): Function = js.native
  def `lazy`(ms: js.UndefOr[scala.Nothing], immediate: Boolean): Function = js.native
  def `lazy`(ms: js.UndefOr[scala.Nothing], immediate: Boolean, limit: Double): Function = js.native
  def `lazy`(ms: Double): Function = js.native
  def `lazy`(ms: Double, immediate: js.UndefOr[scala.Nothing], limit: Double): Function = js.native
  def `lazy`(ms: Double, immediate: Boolean): Function = js.native
  def `lazy`(ms: Double, immediate: Boolean, limit: Double): Function = js.native
  
  def lock(): Function = js.native
  def lock(n: Double): Function = js.native
  
  def memoize(): Function = js.native
  def memoize(hashFn: js.UndefOr[scala.Nothing], limit: Double): Function = js.native
  def memoize(hashFn: java.lang.String): Function = js.native
  def memoize(hashFn: java.lang.String, limit: Double): Function = js.native
  def memoize(hashFn: Function): Function = js.native
  def memoize(hashFn: Function, limit: Double): Function = js.native
  
  def once(): Function = js.native
  
  def partial(args: js.Any*): Function = js.native
  
  def throttle(): Function = js.native
  def throttle(ms: Double): Function = js.native
}

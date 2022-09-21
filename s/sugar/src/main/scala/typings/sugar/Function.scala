package typings.sugar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function extends StObject {
  
  def after(n: Double): Function = js.native
  
  def cancel(): Function = js.native
  
  def debounce(): Function = js.native
  def debounce(ms: Double): Function = js.native
  
  def delay(ms: Double, args: Any*): Function = js.native
  def delay(ms: Unit, args: Any*): Function = js.native
  
  def every(ms: Double, args: Any*): Function = js.native
  def every(ms: Unit, args: Any*): Function = js.native
  
  def `lazy`(): Function = js.native
  def `lazy`(ms: Double): Function = js.native
  def `lazy`(ms: Double, immediate: Boolean): Function = js.native
  def `lazy`(ms: Double, immediate: Boolean, limit: Double): Function = js.native
  def `lazy`(ms: Double, immediate: Unit, limit: Double): Function = js.native
  def `lazy`(ms: Unit, immediate: Boolean): Function = js.native
  def `lazy`(ms: Unit, immediate: Boolean, limit: Double): Function = js.native
  def `lazy`(ms: Unit, immediate: Unit, limit: Double): Function = js.native
  
  def lock(): Function = js.native
  def lock(n: Double): Function = js.native
  
  def memoize(): Function = js.native
  def memoize(hashFn: java.lang.String): Function = js.native
  def memoize(hashFn: java.lang.String, limit: Double): Function = js.native
  def memoize(hashFn: Unit, limit: Double): Function = js.native
  def memoize(hashFn: Function): Function = js.native
  def memoize(hashFn: Function, limit: Double): Function = js.native
  
  def once(): Function = js.native
  
  def partial(args: Any*): Function = js.native
  
  def throttle(): Function = js.native
  def throttle(ms: Double): Function = js.native
}

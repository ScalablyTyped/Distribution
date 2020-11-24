package typings.stylableCore.timedCacheMod

import typings.stylableCore.anon.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/timed-cache", "timedCache")
@js.native
object timedCache extends js.Object {
  
  def apply[T /* <: js.Function1[/* repeated */ String, String] */](fn: T, hasTimeoutUseTimerCreateKey: TimedCacheOptions): Cache[T] = js.native
}

package typings.workboxDashSw.workboxDashSwMod

import typings.std.CacheQueryOptions
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== CacheFirst strategy =====
  */
trait CacheFirstOptions extends CacheOnlyOptions {
  /**
  	 * Values passed along to the
  	 * [`init`](https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch#Parameters)
  	 */
  var fetchOptions: RequestInit
}

object CacheFirstOptions {
  @scala.inline
  def apply(
    cacheName: String,
    fetchOptions: RequestInit,
    matchOptions: CacheQueryOptions,
    plugins: js.Array[Plugin]
  ): CacheFirstOptions = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, fetchOptions = fetchOptions, matchOptions = matchOptions, plugins = plugins)
  
    __obj.asInstanceOf[CacheFirstOptions]
  }
}


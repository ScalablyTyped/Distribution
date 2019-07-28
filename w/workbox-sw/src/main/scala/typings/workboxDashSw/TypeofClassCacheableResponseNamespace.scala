package typings.workboxDashSw

import org.scalablytyped.runtime.Instantiable0
import typings.workboxDashSw.workboxDashSwMod.CacheableResponseConstructor
import typings.workboxDashSw.workboxDashSwMod.CacheableResponseNamespace
import typings.workboxDashSw.workboxDashSwMod.CacheableResponsePluginConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassCacheableResponseNamespace extends Instantiable0[CacheableResponseNamespace] {
  /**
  	 * This class allows you to set up rules determining what
  	 * status codes and/or headers need to be present in order for a
  	 * [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response)
  	 * to be considered cacheable.
  	 */
  val CacheableResponse: CacheableResponseConstructor = js.native
  /**
  	 * A class implementing the `cacheWillUpdate` lifecycle callback. This makes it
  	 * easier to add in cacheability checks to requests made via Workbox's built-in
  	 * strategies.
  	 */
  val Plugin: CacheableResponsePluginConstructor = js.native
}


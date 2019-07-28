package typings.workboxDashSw.workboxDashSwMod

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheResponseWillBeUsedPluginContext extends js.Object {
  val cacheName: String
  val cachedResponse: Response
  val matchOptions: js.Any
  val request: Request
}

object CacheResponseWillBeUsedPluginContext {
  @scala.inline
  def apply(cacheName: String, cachedResponse: Response, matchOptions: js.Any, request: Request): CacheResponseWillBeUsedPluginContext = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, cachedResponse = cachedResponse, matchOptions = matchOptions, request = request)
  
    __obj.asInstanceOf[CacheResponseWillBeUsedPluginContext]
  }
}


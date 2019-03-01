package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheResponseWillBeUsedPluginContext extends js.Object {
  val cacheName: java.lang.String
  val cachedResponse: stdLib.Response
  val matchOptions: js.Any
  val request: stdLib.Request
}

object CacheResponseWillBeUsedPluginContext {
  @scala.inline
  def apply(
    cacheName: java.lang.String,
    cachedResponse: stdLib.Response,
    matchOptions: js.Any,
    request: stdLib.Request
  ): CacheResponseWillBeUsedPluginContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cacheName")(cacheName)
    __obj.updateDynamic("cachedResponse")(cachedResponse)
    __obj.updateDynamic("matchOptions")(matchOptions)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[CacheResponseWillBeUsedPluginContext]
  }
}


package typings.workboxDashSw.workboxDashSwMod

import typings.std.Event
import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDidUpdatePluginContext extends js.Object {
  val cacheName: String
  val event: Event
  val newResponse: Response
  val oldResponse: Response
  val request: Request
}

object CacheDidUpdatePluginContext {
  @scala.inline
  def apply(cacheName: String, event: Event, newResponse: Response, oldResponse: Response, request: Request): CacheDidUpdatePluginContext = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, event = event, newResponse = newResponse, oldResponse = oldResponse, request = request)
  
    __obj.asInstanceOf[CacheDidUpdatePluginContext]
  }
}


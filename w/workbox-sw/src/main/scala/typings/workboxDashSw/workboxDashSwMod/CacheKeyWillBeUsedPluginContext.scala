package typings.workboxDashSw.workboxDashSwMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheKeyWillBeUsedPluginContext extends js.Object {
  val mode: String
  val request: Request
}

object CacheKeyWillBeUsedPluginContext {
  @scala.inline
  def apply(mode: String, request: Request): CacheKeyWillBeUsedPluginContext = {
    val __obj = js.Dynamic.literal(mode = mode, request = request)
  
    __obj.asInstanceOf[CacheKeyWillBeUsedPluginContext]
  }
}


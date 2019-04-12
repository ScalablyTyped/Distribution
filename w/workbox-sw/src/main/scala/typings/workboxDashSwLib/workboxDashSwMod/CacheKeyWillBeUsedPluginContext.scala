package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheKeyWillBeUsedPluginContext extends js.Object {
  val mode: java.lang.String
  val request: stdLib.Request
}

object CacheKeyWillBeUsedPluginContext {
  @scala.inline
  def apply(mode: java.lang.String, request: stdLib.Request): CacheKeyWillBeUsedPluginContext = {
    val __obj = js.Dynamic.literal(mode = mode, request = request)
  
    __obj.asInstanceOf[CacheKeyWillBeUsedPluginContext]
  }
}


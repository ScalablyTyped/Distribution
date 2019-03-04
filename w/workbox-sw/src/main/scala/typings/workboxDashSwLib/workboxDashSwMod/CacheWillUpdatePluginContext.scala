package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheWillUpdatePluginContext extends js.Object {
  val request: stdLib.Request
  val response: stdLib.Response
}

object CacheWillUpdatePluginContext {
  @scala.inline
  def apply(request: stdLib.Request, response: stdLib.Response): CacheWillUpdatePluginContext = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[CacheWillUpdatePluginContext]
  }
}


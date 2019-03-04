package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestWillFetchPluginContext extends js.Object {
  val request: stdLib.Request
}

object RequestWillFetchPluginContext {
  @scala.inline
  def apply(request: stdLib.Request): RequestWillFetchPluginContext = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[RequestWillFetchPluginContext]
  }
}


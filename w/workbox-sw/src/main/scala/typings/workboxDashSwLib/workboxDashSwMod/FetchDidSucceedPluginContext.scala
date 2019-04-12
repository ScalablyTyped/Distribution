package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchDidSucceedPluginContext extends js.Object {
  val request: stdLib.Request
  val response: stdLib.Response
}

object FetchDidSucceedPluginContext {
  @scala.inline
  def apply(request: stdLib.Request, response: stdLib.Response): FetchDidSucceedPluginContext = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[FetchDidSucceedPluginContext]
  }
}


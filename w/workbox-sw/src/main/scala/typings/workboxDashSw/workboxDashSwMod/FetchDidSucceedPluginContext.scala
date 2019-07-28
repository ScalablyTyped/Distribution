package typings.workboxDashSw.workboxDashSwMod

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchDidSucceedPluginContext extends js.Object {
  val request: Request
  val response: Response
}

object FetchDidSucceedPluginContext {
  @scala.inline
  def apply(request: Request, response: Response): FetchDidSucceedPluginContext = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[FetchDidSucceedPluginContext]
  }
}


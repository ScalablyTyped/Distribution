package typings.workboxDashCore.typesWorkboxPluginMod

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchDidSucceedCallbackParam extends js.Object {
  var request: Request
  var response: Response
}

object FetchDidSucceedCallbackParam {
  @scala.inline
  def apply(request: Request, response: Response): FetchDidSucceedCallbackParam = {
    val __obj = js.Dynamic.literal(request = request, response = response)
  
    __obj.asInstanceOf[FetchDidSucceedCallbackParam]
  }
}


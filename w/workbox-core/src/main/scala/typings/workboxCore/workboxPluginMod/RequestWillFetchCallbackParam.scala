package typings.workboxCore.workboxPluginMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestWillFetchCallbackParam extends js.Object {
  var request: Request
}

object RequestWillFetchCallbackParam {
  @scala.inline
  def apply(request: Request): RequestWillFetchCallbackParam = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestWillFetchCallbackParam]
  }
}


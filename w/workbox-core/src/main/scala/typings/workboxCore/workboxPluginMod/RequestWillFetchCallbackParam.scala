package typings.workboxCore.workboxPluginMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestWillFetchCallbackParam extends js.Object {
  var request: Request = js.native
}

object RequestWillFetchCallbackParam {
  @scala.inline
  def apply(request: Request): RequestWillFetchCallbackParam = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestWillFetchCallbackParam]
  }
  @scala.inline
  implicit class RequestWillFetchCallbackParamOps[Self <: RequestWillFetchCallbackParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}


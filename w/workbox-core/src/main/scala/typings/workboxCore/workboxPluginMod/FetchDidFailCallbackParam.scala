package typings.workboxCore.workboxPluginMod

import typings.std.Error
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchDidFailCallbackParam extends js.Object {
  var error: Error = js.native
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.native
  var originalRequest: Request = js.native
  var request: Request = js.native
}

object FetchDidFailCallbackParam {
  @scala.inline
  def apply(error: Error, originalRequest: Request, request: Request): FetchDidFailCallbackParam = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], originalRequest = originalRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchDidFailCallbackParam]
  }
  @scala.inline
  implicit class FetchDidFailCallbackParamOps[Self <: FetchDidFailCallbackParam] (val x: Self) extends AnyVal {
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalRequest(value: Request): Self = this.set("originalRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
    ): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}


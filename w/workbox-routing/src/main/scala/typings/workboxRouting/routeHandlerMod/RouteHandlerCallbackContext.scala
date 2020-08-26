package typings.workboxRouting.routeHandlerMod

import typings.std.Record
import typings.std.Request
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteHandlerCallbackContext extends js.Object {
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
  ] = js.native
  var params: js.UndefOr[js.Array[String] | (Record[String, String])] = js.native
  var request: js.UndefOr[Request] = js.native
  var url: URL = js.native
}

object RouteHandlerCallbackContext {
  @scala.inline
  def apply(url: URL): RouteHandlerCallbackContext = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteHandlerCallbackContext]
  }
  @scala.inline
  implicit class RouteHandlerCallbackContextOps[Self <: RouteHandlerCallbackContext] (val x: Self) extends AnyVal {
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
    def setUrl(value: URL): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any
    ): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setParamsVarargs(value: String*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[String] | (Record[String, String])): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
  
}


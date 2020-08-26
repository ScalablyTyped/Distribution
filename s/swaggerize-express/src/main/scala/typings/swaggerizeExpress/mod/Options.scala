package typings.swaggerizeExpress.mod

import typings.swaggerizeExpress.mod.Swagger.ApiDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var api: ApiDefinition = js.native
  var docspath: String = js.native
  var handlers: String | RouteSegment = js.native
}

object Options {
  @scala.inline
  def apply(api: ApiDefinition, docspath: String, handlers: String | RouteSegment): Options = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], docspath = docspath.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setApi(value: ApiDefinition): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocspath(value: String): Self = this.set("docspath", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandlers(value: String | RouteSegment): Self = this.set("handlers", value.asInstanceOf[js.Any])
  }
  
}


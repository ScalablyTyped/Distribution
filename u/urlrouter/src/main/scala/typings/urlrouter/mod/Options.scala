package typings.urlrouter.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var errorHandler: js.UndefOr[
    js.Function3[/* err */ Error, /* req */ ServerRequest, /* res */ ServerResponse, Unit]
  ] = js.native
  var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, Unit]] = js.native
  var paramsName: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setErrorHandler(value: (/* err */ Error, /* req */ ServerRequest, /* res */ ServerResponse) => Unit): Self = this.set("errorHandler", js.Any.fromFunction3(value))
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    @scala.inline
    def setPageNotFound(value: (/* req */ ServerRequest, /* res */ ServerResponse) => Unit): Self = this.set("pageNotFound", js.Any.fromFunction2(value))
    @scala.inline
    def deletePageNotFound: Self = this.set("pageNotFound", js.undefined)
    @scala.inline
    def setParamsName(value: String): Self = this.set("paramsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamsName: Self = this.set("paramsName", js.undefined)
  }
  
}


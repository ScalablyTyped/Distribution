package typings.xmldom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var errorHandler: js.UndefOr[ErrorHandlerFunction | ErrorHandlerObject] = js.native
  var locator: js.UndefOr[js.Any] = js.native
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
    def setErrorHandlerFunction2(value: (/* level */ String, /* msg */ js.Any) => js.Any): Self = this.set("errorHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setErrorHandler(value: ErrorHandlerFunction | ErrorHandlerObject): Self = this.set("errorHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    @scala.inline
    def setLocator(value: js.Any): Self = this.set("locator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocator: Self = this.set("locator", js.undefined)
  }
  
}


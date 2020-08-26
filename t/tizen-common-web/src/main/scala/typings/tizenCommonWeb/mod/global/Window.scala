package typings.tizenCommonWeb.mod.global

import typings.tizenCommonWeb.mod.Tizen
import typings.tizenCommonWeb.tizenMod.WebAPIException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var WebAPIError: WebAPIException = js.native
  var WebAPIException: typings.tizenCommonWeb.tizenMod.WebAPIException = js.native
  var tizen: Tizen = js.native
}

object Window {
  @scala.inline
  def apply(WebAPIError: WebAPIException, WebAPIException: WebAPIException, tizen: Tizen): Window = {
    val __obj = js.Dynamic.literal(WebAPIError = WebAPIError.asInstanceOf[js.Any], WebAPIException = WebAPIException.asInstanceOf[js.Any], tizen = tizen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setWebAPIError(value: WebAPIException): Self = this.set("WebAPIError", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAPIException(value: WebAPIException): Self = this.set("WebAPIException", value.asInstanceOf[js.Any])
    @scala.inline
    def setTizen(value: Tizen): Self = this.set("tizen", value.asInstanceOf[js.Any])
  }
  
}


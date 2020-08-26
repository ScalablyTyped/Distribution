package typings.vkOpenapi.vk.OpenAPI.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollOptions extends js.Object {
  var pageUrl: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PollOptions {
  @scala.inline
  def apply(): PollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollOptions]
  }
  @scala.inline
  implicit class PollOptionsOps[Self <: PollOptions] (val x: Self) extends AnyVal {
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
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


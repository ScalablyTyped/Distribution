package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`18`
import typings.vkOpenapi.vkOpenapiNumbers.`20`
import typings.vkOpenapi.vkOpenapiNumbers.`22`
import typings.vkOpenapi.vkOpenapiNumbers.`24`
import typings.vkOpenapi.vkOpenapiNumbers.`30`
import typings.vkOpenapi.vkOpenapiStrings.button
import typings.vkOpenapi.vkOpenapiStrings.full
import typings.vkOpenapi.vkOpenapiStrings.mini
import typings.vkOpenapi.vkOpenapiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LikeOptions extends js.Object {
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.native
  var pageImage: js.UndefOr[String] = js.native
  var pageTitle: js.UndefOr[String] = js.native
  var pageUrl: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[button | mini | vertical | full] = js.native
  var verb: js.UndefOr[NumericBoolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object LikeOptions {
  @scala.inline
  def apply(): LikeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LikeOptions]
  }
  @scala.inline
  implicit class LikeOptionsOps[Self <: LikeOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: `18` | `20` | `22` | `24` | `30`): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPageImage(value: String): Self = this.set("pageImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageImage: Self = this.set("pageImage", js.undefined)
    @scala.inline
    def setPageTitle(value: String): Self = this.set("pageTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageTitle: Self = this.set("pageTitle", js.undefined)
    @scala.inline
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
    @scala.inline
    def setType(value: button | mini | vertical | full): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerb(value: NumericBoolean): Self = this.set("verb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


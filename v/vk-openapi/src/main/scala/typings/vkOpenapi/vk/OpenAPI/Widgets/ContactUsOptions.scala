package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiNumbers.`18`
import typings.vkOpenapi.vkOpenapiNumbers.`20`
import typings.vkOpenapi.vkOpenapiNumbers.`22`
import typings.vkOpenapi.vkOpenapiNumbers.`24`
import typings.vkOpenapi.vkOpenapiNumbers.`30`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactUsOptions extends js.Object {
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ContactUsOptions {
  @scala.inline
  def apply(height: `18` | `20` | `22` | `24` | `30` = null, text: String = null): ContactUsOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactUsOptions]
  }
}


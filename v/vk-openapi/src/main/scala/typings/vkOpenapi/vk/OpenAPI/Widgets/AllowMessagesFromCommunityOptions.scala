package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiNumbers.`22`
import typings.vkOpenapi.vkOpenapiNumbers.`24`
import typings.vkOpenapi.vkOpenapiNumbers.`30`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowMessagesFromCommunityOptions extends js.Object {
  var height: js.UndefOr[`22` | `24` | `30`] = js.undefined
}

object AllowMessagesFromCommunityOptions {
  @scala.inline
  def apply(height: `22` | `24` | `30` = null): AllowMessagesFromCommunityOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowMessagesFromCommunityOptions]
  }
}


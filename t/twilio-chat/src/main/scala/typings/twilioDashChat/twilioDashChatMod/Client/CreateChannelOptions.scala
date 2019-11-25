package typings.twilioDashChat.twilioDashChatMod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var friendlyName: js.UndefOr[String] = js.undefined
  var isPrivate: js.UndefOr[Boolean] = js.undefined
  var uniqueName: js.UndefOr[String] = js.undefined
}

object CreateChannelOptions {
  @scala.inline
  def apply(
    attributes: js.Object = null,
    friendlyName: String = null,
    isPrivate: js.UndefOr[Boolean] = js.undefined,
    uniqueName: String = null
  ): CreateChannelOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrivate)) __obj.updateDynamic("isPrivate")(isPrivate.asInstanceOf[js.Any])
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelOptions]
  }
}


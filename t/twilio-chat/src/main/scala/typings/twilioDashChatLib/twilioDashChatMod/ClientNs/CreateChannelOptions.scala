package typings
package twilioDashChatLib.twilioDashChatMod.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var isPrivate: js.UndefOr[scala.Boolean] = js.undefined
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
}

object CreateChannelOptions {
  @scala.inline
  def apply(
    attributes: js.Object = null,
    friendlyName: java.lang.String = null,
    isPrivate: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueName: java.lang.String = null
  ): CreateChannelOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (!js.isUndefined(isPrivate)) __obj.updateDynamic("isPrivate")(isPrivate)
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.asInstanceOf[CreateChannelOptions]
  }
}

